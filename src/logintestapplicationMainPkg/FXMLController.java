/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package logintestapplicationMainPkg;

import java.io.IOException;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;
import java.util.ResourceBundle;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import static javafx.scene.control.Alert.AlertType.INFORMATION;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.input.KeyEvent;
import javafx.scene.input.MouseEvent;
import javafx.scene.control.Alert;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;


public class FXMLController implements Initializable {
    @FXML
    private BorderPane borderPaneId;
    @FXML
    private TextField useremailTextfield;
    @FXML
    private PasswordField passwordField;
    @FXML
    private Label lblEmailError;
    @FXML
    private Label lblpassworderror;
    
    private Map <String, String> emailPasswordContainer;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO

        emailPasswordContainer = RegistrationHandler.loadRegisteredUsers();
    }    

    private boolean isValidEmail(String email) {
        String emailPattern = "^(.+)@voltedge\\.co\\.bd$";
        Pattern pattern = Pattern.compile(emailPattern);
        Matcher matcher = pattern.matcher(email);
        return matcher.matches();
    }
    
    private boolean isValidPassword(String password){
        String passPattern = "^(?=.*[a-z])(?=.*[A-Z])(?=.*\\d)(?=.*[@#$%^&+=!]).{8,}$";
        Pattern pattern = Pattern.compile(passPattern);
        Matcher matcher = pattern.matcher(password);
        return matcher.matches();
    }
    
    @FXML
    private void ValidationProcess(MouseEvent event) {
        String email = useremailTextfield.getText().trim();
        String pass = passwordField.getText();
        if (isValidEmail(email)) {
            lblEmailError.setVisible(false);
            useremailTextfield.setStyle("-fx-border-color: transparent;");
        } else {
            lblEmailError.setText("Invalid Email");
            lblEmailError.setVisible(true);
            useremailTextfield.setStyle("-fx-border-color: red;");
        }
        if ( isValidPassword(pass) ){
            lblpassworderror.setVisible(false);
            passwordField.setStyle("-fx-border-color: transparent");
        }
        else{
            lblpassworderror.setText("*Password must content" + "\n" +
                                    "*One Lowercase letter" + "\n" + 
                                    "*One Uppercase letter" + "\n" +
                                    "*One digit" + "\n" +
                                    "*One special character");
            lblpassworderror.setVisible(true);
            passwordField.setStyle("-fx-border-color: red;");
        }
    }

    @FXML
    private void LoginButtonOnClick(ActionEvent event) throws IOException{
        String email = useremailTextfield.getText().trim();
    String pass = passwordField.getText();
    boolean validLogin = false;

    if (isValidEmail(email) && isValidPassword(pass)) {
        Map<String, String> registeredUsers = RegistrationHandler.loadRegisteredUsers();
        String storedPassword = registeredUsers.get(email);
        if (storedPassword != null && storedPassword.equals(pass)) {
            validLogin = true;
        }
    }

    if (validLogin) {
        Parent xDashboardViewParent = FXMLLoader.load(getClass().getResource("Dashboard.fxml"));
        Scene xDashboardViewScene = new Scene(xDashboardViewParent);
        //Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
        Stage newWindow  = new Stage();
        
        newWindow.setTitle("Dashboard");
        newWindow.setScene(xDashboardViewScene);
        newWindow.show();
    } else {
        Alert alert = new Alert(AlertType.ERROR);
        alert.setTitle("Error");
        alert.setHeaderText("Login Attempt Failed.");
        alert.setContentText("Invalid Email & Password Combination.");
        alert.showAndWait();
    }
    }

    @FXML
    private void usernameTextFieldOnAction(KeyEvent event) {
        lblEmailError.setVisible(false);
        useremailTextfield.setStyle("-fx-border-color: transparent;");
    }

    @FXML
    private void passwordTextFieldOnAction(KeyEvent event) {
            lblpassworderror.setVisible(false);
            passwordField.setStyle("-fx-border-color: transparent;");
    }
    @FXML
    private void RegisterButtonOnClick(ActionEvent event) {
        String email = useremailTextfield.getText().trim();
        String pass = passwordField.getText();

        if (isValidEmail(email) && isValidPassword(pass)) {
            // Register the user
            RegistrationHandler.registerUser(email, pass);

            Alert alert = new Alert(AlertType.INFORMATION);
            alert.setTitle("Registration Successful");
            alert.setHeaderText("Registration Successful");
            alert.setContentText("User registered successfully!");
            alert.showAndWait();
        } else {
            Alert alert = new Alert(AlertType.ERROR);
            alert.setTitle("Registration Error");
            alert.setHeaderText("Registration Failed");
            alert.setContentText("Invalid email or password. Please check the requirements.");
            alert.showAndWait();
        }
    }
}


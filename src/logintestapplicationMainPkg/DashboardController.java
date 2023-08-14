/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package logintestapplicationMainPkg;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author farhan
 */
public class DashboardController implements Initializable {

    @FXML
    private BorderPane borderPaneId;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void SelectUserAdmin(ActionEvent event) {
    }

    @FXML
    private void SelectUserCustomer(ActionEvent event) throws IOException{
        Parent CustomerDashboardViewParent = FXMLLoader.load(getClass().getResource("CustomerDashboard.fxml"));
        Scene CustomerDashboardViewScene = new Scene(CustomerDashboardViewParent);
        //Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
        Stage newWindow  = new Stage();
        
        newWindow.setTitle("Customer");
        newWindow.setScene(CustomerDashboardViewScene);
        newWindow.show();
    }

    @FXML
    private void SelectUserFinance(ActionEvent event) {
    }

    @FXML
    private void SelectUserHRM(ActionEvent event) {
    }

    @FXML
    private void SelectUserEngineer(ActionEvent event) {
    }

    @FXML
    private void SelectECO(ActionEvent event) throws IOException{
        Parent EcoLandingPageViewParent = FXMLLoader.load(getClass().getResource("ECOLandingPage.fxml"));
        Scene EcoLandingPageViewScene = new Scene(EcoLandingPageViewParent);
        //Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
        Stage newWindow  = new Stage();
        
        newWindow.setTitle("Environment Compliance Officer");
        newWindow.setScene(EcoLandingPageViewScene);
        newWindow.show();
        
        
    }
    
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package logintestapplicationMainPkg;

import java.net.URL;
import java.time.LocalDate;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TextField;

/**
 * FXML Controller class
 *
 * @author User
 */
public class ConnectionApplyDashboardController implements Initializable {

    @FXML
    private TextField connectionNameTextfield;
    @FXML
    private TextField conncetionLocationTextfield;
    @FXML
    private TextField plantidTextfield;
    @FXML
    private DatePicker applydateDatepicker;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void applyForconnectionOnaction(ActionEvent event) {
        String connectionName=connectionNameTextfield.getText();
        String connectionLocation = conncetionLocationTextfield.getText();
        Integer plantID = Integer.parseInt(plantidTextfield.getText());
        LocalDate connectionDate = applydateDatepicker.getValue();
        ConnectionFileHandling.applyForConnection(connectionName, connectionLocation, plantID, connectionDate);
   
        
        System.out.println("Button clicked! Applied For Connection");
    }
    
}

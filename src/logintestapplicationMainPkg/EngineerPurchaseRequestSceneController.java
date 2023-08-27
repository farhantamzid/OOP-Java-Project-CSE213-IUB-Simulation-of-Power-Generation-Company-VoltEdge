/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package logintestapplicationMainPkg;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextField;

/**
 * FXML Controller class
 *
 * @author farhan
 */
public class EngineerPurchaseRequestSceneController implements Initializable {

    @FXML
    private ComboBox<String> generatorTypeComboBox;
    @FXML
    private TextField generatorIdTextField;
    @FXML
    private TextField generatorCapacityTextField;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        generatorTypeComboBox.getItems().addAll("Turbine","Solar","Coal");
        
        
        // TODO
    }    

    @FXML
    private void submitPurchaseRequestButtonOnClick(ActionEvent event) {
        if (generatorIdTextField.getText().isEmpty() || generatorTypeComboBox.getValue() == null ||
            generatorCapacityTextField.getText().isEmpty()) {
            
            
            alert.show("Please fill in all the fields.");
            
            
        } else {
        Generator.showGenerators();
        
        
        
        Generator.newTurbine(Integer.parseInt(generatorIdTextField.getText()),generatorTypeComboBox.getValue(),Integer.parseInt(generatorCapacityTextField.getText()));
        alert.show("Request Submitted Succesfully.");
        }
    }
    
}

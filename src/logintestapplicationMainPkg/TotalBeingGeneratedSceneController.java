/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package logintestapplicationMainPkg;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;

/**
 * FXML Controller class
 *
 * @author farhan
 */
public class TotalBeingGeneratedSceneController implements Initializable {

    @FXML
    private Label renewableLabel;
    @FXML
    private Label nonRenewableLabel;
    @FXML
    private Label totalLabel;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        
        renewableLabel.setText(String.valueOf(liveCalculation.Renewable()));
        nonRenewableLabel.setText(String.valueOf(liveCalculation.NonRenewable()));
        totalLabel.setText(String.valueOf(liveCalculation.totalPower()));
        
        
        
        
        
        // TODO
    }    
    
}

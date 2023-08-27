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
import javafx.scene.control.TextField;

/**
 * FXML Controller class
 *
 * @author farhan
 */
public class ApplyLeaveSceneController implements Initializable {

    @FXML
    private TextField nameTF;
    @FXML
    private TextField reasonTF;
    @FXML
    private TextField typeTF;
    @FXML
    private TextField durationTF;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        
        // TODO
    }    

    @FXML
    private void applyButtonOnClick(ActionEvent event) {
        
        leaveRequest.newLeave(nameTF.getText(), typeTF.getText(), durationTF.getText(),reasonTF.getText());
        alert.show("Applied.");
        
        
    }
    
}

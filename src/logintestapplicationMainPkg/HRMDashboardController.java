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
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author farhan
 */
public class HRMDashboardController implements Initializable {

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void approveLeaveButtonOnClick(ActionEvent event) throws IOException {
        
        Parent leaveRequestSceneViewParent = FXMLLoader.load(getClass().getResource("leaveRequestScene.fxml"));
        Scene leaveRequestSceneViewScene = new Scene(leaveRequestSceneViewParent);

        Stage newWindow  = new Stage();
        
        newWindow.setTitle("Approve or Deny Leave");
        newWindow.setScene(leaveRequestSceneViewScene);
        newWindow.show();
        
        
        
        
        
    }

    @FXML
    private void applyLeaveButtonOnClick(ActionEvent event) throws IOException {
        Parent applyLeaveSceneViewParent = FXMLLoader.load(getClass().getResource("applyLeaveScene.fxml"));
        Scene applyLeaveSceneViewScene = new Scene(applyLeaveSceneViewParent);

        Stage newWindow  = new Stage();
        
        newWindow.setTitle("Apply for leave.");
        newWindow.setScene(applyLeaveSceneViewScene);
        newWindow.show();
        
        
    }
    
}

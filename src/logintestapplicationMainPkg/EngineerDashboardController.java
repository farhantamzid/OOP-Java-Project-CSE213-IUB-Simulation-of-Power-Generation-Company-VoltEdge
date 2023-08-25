/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package logintestapplicationMainPkg;

import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
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
public class EngineerDashboardController implements Initializable {

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void generatorOffButtonOnClick(ActionEvent event) throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("EngineerDashboard.fxml"));
        Parent EngineerDashboardViewParent = loader.load();
        Scene EngineerDashboardViewScene = new Scene(EngineerDashboardViewParent);

        // Get the reference to the root of the FXML file
        Parent root = borderPaneId.getScene().getRoot();

        // Set the new scene in the existing window
        Stage window = (Stage) root.getScene().getWindow();
        window.setScene(EngineerDashboardViewScene);
        
        

    }
    
    
    
}
        
        
        
    


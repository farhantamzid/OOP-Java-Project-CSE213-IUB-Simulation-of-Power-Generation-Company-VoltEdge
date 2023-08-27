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
import javafx.scene.control.MenuItem;
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
        
        Parent generatorOnOffSceneViewParent = FXMLLoader.load(getClass().getResource("generatorOnOffScene.fxml"));
        Scene generatorOnOffSceneViewScene = new Scene(generatorOnOffSceneViewParent);
        //Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
        Stage newWindow  = new Stage();
        
        newWindow.setTitle("Customer");
        newWindow.setScene(generatorOnOffSceneViewScene);
        newWindow.show();
        
        

        

    }

    @FXML
    private void applyForNewGeneratorButtonOnClick(ActionEvent event) throws IOException {
        
        Parent engineerPurchaseRequestSceneViewParent = FXMLLoader.load(getClass().getResource("engineerPurchaseRequestScene.fxml"));
        Scene engineerPurchaseRequestSceneViewScene = new Scene(engineerPurchaseRequestSceneViewParent);
        //Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
        Stage newWindow  = new Stage();
        
        newWindow.setTitle("Customer");
        newWindow.setScene(engineerPurchaseRequestSceneViewScene);
        newWindow.show();
    }

    @FXML
    private void showLiveButtonOnClick(ActionEvent event) throws IOException {
        
        Parent totalBeingGeneratedSceneViewParent = FXMLLoader.load(getClass().getResource("totalBeingGeneratedScene.fxml"));
        Scene totalBeingGeneratedSceneViewScene = new Scene(totalBeingGeneratedSceneViewParent);
        //Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
        Stage newWindow  = new Stage();
        
        newWindow.setTitle("Live Generation Info");
        newWindow.setScene(totalBeingGeneratedSceneViewScene);
        newWindow.show();
    }

    @FXML
    private void viewChartButtonOnClick(ActionEvent event) throws IOException {
        
        Parent powerGenerationDistributionBarChartSceneViewParent = FXMLLoader.load(getClass().getResource("powerGenerationDistributionBarChartScene.fxml"));
        Scene powerGenerationDistributionBarChartSceneViewScene = new Scene(powerGenerationDistributionBarChartSceneViewParent);
        //Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
        Stage newWindow  = new Stage();
        
        newWindow.setTitle("Customer");
        newWindow.setScene(powerGenerationDistributionBarChartSceneViewScene);
        newWindow.show();
    }

    @FXML
    private void flagForRepairButtonOnClick(ActionEvent event) throws IOException {
                
        Parent flagForRepairViewParent = FXMLLoader.load(getClass().getResource("flagForRepair.fxml"));
        Scene flagForRepairViewScene = new Scene(flagForRepairViewParent);
        //Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
        Stage newWindow  = new Stage();
        
        newWindow.setTitle("Customer");
        newWindow.setScene(flagForRepairViewScene);
        newWindow.show();
    }

    @FXML
    private void confirmRepairButtonOnClick(ActionEvent event) throws IOException {
        Parent ConfirmRepairSceneViewParent = FXMLLoader.load(getClass().getResource("ConfirmRepairScene.fxml"));
        Scene ConfirmRepairSceneViewScene = new Scene(ConfirmRepairSceneViewParent);
        //Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
        Stage newWindow  = new Stage();
        
        newWindow.setTitle("Customer");
        newWindow.setScene(ConfirmRepairSceneViewScene);
        newWindow.show();
    }
    

    @FXML
    private void showRepairHistoryButtonOnClick(ActionEvent event) throws IOException {
        
        Parent viewRepairHistorySceneViewParent = FXMLLoader.load(getClass().getResource("viewRepairHistoryScene.fxml"));
        Scene viewRepairHistorySceneViewScene = new Scene(viewRepairHistorySceneViewParent);
        //Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
        Stage newWindow  = new Stage();
        
        newWindow.setTitle("Customer");
        newWindow.setScene(viewRepairHistorySceneViewScene);
        newWindow.show();
    }
        
    }
    
    
    

        
        
        
    


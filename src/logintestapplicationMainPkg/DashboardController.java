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
 * @author user
 */
public class DashboardController implements Initializable {

    @FXML
    private BorderPane borderPaneId;

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    


    @FXML
    private void SelectUserCustomer(ActionEvent event) throws IOException{
        Parent CustomerDashboardViewParent = FXMLLoader.load(getClass().getResource("CustomerDashboard.fxml"));
        Scene CustomerDashboardViewScene = new Scene(CustomerDashboardViewParent);
        
        Stage newWindow  = new Stage();
        
        newWindow.setTitle("Customer Dashboard");
        newWindow.setScene(CustomerDashboardViewScene);
        newWindow.show();
    }

    @FXML
    private void SelectUserFinance(ActionEvent event) throws IOException {
        Parent FinancemanagerDashboardViewParent = FXMLLoader.load(getClass().getResource("FinancemanagerDashboard.fxml"));
        Scene FinancemanagerDashboardViewScene = new Scene(FinancemanagerDashboardViewParent);
        
        Stage newWindow  = new Stage();
        
        newWindow.setTitle("Finance Dashboard");
        newWindow.setScene(FinancemanagerDashboardViewScene);
        newWindow.show();
    }

    @FXML
    private void SelectUserHRM(ActionEvent event) throws IOException {
        Parent HrmDashboardViewParent = FXMLLoader.load(getClass().getResource("HrmDashboard.fxml"));
        Scene HrmDashboardViewScene = new Scene(HrmDashboardViewParent);
        
        Stage newWindow  = new Stage();
        
        newWindow.setTitle("HRM Dashboard");
        newWindow.setScene(HrmDashboardViewScene);
        newWindow.show();
    }

    @FXML
    private void SelectUserEngineer(ActionEvent event) throws IOException {
        Parent EngineerDashboardViewParent = FXMLLoader.load(getClass().getResource("EngineerDashboard.fxml"));
        Scene EngineerDashboardViewScene = new Scene(EngineerDashboardViewParent);
        
        Stage newWindow  = new Stage();
        
        newWindow.setTitle("Engineer Dashboard");
        newWindow.setScene(EngineerDashboardViewScene);
        newWindow.show();
    }
    @FXML
    private void SelectECO(ActionEvent event) throws IOException{
        Parent EcoLandingPageViewParent = FXMLLoader.load(getClass().getResource("/sceneECO/LandingPageECO.fxml"));
        Scene EcoLandingPageViewScene = new Scene(EcoLandingPageViewParent);
        
        Stage newWindow  = new Stage();
        
        newWindow.setTitle("Environment Compliance Officer");
        newWindow.setScene(EcoLandingPageViewScene);
        newWindow.show();
        
        
    }

    @FXML
    private void SelectDataAnalyst(ActionEvent event) throws IOException {
        Parent CustomerDashboardViewParent = FXMLLoader.load(getClass().getResource("/sceneDataAnalyst/LandingPageDataAnalyst.fxml"));
        Scene CustomerDashboardViewScene = new Scene(CustomerDashboardViewParent);
        
        Stage newWindow  = new Stage();
        
        newWindow.setTitle("Data Analyst");
        newWindow.setScene(CustomerDashboardViewScene);
        newWindow.show();
    }
        
        
    }

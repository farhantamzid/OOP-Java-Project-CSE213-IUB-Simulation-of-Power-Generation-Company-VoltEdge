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
 * @author Dell
 */
public class ECOLandingPageController implements Initializable {

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void OnActionInputEmissionsData(ActionEvent event) {
                 try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("InputEmissionsData.fxml"));
            Parent createAccountRoot = loader.load();

            Stage stage = new Stage();
            stage.setTitle("Create New Account");
            stage.setScene(new Scene(createAccountRoot));
            stage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @FXML
    private void OnActionGenerateEmissionsReports(ActionEvent event) {
             try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("EmissionsTableView.fxml"));
            Parent viewEmissionTableRoot = loader.load();

            Stage stage = new Stage();
            stage.setTitle("View Emission Table");
            stage.setScene(new Scene(viewEmissionTableRoot));
            stage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @FXML
    private void On(ActionEvent event) {
    }

    @FXML
    private void OnActionEnvironmentalImpactMetrics(ActionEvent event) {
            try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("EmissionsMonitoringController.fxml"));
            Parent EmissionMonitorRoot = loader.load();

            Stage stage = new Stage();
            stage.setTitle(" Environmental Impact Metrics");
            stage.setScene(new Scene(EmissionMonitorRoot));
            stage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @FXML
    private void OnActionEnvironmentalImpactMetricsPieChart(ActionEvent event) {
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("EmissionsMonitoringControllerPieChart.fxml"));
            Parent EmissionMonitorRoot = loader.load();

            Stage stage = new Stage();
            stage.setTitle(" Environmental Impact Metrics");
            stage.setScene(new Scene(EmissionMonitorRoot));
            stage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    
}

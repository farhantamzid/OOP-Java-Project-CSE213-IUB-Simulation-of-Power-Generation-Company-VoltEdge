/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package sceneDataAnalyst;

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
public class DataAnalystLandingPageController implements Initializable {

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }

    @FXML
    private void OnActionFuelCost(ActionEvent event) {
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("/sceneDataAnalyst/FuelCostandUsage.fxml"));
            Parent createAccountRoot = loader.load();

            Stage stage = new Stage();
            stage.setTitle("Input Emission Data");
            stage.setScene(new Scene(createAccountRoot));
            stage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    @FXML
    private void OnActionOperationalTrendAnalysis(ActionEvent event) {
         try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("/sceneDataAnalyst/InputOperationalTrendAnalysis.fxml"));
            Parent createAccountRoot = loader.load();

            Stage stage = new Stage();
            stage.setTitle("OperationalTrendAnalysis");
            stage.setScene(new Scene(createAccountRoot));
            stage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @FXML
    private void OnActionMaintenanceLog(ActionEvent event) {
        try {
            FXMLLoader loader = new FXMLLoader
        (getClass().getResource("/sceneDataAnalyst/InputMaintenanceLogManagement.fxml"));
            Parent createAccountRoot = loader.load();

            Stage stage = new Stage();
            stage.setTitle("MaintenanceLog");
            stage.setScene(new Scene(createAccountRoot));
            stage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @FXML
    private void OnActionEquimentrepair(ActionEvent event) {
        try {
            FXMLLoader loader = new FXMLLoader
        (getClass().getResource("/sceneDataAnalyst/InputEquipmentRepairsReplacements.fxml"));
            Parent createAccountRoot = loader.load();

            Stage stage = new Stage();
            stage.setTitle("Equimentrepair");
            stage.setScene(new Scene(createAccountRoot));
            stage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @FXML
    private void OnActionTableFuelCost(ActionEvent event) {
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("/sceneDataAnalyst/FuelCOSTTableview.fxml"));
            Parent createAccountRoot = loader.load();

            Stage stage = new Stage();
            stage.setTitle("TableFuelCost");
            stage.setScene(new Scene(createAccountRoot));
            stage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void OnActionMetricsLIneChart(ActionEvent event) {
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource(""));
            Parent createAccountRoot = loader.load();

            Stage stage = new Stage();
            stage.setTitle("LIneChart");
            stage.setScene(new Scene(createAccountRoot));
            stage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @FXML
    private void OnActionchartMaintenance(ActionEvent event) {
        try {
            FXMLLoader loader = new FXMLLoader
        (getClass().getResource("/sceneDataAnalyst/MaintenanceLogManagementLineChart.fxml"));
            Parent createAccountRoot = loader.load();

            Stage stage = new Stage();
            stage.setTitle("chartMaintenance");
            stage.setScene(new Scene(createAccountRoot));
            stage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @FXML
    private void OnActionchartEquipment(ActionEvent event) {
        try {
            FXMLLoader loader = new FXMLLoader
        (getClass().getResource("/sceneDataAnalyst/tableviewEquipmentRepairsReplacements.fxml"));
            Parent createAccountRoot = loader.load();

            Stage stage = new Stage();
            stage.setTitle("chartEquipment");
            stage.setScene(new Scene(createAccountRoot));
            stage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @FXML
    private void OnActionMetricsBarChart(ActionEvent event) {
         try {
            FXMLLoader loader = new FXMLLoader
        (getClass().getResource("/sceneDataAnalyst/BarChartOperationalTrendAnalysis.fxml"));
            Parent createAccountRoot = loader.load();

            Stage stage = new Stage();
            stage.setTitle("LIneChart");
            stage.setScene(new Scene(createAccountRoot));
            stage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}

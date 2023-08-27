/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package sceneECO;

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

     //input emission data 
    @FXML
    private void OnActionInputEmissionsData(ActionEvent event) {
         try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("/sceneECO/DataInsertionEmissionData.fxml"));
            Parent createAccountRoot = loader.load();

            Stage stage = new Stage();
            stage.setTitle("Input Emission Data");
            stage.setScene(new Scene(createAccountRoot));
            stage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }
      

    }
    //table view emission data

    @FXML
    private void OnActionGenerateEmissionsReports(ActionEvent event) {
         try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("/sceneECO/TableViewEmissionData.fxml"));
            Parent createAccountRoot = loader.load();

            Stage stage = new Stage();
            stage.setTitle("Input Operation Data");
            stage.setScene(new Scene(createAccountRoot));
            stage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }
        
    }

   //input operation performance

    @FXML
    private void OnActionInputOperationPerformanceData(ActionEvent event) {
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("/sceneECO/InputOperationPerformanceData.fxml"));
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
    private void OnActionGenerateOperationReports(ActionEvent event) {
          try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("/sceneECO/TableviewOperationPerformanceDatafromBin.fxml"));
            Parent createAccountRoot = loader.load();

            Stage stage = new Stage();
            stage.setTitle("Input Operation Data");
            stage.setScene(new Scene(createAccountRoot));
            stage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }
        
    }

    @FXML
    private void OnActionGeneratePDFEmissionData(ActionEvent event) {
    }

    @FXML
    private void OnActionOperationDataLineChart(ActionEvent event) {
                  try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("/sceneECO/WaterUsuageLineChart.fxml"));
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
    private void OnActionInputRelevantRegulationsData(ActionEvent event) {
          try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("/sceneECO/RelevantRegulations.fxml"));
            Parent createAccountRoot = loader.load();

            Stage stage = new Stage();
            stage.setTitle("Input Operation Data");
            stage.setScene(new Scene(createAccountRoot));
            stage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @FXML
    private void OnActionInputWasteDisposalData(ActionEvent event) {
           try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("/sceneECO/InputWasteDisposalData.fxml"));
            Parent createAccountRoot = loader.load();

            Stage stage = new Stage();
            stage.setTitle("Input Waste Disposal Data");
            stage.setScene(new Scene(createAccountRoot));
            stage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @FXML
    private void OnActionWasteDisposalPieChart(ActionEvent event) {
           try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("/sceneECO/WasteDisposalPieChart.fxml"));
            Parent createAccountRoot = loader.load();

            Stage stage = new Stage();
            stage.setTitle("Pie Chart Waste Disposal Data");
            stage.setScene(new Scene(createAccountRoot));
            stage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @FXML
    private void OnActionInputWaterUsuageData(ActionEvent event) {
          try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("/sceneECO/InputWaterUsuageData.fxml"));
            Parent createAccountRoot = loader.load();

            Stage stage = new Stage();
            stage.setTitle("Input Operation Data");
            stage.setScene(new Scene(createAccountRoot));
            stage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @FXML
    private void OnActionWaterUsuageDataLineChart(ActionEvent event) {
         try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("/sceneECO/WaterUsuageLineChart.fxml"));
            Parent createAccountRoot = loader.load();

            Stage stage = new Stage();
            stage.setTitle("Pie Chart Waste Disposal Data");
            stage.setScene(new Scene(createAccountRoot));
            stage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}

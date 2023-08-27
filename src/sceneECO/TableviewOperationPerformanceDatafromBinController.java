/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package sceneECO;

import functions.OperationPerformanceData;
import java.net.URL;
import java.time.LocalDate;
import java.util.List;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.collections.FXCollections;

import javafx.scene.control.cell.PropertyValueFactory;
import people.EnvironmentalComplianceOfficer;

/**
 * FXML Controller class
 *
 * @author Dell
 */
public class TableviewOperationPerformanceDatafromBinController implements Initializable {

    @FXML
    private TableView<OperationPerformanceData> tableView;
    @FXML
    private TableColumn<OperationPerformanceData, Integer> plantIdColumn;
    @FXML
    private TableColumn<OperationPerformanceData, Double> powerOutputColumn;
    @FXML
    private TableColumn<OperationPerformanceData, Double> fuelConsumptionColumn;
    @FXML
    private TableColumn<OperationPerformanceData, Double> efficiencyRateColumn;
    @FXML
    private TableColumn<OperationPerformanceData, Double> fxidOperatingTemperature;
    @FXML
    private TableColumn<OperationPerformanceData, Double> fxidEmissionLevels;
    @FXML
    private TableColumn<OperationPerformanceData, Double> fxidEquipmentRunningHours;
    @FXML
    private TableColumn<OperationPerformanceData, Double> fxidNoiseLevels;
    @FXML
    private TableColumn<OperationPerformanceData, LocalDate> fxidDate;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
        plantIdColumn.setCellValueFactory(new PropertyValueFactory<OperationPerformanceData, Integer>("plantId"));
        powerOutputColumn.setCellValueFactory(new PropertyValueFactory<OperationPerformanceData, Double>("powerOutput"));
        fuelConsumptionColumn.setCellValueFactory(new PropertyValueFactory<OperationPerformanceData, Double>("FuelConsumption"));
        efficiencyRateColumn.setCellValueFactory(new PropertyValueFactory<OperationPerformanceData, Double>("EfficiencyRate"));
        fxidOperatingTemperature.setCellValueFactory(new PropertyValueFactory<OperationPerformanceData, Double>("OperatingTemperature"));
        fxidEmissionLevels.setCellValueFactory(new PropertyValueFactory<OperationPerformanceData, Double>("EmissionLevels"));
        fxidEquipmentRunningHours.setCellValueFactory(new PropertyValueFactory<OperationPerformanceData, Double>("EquipmentRunningHours"));
        fxidNoiseLevels.setCellValueFactory(new PropertyValueFactory<OperationPerformanceData, Double>("NoiseLevels"));
        fxidDate.setCellValueFactory(new PropertyValueFactory<OperationPerformanceData, LocalDate>("date"));
    }    
    
         
    @FXML
    private void loadData() {
        String binFileName = "operation_performance_data.bin";
        List<OperationPerformanceData> dataList = EnvironmentalComplianceOfficer.readOperationPerformanceDatafromBin(binFileName);
        tableView.setItems(FXCollections.observableArrayList(dataList));
    }
        
    
}

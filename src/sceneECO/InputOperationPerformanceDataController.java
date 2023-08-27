/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package sceneECO;

import functions.OperationPerformanceData;
import java.net.URL;
import java.time.LocalDate;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TextField;
import people.EnvironmentalComplianceOfficer;

/**
 * FXML Controller class
 *
 * @author Dell
 */
public class InputOperationPerformanceDataController implements Initializable {

    @FXML
    private TextField fxidPowerPlantID;
    @FXML
    private DatePicker fxiddatePicker;
    @FXML
    private TextField fxidPowerOutput;
    @FXML
    private TextField fxidFuelConsumption;
    @FXML
    private TextField fxidEfficiencyRate;
    @FXML
    private TextField fxidOperatingTemperature;
    @FXML
    private TextField fxidEmissionLevels;
    @FXML
    private TextField fxidNoiseLevels;
    @FXML
    private TextField fxidEquipmentRunningHours;
    private EnvironmentalComplianceOfficer eco1;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
        EnvironmentalComplianceOfficer eco1 = new EnvironmentalComplianceOfficer("name", "address",
                "email", "phone", "password", 0, LocalDate.now());
    }

    @FXML
    private void OnActionSubmit(ActionEvent event) {
        String fileName = "operation_performance_data.bin";
        int plantId = Integer.parseInt(fxidPowerPlantID.getText()); // Assuming you have a TextField for plantId
        double powerOutput = Double.parseDouble(fxidPowerOutput.getText()); // TextField for powerOutput
        double fuelConsumption = Double.parseDouble(fxidFuelConsumption.getText()); // TextField for fuelConsumption
        double efficiencyRate = Double.parseDouble(fxidEfficiencyRate.getText()); // TextField for efficiencyRate
        double operatingTemperature = Double.parseDouble(fxidOperatingTemperature.getText()); // TextField for operatingTemperature
        double emissionLevels = Double.parseDouble(fxidEmissionLevels.getText()); // TextField for emissionLevels
        double noiseLevels = Double.parseDouble(fxidNoiseLevels.getText()); // TextField for noiseLevels
        double equipmentRunningHours = Double.parseDouble(fxidEquipmentRunningHours.getText()); // TextField for equipmentRunningHours
        LocalDate date = fxiddatePicker.getValue(); // DatePicker for date

        eco1.writeOperationPerformanceDataToBin(plantId, powerOutput, fuelConsumption,
             efficiencyRate, operatingTemperature, emissionLevels, noiseLevels,
             equipmentRunningHours, date, fileName);

    }

}

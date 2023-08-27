/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package sceneECO;

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
public class InputWaterUsuageDataController implements Initializable {

    @FXML
    private TextField fxidtemperature;
    @FXML
    private DatePicker fxiddate;
    @FXML
    private TextField fxidwaterConsumptionLiters;
    @FXML
    private TextField fxidlocation;
    @FXML
    private TextField fxidusageType;
    @FXML
    private TextField fxidweatherConditions;
    @FXML
    private TextField fxidunusualSpike;
    private EnvironmentalComplianceOfficer eco7;
   

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
        EnvironmentalComplianceOfficer eco7 = new EnvironmentalComplianceOfficer("name", "address",
                "email", "phone", "password", 0, LocalDate.now());

    }    

    @FXML
    private void OnActionSubmit(ActionEvent event) {
  
    String fileName = "water_usage_data.bin";
    LocalDate date = fxiddate.getValue();
    double waterConsumptionLiters = Double.parseDouble(fxidwaterConsumptionLiters.getText());
    String location = fxidlocation.getText();
    String usageType = fxidusageType.getText();
    double temperature = Double.parseDouble(fxidtemperature.getText());
    String weatherConditions = fxidweatherConditions.getText();
    boolean unusualSpike = Boolean.parseBoolean(fxidunusualSpike.getText());

    eco7.writeWaterUsageToBin(date, waterConsumptionLiters, location, usageType,
            temperature, weatherConditions, unusualSpike, fileName);
    }
    
}

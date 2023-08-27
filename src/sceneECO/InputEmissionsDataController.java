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
public class InputEmissionsDataController implements Initializable {

    @FXML
    private TextField fxidPowerPlantID;
    @FXML
    private TextField fxidEmissionType;
    @FXML
    private TextField fxidQuantity;
    @FXML
    private DatePicker fxiddatePicker;
    private EnvironmentalComplianceOfficer eco;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        eco = new EnvironmentalComplianceOfficer("name", "address",
                "email", "phone", "password", 0, LocalDate.now());
    }

    @FXML
    private void OnActionInputEmissionsData(ActionEvent event) {

    }

    @FXML
    private void OnActionGenerateEmissionsReports(ActionEvent event) {
    }

    @FXML
    private void On(ActionEvent event) {
    }

    @FXML
    private void OnActionSubmit(ActionEvent event) {
        String powerPlantID = fxidPowerPlantID.getText();
        String emissionType = fxidEmissionType.getText();
        double quantity = Double.parseDouble(fxidQuantity.getText());
        LocalDate date = fxiddatePicker.getValue();

        eco.writeEmissionDataToFile(powerPlantID, emissionType, quantity,
                date, "emission_data.txt");
    }
}

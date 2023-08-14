/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package logintestapplicationMainPkg;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.net.URL;
import java.time.LocalDate;
import java.util.Date;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TextField;

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

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
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
    String PowerPlantId = fxidPowerPlantID.getText();
    String EmissionType = fxidEmissionType.getText();
    String Quantity = fxidQuantity.getText();
    LocalDate date = fxiddatePicker.getValue();

    // Combine data with a delimiter (e.g., comma)
    String userData = PowerPlantId + "," + EmissionType + "," + Quantity + "," + date;

    try (FileWriter fileWriter = new FileWriter("emissiondata.txt", true);
         BufferedWriter bufferedWriter = new BufferedWriter(fileWriter)) {

        bufferedWriter.write(userData);
        bufferedWriter.newLine(); // Add a new line for each entry
        System.out.println("Data appended to emissiondata.txt");
    } catch (IOException e) {
        e.printStackTrace();
    }
    }
    
}

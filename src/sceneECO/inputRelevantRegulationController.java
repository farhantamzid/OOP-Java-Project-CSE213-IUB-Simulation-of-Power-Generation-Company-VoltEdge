/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package sceneECO;

import java.net.URL;
import java.util.Date;
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
public class inputRelevantRegulationController implements Initializable {

    @FXML
    private TextField fxidRegulationID;
    @FXML
    private TextField fxidRegulationTitle;
    @FXML
    private TextField fxidRegulationText;
    @FXML
    private DatePicker fxidlatupdateDate;
    @FXML
    private TextField fxidComplianceStatus;
    @FXML
    private DatePicker fxiddatePicker;
     private EnvironmentalComplianceOfficer eco2;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void OnActionSubmit(ActionEvent event) {
        String filename = "relevant_regulations_data.bin";
        String regulationId = fxidRegulationID.getText();
        String title = fxidRegulationTitle.getText();
        String text = fxidRegulationText.getText();
        Date dateAdded = java.sql.Date.valueOf(fxiddatePicker.getValue()); // Convert DatePicker value to Date
        String complianceStatus = fxidComplianceStatus.getText();
        Date lastUpdatedDate = java.sql.Date.valueOf(fxidlatupdateDate.getValue()); // Convert DatePicker value to Date
        

        eco2.writeRelevantRegulationsToBin(
            regulationId, title, text, dateAdded, complianceStatus, lastUpdatedDate, filename
        );
    }
    
}

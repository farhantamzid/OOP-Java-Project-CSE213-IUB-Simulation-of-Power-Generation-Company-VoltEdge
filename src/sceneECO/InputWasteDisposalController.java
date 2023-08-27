/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package sceneECO;

import java.net.URL;
import java.time.LocalDate;
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
public class InputWasteDisposalController implements Initializable {

    @FXML
    private TextField fxidWasteType;
    @FXML
    private TextField fxidQuantity;
    @FXML
    private TextField fxidLocation;
    @FXML
    private DatePicker fxiddateDisposal;
    @FXML
    private TextField fxidNmae;
    @FXML
    private TextField fxidDisposalDocumentation;
    @FXML
    private TextField fxidRegulatoryCompliance;
    private  EnvironmentalComplianceOfficer eco3;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void OnActionSubmit(ActionEvent event) {
        String wasteType = fxidWasteType.getText();
        double quantity = Double.parseDouble(fxidQuantity.getText());
        String locationOfDisposal = fxidLocation.getText();
        Date dateOfDisposal = java.sql.Date.valueOf(fxiddateDisposal.getValue());
        String disposersName = fxidNmae.getText();
        String disposalDocumentation = fxidDisposalDocumentation.getText();
        String regulatoryCompliance = fxidRegulatoryCompliance.getText();

        eco3.writeWasteDisposalToFileText(dateOfDisposal, wasteType, quantity,
                locationOfDisposal, disposersName, disposalDocumentation,
                regulatoryCompliance, "waste_disposal_data.txt");
        // Clear input fields after writing data
    fxidWasteType.clear();
    fxidQuantity.clear();
    fxidLocation.clear();
    fxiddateDisposal.setValue(null);
    fxidNmae.clear();
    fxidDisposalDocumentation.clear();
    fxidRegulatoryCompliance.clear();
    }
    
    
    
}

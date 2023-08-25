/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package logintestapplicationMainPkg;

import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextArea;

public class RepairRequestSceneController implements Initializable {

    @FXML
    private ComboBox<String> comboboxRepairType;
    @FXML
    private TextArea DescriptionTextarea;

    private List<RepairRequest> repairRequests = new ArrayList<>();

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        comboboxRepairType.getItems().addAll("Power Outage Restoration", "Circuit Breaker Repair", "Power Line and Pole Repair");
        // Load repair requests from file
        repairRequests = RepairRequestFileHandling.loadRepairRequests();
    }

    @FXML
    private void submitButtonOnclick(ActionEvent event) {
        String repairType = comboboxRepairType.getValue();
        String repairDescription = DescriptionTextarea.getText();

        RepairRequest newRepairRequest = new RepairRequest(repairType, repairDescription, false);
        repairRequests.add(newRepairRequest);

        RepairRequestFileHandling.saveRepairRequests(repairRequests);
        System.out.println("Sent To Engineer");
        
    }
    
}


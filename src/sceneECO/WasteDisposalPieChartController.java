/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package sceneECO;

import functions.WasteDisposal;
import java.net.URL;
import java.util.List;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.chart.PieChart;
import javafx.scene.control.Button;
import people.EnvironmentalComplianceOfficer;

/**
 * FXML Controller class
 *
 * @author Dell
 */
public class WasteDisposalPieChartController implements Initializable {

    @FXML
    private Button fxidLoad;
   
    private EnvironmentalComplianceOfficer eco4;
    @FXML
    private PieChart fxidPieChart;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
         displayWasteDisposalPieChart();
        
    }   
    
    private void displayWasteDisposalPieChart() {
        List<WasteDisposal> wasteDisposals = 
                EnvironmentalComplianceOfficer.readWasteDisposalDataFromFile("waste_disposal_data.txt");

        for (WasteDisposal wd : wasteDisposals) {
            fxidPieChart.getData().add(new PieChart.Data(wd.getWasteType(), wd.getQuantity()));
        }
    }
    
 

    
}

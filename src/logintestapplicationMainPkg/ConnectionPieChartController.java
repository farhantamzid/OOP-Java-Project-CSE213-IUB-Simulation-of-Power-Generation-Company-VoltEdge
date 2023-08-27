/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package logintestapplicationMainPkg;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.chart.PieChart;

/**
 * FXML Controller class
 *
 * @author User
 */
public class ConnectionPieChartController implements Initializable {

    @FXML
    private PieChart connectionLocationPiechart;


    @Override
    public void initialize(URL url, ResourceBundle rb) {
        ConnectionPieChartData.populatePieChart(connectionLocationPiechart);
        // TODO
    }    
    
}

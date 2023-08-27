/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package logintestapplicationMainPkg;

import java.net.URL;
import java.util.List;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.chart.BarChart;
import javafx.scene.chart.CategoryAxis;
import javafx.scene.chart.NumberAxis;
import javafx.scene.chart.XYChart;

/**
 * FXML Controller class
 *
 * @author farhan
 */
public class PowerGenerationDistributionBarChartSceneController implements Initializable {

    @FXML
    private BarChart<String, Integer> barChart;

    @FXML
    private CategoryAxis xAxis;
    
    @FXML
    private NumberAxis yAxis;

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        List<Generator> generatorList = Generator.readFromBin();
        
        XYChart.Series<String, Integer> renewableSeries = new XYChart.Series<>();
        XYChart.Series<String, Integer> nonRenewableSeries = new XYChart.Series<>();
        
        for (Generator generator : generatorList) {
            if (generator.getIsOn() && generator.getIsFunctional() && generator.getIsPurchaseApproved()) {
                XYChart.Data<String, Integer> data = new XYChart.Data<>(generator.getId() + " - " + generator.getType(), generator.getPower());
                if (generator.getIsRenewable()) {
                    renewableSeries.getData().add(data);
                } else {
                    nonRenewableSeries.getData().add(data);
                }
            }
        }
        
        renewableSeries.setName("Renewable");
        nonRenewableSeries.setName("Non-Renewable");
        
        barChart.getData().addAll(renewableSeries, nonRenewableSeries);
    }    
    
}

package sceneECO;

import java.net.URL;
import java.util.List;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.chart.LineChart;
import javafx.scene.chart.XYChart;
import people.EnvironmentalComplianceOfficer;
import functions.WaterUsage;

public class WaterUsuageLineChartController implements Initializable {

    @FXML
    private LineChart<Number, Number> fxifLineChart;

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // Load and set up the line chart data from the eco.java functionality
        setupLineChart();
    }

    private void setupLineChart() {
        // Load data from the binary file using eco.java's functionality
        List<WaterUsage> waterUsages = EnvironmentalComplianceOfficer.loadDataFromBinFile("water_usuage_data.bin");

        // Add data to the line chart
        XYChart.Series<Number, Number> series = new XYChart.Series<>();
        for (WaterUsage waterUsage : waterUsages) {
            series.getData().add(new XYChart.Data<>(waterUsage.getWaterConsumptionLiters(), waterUsage.getTemperature()));
        }

        fxifLineChart.getData().add(series);
    }
}

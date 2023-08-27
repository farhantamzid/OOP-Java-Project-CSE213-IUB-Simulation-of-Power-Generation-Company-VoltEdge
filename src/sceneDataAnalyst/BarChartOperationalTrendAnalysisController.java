package sceneDataAnalyst;


import functions.OperationalTrendAnalysis;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.chart.BarChart;
import javafx.scene.chart.CategoryAxis;
import javafx.scene.chart.NumberAxis;
import javafx.scene.chart.XYChart;

import java.net.URL;
import java.time.LocalDate;
import java.util.List;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;

import people.DataAnalyst;

public class BarChartOperationalTrendAnalysisController implements Initializable {

    @FXML
    private BarChart<String, Number> fxidchart;

    @FXML
    private CategoryAxis xAxis;

    @FXML
    private NumberAxis yAxis;
        private DataAnalyst dataAnalyst;

    @Override
    public void initialize(URL url, ResourceBundle rb) {

        
    }

    @FXML
    private void OnActionLoad(ActionEvent event) {
                // Initialize the DataAnalyst instance with necessary parameters
    // Initialize the DataAnalyst instance with necessary parameters
            dataAnalyst = new DataAnalyst("name", "address",
                "email", "phone", "password", 0, LocalDate.now());
        String fileName = "operational_trend_analysis.txt"; // Change to your actual file name

        // Read operational trend analysis data
        List<OperationalTrendAnalysis> operationalTrendData = dataAnalyst.readOperationalTrendAnalysisDataFromTxtFile(fileName);

        // Set up the bar chart
        xAxis.setLabel("Equipment ID");
        yAxis.setLabel("Error Count");
        fxidchart.setTitle("Error Count by Equipment ID");

        // Populate the bar chart with error count data
        XYChart.Series<String, Number> series = new XYChart.Series<>();
        for (OperationalTrendAnalysis entry : operationalTrendData) {
            series.getData().add(new XYChart.Data<>(entry.getEquipmentId(), entry.getErrorCount()));
        }
        fxidchart.getData().add(series);
    }
}

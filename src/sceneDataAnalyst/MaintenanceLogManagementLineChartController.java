package sceneDataAnalyst;


import functions.MaintenanceLogManagement;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.chart.CategoryAxis;
import javafx.scene.chart.LineChart;
import javafx.scene.chart.NumberAxis;
import javafx.scene.chart.XYChart;

import java.io.IOException;
import java.net.URL;
import java.time.LocalDate;
import java.util.List;
import java.util.ResourceBundle;
import people.DataAnalyst;

public class MaintenanceLogManagementLineChartController implements Initializable {

    @FXML
    private LineChart<String, Number> fxidlinechart;
    @FXML
    private NumberAxis fxidyaxis;
    @FXML
    private CategoryAxis fxidxaxis;

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }

    @FXML
    private void OnActionLoad(ActionEvent event) {
        // Initialize the DataAnalyst instance with necessary parameters
DataAnalyst dataAnalyst = new DataAnalyst("name", "address",
                "email", "phone", "password", 0, LocalDate.now());
        String fileName = "maintenance_log.txt"; // Change to your actual file name

        // Read maintenance log data from the txt file
        List<MaintenanceLogManagement> maintenanceLogList = dataAnalyst.readMaintenanceLogDataFromTxtFile(fileName);

        // Set up the line chart
        fxidxaxis.setLabel("Date");
        fxidyaxis.setLabel("Duration Hours");
        fxidlinechart.setTitle("Maintenance Duration Over Time");

        // Populate the line chart with data
        XYChart.Series<String, Number> series = new XYChart.Series<>();
        for (MaintenanceLogManagement log : maintenanceLogList) {
            series.getData().add(new XYChart.Data<>(log.getDate().toString(), log.getDurationHours()));
        }
        fxidlinechart.getData().add(series);
    }
}

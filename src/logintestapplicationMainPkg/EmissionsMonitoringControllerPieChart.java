package logintestapplicationMainPkg;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import java.io.BufferedReader;
import java.io.FileReader;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.chart.PieChart;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;

public class EmissionsMonitoringControllerPieChart implements Initializable {
    
    @FXML
    private PieChart pieChart;
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        ObservableList<PieChart.Data> pieChartData = FXCollections.observableArrayList();
        try (BufferedReader reader = new BufferedReader(new FileReader("environmental_impact_dataPieChart.txt"))) {
            String line;
            reader.readLine(); // Skip header line

            while ((line = reader.readLine()) != null) {
                String[] parts = line.split(",");
                if (parts.length == 2) {
                    String category = parts[0];
                    double value = Double.parseDouble(parts[1]);

                    pieChartData.add(new PieChart.Data(category, value));
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        pieChart.setData(pieChartData);
    }

    // Method to show an alert
    public void showAlert(String message) {
        Alert alert = new Alert(AlertType.INFORMATION);
        alert.setTitle("Environmental Compliance Alert");
        alert.setHeaderText(null);
        alert.setContentText(message);
        alert.showAndWait();
    }
}

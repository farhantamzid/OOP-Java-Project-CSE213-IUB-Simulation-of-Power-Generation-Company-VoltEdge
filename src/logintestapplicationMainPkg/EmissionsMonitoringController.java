package logintestapplicationMainPkg;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.chart.LineChart;
import javafx.scene.chart.XYChart;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;

public class EmissionsMonitoringController implements Initializable {
    @FXML
    private LineChart<Number, Number> lineChart;
    
    
    @Override
public void initialize(URL url, ResourceBundle rb) {
    
    
    XYChart.Series<Number, Number> co2Series = new XYChart.Series<>();
        XYChart.Series<Number, Number> particulateSeries = new XYChart.Series<>();
        co2Series.setName("CO2 Emissions");
        particulateSeries.setName("Particulate Matter");

        try (BufferedReader reader = new BufferedReader(new FileReader("environmental_impact_data.txt"))) {
            String line;
            reader.readLine(); // Skip header line

            while ((line = reader.readLine()) != null) {
                String[] parts = line.split(",");
                if (parts.length == 3) {
                    int year = Integer.parseInt(parts[0]);
                    double co2Emissions = Double.parseDouble(parts[1]);
                    double particulateMatter = Double.parseDouble(parts[2]);

                    co2Series.getData().add(new XYChart.Data<>(year, co2Emissions));
                    particulateSeries.getData().add(new XYChart.Data<>(year, particulateMatter));
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        lineChart.getData().addAll(co2Series, particulateSeries);

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


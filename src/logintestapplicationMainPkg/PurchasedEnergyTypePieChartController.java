/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package logintestapplicationMainPkg;

import java.io.BufferedReader;
import java.io.FileReader;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.chart.PieChart;

/**
 * FXML Controller class
 *
 * @author farhan
 */
public class PurchasedEnergyTypePieChartController implements Initializable {

    @FXML
    private PieChart PurchasePieChart;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
            ObservableList<PieChart.Data> pieChartData = FXCollections.observableArrayList();
        try (BufferedReader reader = new BufferedReader(new FileReader("EnergyTableData.txt"))) {
            String line;


            while ((line = reader.readLine()) != null) {
                String[] parts = line.split(",");
                if (parts.length == 4) {
                    String category = parts[0];
                    int value = Integer.parseInt(parts[1]);

                    pieChartData.add(new PieChart.Data(category, value));
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        PurchasePieChart.setData(pieChartData);
        
        // TODO
    }    
    
}

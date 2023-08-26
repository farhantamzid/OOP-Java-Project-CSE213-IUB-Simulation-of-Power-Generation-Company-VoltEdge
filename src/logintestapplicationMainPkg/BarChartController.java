/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package logintestapplicationMainPkg;

import javafx.fxml.FXML;
import javafx.scene.chart.BarChart;
import javafx.scene.chart.CategoryAxis;
import javafx.scene.chart.NumberAxis;
import javafx.scene.chart.XYChart;
import javafx.scene.control.Label;

import java.time.LocalDate;
import java.util.List;

public class BarChartController {

    @FXML
    private BarChart<String, Number> barChart;

    public void initialize() {
        createBarChart();
    }

    private void createBarChart() {
        List<PurchaseData> purchaseDataList = PurchaseDataFileHandling.loadPurchaseData();

        XYChart.Series<String, Number> series = new XYChart.Series<>();
        for (PurchaseData purchaseData : purchaseDataList) {
            LocalDate purchaseDate = purchaseData.getPurchaseDate();
            int totalPrice = purchaseData.getTotalPrice();
            series.getData().add(new XYChart.Data<>(purchaseDate.toString(), totalPrice));
        }

        barChart.getData().add(series);
    }
}


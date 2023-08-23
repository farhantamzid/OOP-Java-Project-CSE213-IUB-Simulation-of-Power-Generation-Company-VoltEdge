/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package logintestapplicationMainPkg;

import javafx.collections.ObservableList;
import javafx.scene.chart.PieChart;

import java.util.Map;

public class ConnectionPieChartData {

    public static void populatePieChart(PieChart pieChart) {
        Map<String, Long> locationCounts = ConnectionFileHandling.countConnectionsByLocation();

        ObservableList<PieChart.Data> pieChartData = pieChart.getData();
        pieChartData.clear();

        for (Map.Entry<String, Long> entry : locationCounts.entrySet()) {
            PieChart.Data data = new PieChart.Data(entry.getKey(), entry.getValue());
            pieChartData.add(data);
        }
    }
}

package sceneDataAnalyst;

import functions.EquipmentRepairsReplacements;
import java.net.URL;
import java.time.LocalDate;
import java.util.List;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.chart.PieChart;
import people.DataAnalyst; // Import the DataAnalyst class or adjust the import based on your package structure

public class PieChartController implements Initializable {

    @FXML
    private PieChart fxidpiechart;
      private DataAnalyst da;

    @Override
    public void initialize(URL url, ResourceBundle rb) {
         List<EquipmentRepairsReplacements> wasteDisposals = DataAnalyst.readEquipmentRepairsReplacementsDataFromTxtFile("equipment_repairs_replacements.txt");

        for (EquipmentRepairsReplacements wd : wasteDisposals) {
            fxidpiechart.getData().add(new PieChart.Data(wd.getEquipmentId(), wd.getCostUSD()));
        }
    }
}

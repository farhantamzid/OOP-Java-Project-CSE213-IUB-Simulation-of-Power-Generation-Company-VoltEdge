package sceneDataAnalyst;

import functions.FuelCostandUsage;
import java.net.URL;
import java.time.LocalDate;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TextField;
import people.DataAnalyst;

public class InputFuelCostandUsageController implements Initializable {

    @FXML
    private TextField fxidFuel;
    @FXML
    private TextField fxidCost;
    @FXML
    private DatePicker fxiddate;

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }

    @FXML
    private void OnActionSubmit(ActionEvent event) {
        String fuelType = fxidFuel.getText();
        double cost = Double.parseDouble(fxidCost.getText());
        LocalDate entryDate = fxiddate.getValue();

  DataAnalyst dataAnalyst = new DataAnalyst("name", "address",
                "email", "phone", "password", 0, LocalDate.now());
  String fileName = "fuel_cost_data.bin";
    dataAnalyst.writeFuelCostinBIN(fuelType, cost, entryDate, fileName);
    }
}

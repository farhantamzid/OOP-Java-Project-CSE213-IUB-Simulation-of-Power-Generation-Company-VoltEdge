package sceneDataAnalyst;

import functions.OperationalTrendAnalysis;
import java.net.URL;
import java.time.LocalDate;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TextField;
import people.DataAnalyst;

public class OperationalTrendAnalysisController implements Initializable {

    @FXML
    private TextField fxidFuelConsumption;
    @FXML
    private DatePicker fxiddate;
    @FXML
    private TextField fxidEquipmentID;
    @FXML
    private TextField fxidPowerOutput;
    @FXML
    private TextField fxidEfficiency;
    @FXML
    private TextField fxidDowntimeDuration;
    @FXML
    private TextField fxidErrorCount;

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }

    @FXML
    private void OnActionSubmit(ActionEvent event) {
        String equipmentId = fxidEquipmentID.getText();
        LocalDate date = fxiddate.getValue();
        double powerOutput = Double.parseDouble(fxidPowerOutput.getText());
        double efficiency = Double.parseDouble(fxidEfficiency.getText());
        double fuelConsumption = Double.parseDouble(fxidFuelConsumption.getText());
        double downtimeDuration = Double.parseDouble(fxidDowntimeDuration.getText());
        int errorCount = Integer.parseInt(fxidErrorCount.getText());

        OperationalTrendAnalysis analysis = new OperationalTrendAnalysis(equipmentId, date, powerOutput,
                                                                        efficiency, fuelConsumption,
                                                                        downtimeDuration, errorCount);

DataAnalyst dataAnalyst = new DataAnalyst("name", "address",
                "email", "phone", "password", 0, LocalDate.now());
dataAnalyst.writeOperationalTrendAnalysisToFile(analysis);
    }
}

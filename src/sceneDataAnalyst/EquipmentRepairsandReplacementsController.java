package sceneDataAnalyst;

import functions.EquipmentRepairsReplacements;
import java.net.URL;
import java.time.LocalDate;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import people.DataAnalyst;

public class EquipmentRepairsandReplacementsController implements Initializable {

    @FXML
    private TextField fxidComponentReplaced;
    @FXML
    private DatePicker fxiddate;
    @FXML
    private TextField fxidRepairReplacementID;
    @FXML
    private TextField fxidEquipmentID;
    @FXML
    private TextField fxidTypeWork;
    @FXML
    private TextField fxidTechID;
    @FXML
    private TextField fxidCost;
    @FXML
    private TextField fxidDuratipn;
    @FXML
    private TextArea fxidDES;

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }

    @FXML
    private void OnActionSubmit(ActionEvent event) {
        String repairReplacementId = fxidRepairReplacementID.getText();
        String equipmentId = fxidEquipmentID.getText();
        LocalDate date = fxiddate.getValue();
        String typeOfWork = fxidTypeWork.getText();
        String componentReplaced = fxidComponentReplaced.getText();
        String technicianProvider = fxidTechID.getText();
        double costUSD = Double.parseDouble(fxidCost.getText());
        double durationHours = Double.parseDouble(fxidDuratipn.getText());
        String description = fxidDES.getText();

        EquipmentRepairsReplacements repairsReplacements = new EquipmentRepairsReplacements(
                repairReplacementId, equipmentId, date, typeOfWork,
                componentReplaced, technicianProvider, costUSD, durationHours, description);
  DataAnalyst dataAnalyst = new DataAnalyst("name", "address",
                "email", "phone", "password", 0, LocalDate.now());

        dataAnalyst.writeEquipmentRepairsReplacements(repairsReplacements);
    }
}

package sceneDataAnalyst;

import functions.MaintenanceLogManagement;
import java.net.URL;
import java.time.LocalDate;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import people.DataAnalyst;

public class InputMaintenanceLogManagementController implements Initializable {

    @FXML
    private Label fxidHour;
    @FXML
    private TextField fxidTechniciansID;
    @FXML
    private DatePicker fxiddate;
    @FXML
    private TextField fxidMaintenanceID;
    @FXML
    private TextField fxidEquipmentID;
    @FXML
    private TextField fxidtypeMain;
    @FXML
    private TextField fxidDowntimeDuration;
    @FXML
    private TextArea fxidDES;
    @FXML
    private TextField fxidSparePart;

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }

    @FXML
    private void OnActionSubmit(ActionEvent event) {
        String maintenanceId = fxidMaintenanceID.getText();
        String equipmentId = fxidEquipmentID.getText();
        LocalDate date = fxiddate.getValue();
        String maintenanceType = fxidtypeMain.getText();
        String techniciansInvolved = fxidTechniciansID.getText();
        double durationHours = Double.parseDouble(fxidDowntimeDuration.getText());
        String description = fxidDES.getText();
        String sparePartsUsed = fxidSparePart.getText();

        MaintenanceLogManagement maintenanceLog = new MaintenanceLogManagement(maintenanceId, equipmentId, date,
                                                                              maintenanceType, techniciansInvolved,
                                                                              durationHours, description, sparePartsUsed);

  DataAnalyst dataAnalyst = new DataAnalyst("name", "address",
                "email", "phone", "password", 0, LocalDate.now());
    }
}

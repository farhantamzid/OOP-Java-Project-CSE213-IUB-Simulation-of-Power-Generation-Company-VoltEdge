/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package logintestapplicationMainPkg;

import javafx.beans.property.SimpleStringProperty;
import javafx.collections.FXCollections;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import java.net.URL;
import java.util.List;
import java.util.ResourceBundle;
import logintestapplicationMainPkg.RepairRequest;
import logintestapplicationMainPkg.RepairRequestFileHandling;

public class ConfirmedRepairsController implements Initializable {

    @FXML
    private TableColumn<RepairRequest, String> typerepairColumn;
    @FXML
    private TableColumn<RepairRequest, String> statusColumn;
    @FXML
    private TableView<RepairRequest> tableViewRepair;

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        List<RepairRequest> repairRequests = RepairRequestFileHandling.loadRepairRequests();

        typerepairColumn.setCellValueFactory(new PropertyValueFactory<>("repairType"));
        statusColumn.setCellValueFactory(cellData -> {
            boolean repairStatus = cellData.getValue().isRepairStatus();
            String status = repairStatus ? "Repaired" : "Not Repaired";
            return new SimpleStringProperty(status);
        });

        tableViewRepair.setItems(FXCollections.observableArrayList(repairRequests));
    }
}




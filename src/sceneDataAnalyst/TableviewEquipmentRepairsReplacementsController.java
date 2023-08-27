/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package sceneDataAnalyst;

import functions.EquipmentRepairsReplacements;
import java.net.URL;
import java.time.LocalDate;
import java.util.List;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import people.DataAnalyst;

/**
 * FXML Controller class
 *
 * @author Dell
 */
public class TableviewEquipmentRepairsReplacementsController implements Initializable {

  @FXML
    private TableView<EquipmentRepairsReplacements> fxidtable;
    @FXML
    private TableColumn<EquipmentRepairsReplacements, String> fxidrepailr;
    @FXML
    private TableColumn<EquipmentRepairsReplacements, String> fxidequioment;
    @FXML
    private TableColumn<EquipmentRepairsReplacements, String> fxiddate;
    @FXML
    private TableColumn<EquipmentRepairsReplacements, String> fxidwork;
    @FXML
    private TableColumn<EquipmentRepairsReplacements, String> fxidreplaed;
    @FXML
    private TableColumn<EquipmentRepairsReplacements, String> fxidtech;
    @FXML
    private TableColumn<EquipmentRepairsReplacements, Double> fxidcost;
    @FXML
    private TableColumn<EquipmentRepairsReplacements, Double> fxidhr;
    @FXML
    private TableColumn<EquipmentRepairsReplacements, String> fxiddes;
    private DataAnalyst dataAnalyst;
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
DataAnalyst dataAnalyst = new DataAnalyst("name", "address",
                "email", "phone", "password", 0, LocalDate.now());
         // Bind columns to the EquipmentRepairsReplacements class attributes
        fxidrepailr.setCellValueFactory(new PropertyValueFactory<>("repairReplacementId"));
        fxidequioment.setCellValueFactory(new PropertyValueFactory<>("equipmentId"));
        fxiddate.setCellValueFactory(new PropertyValueFactory<>("date"));
        fxidwork.setCellValueFactory(new PropertyValueFactory<>("typeOfWork"));
        fxidreplaed.setCellValueFactory(new PropertyValueFactory<>("componentReplaced"));
        fxidtech.setCellValueFactory(new PropertyValueFactory<>("technicianProvider"));
        fxidcost.setCellValueFactory(new PropertyValueFactory<>("costUSD"));
        fxidhr.setCellValueFactory(new PropertyValueFactory<>("durationHours"));
        fxiddes.setCellValueFactory(new PropertyValueFactory<>("description"));
    }    

   
        
        @FXML
    private void OnActionLoad(ActionEvent event) {
   
    List<EquipmentRepairsReplacements> dataList = dataAnalyst.readEquipmentRepairsReplacementsDataFromTxtFiletable("equipment_repairs_replacements.txt");
    fxidtable.getItems().addAll(dataList);

    }
    
}

package sceneECO;

import functions.EmissionData; // Make sure to import the EmissionData class
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.net.URL;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import people.EnvironmentalComplianceOfficer;

public class TableviewEmissionDataController implements Initializable {

    @FXML
    private TableView<EmissionData> tableView;
    @FXML
    private TableColumn<EmissionData, String> fxidpowerPlant;
    @FXML
    private TableColumn<EmissionData, String> fxidpollutant;
    @FXML
    private TableColumn<EmissionData, Double> fxidemissions;
    @FXML
    private TableColumn<EmissionData, String> fxidDate;

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void loadData(ActionEvent event) {
        String textFileName = "emission_data.txt";
        List<EmissionData> dataList = EnvironmentalComplianceOfficer.readFromEmissionDatafromText(textFileName);
        
        // Assuming you have appropriate PropertyValueFactory methods set for your columns
        fxidpowerPlant.setCellValueFactory(new PropertyValueFactory<>("powerPlant"));
        fxidpollutant.setCellValueFactory(new PropertyValueFactory<>("pollutant"));
        fxidemissions.setCellValueFactory(new PropertyValueFactory<>("emissions"));
        fxidDate.setCellValueFactory(new PropertyValueFactory<>("date"));
        
        tableView.setItems(FXCollections.observableArrayList(dataList));
    }
}

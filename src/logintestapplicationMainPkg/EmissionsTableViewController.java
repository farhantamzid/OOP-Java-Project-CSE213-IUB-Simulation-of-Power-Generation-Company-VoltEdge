package logintestapplicationMainPkg;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.net.URL;
import java.time.LocalDate;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.scene.control.ComboBox;

public class EmissionsTableViewController implements Initializable {
    @FXML
    private TableView<EmissionsData> emissionsTable;

    @FXML
    private TableColumn<EmissionsData, String> powerPlantColumn;

    @FXML
    private TableColumn<EmissionsData, String> pollutantColumn;

    @FXML
    private TableColumn<EmissionsData, Double> emissionsColumn;

    @FXML
    private TableColumn<EmissionsData, LocalDate> dateColumn;
    @FXML
    private ComboBox<String> fxidPowerPlantSElect;
     private ObservableList<String> plantnumber = FXCollections.observableArrayList(
            "Plant 1", "Plant 2", "Plant 3");

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        fxidPowerPlantSElect.setItems(plantnumber);
        
        powerPlantColumn.setCellValueFactory(new PropertyValueFactory<EmissionsData, String>("powerPlant"));
        pollutantColumn.setCellValueFactory(new PropertyValueFactory<EmissionsData, String>("pollutant"));
        emissionsColumn.setCellValueFactory(new PropertyValueFactory<EmissionsData, Double>("emissions"));
        dateColumn.setCellValueFactory(new PropertyValueFactory<EmissionsData, LocalDate>("date"));

        try (BufferedReader reader = new BufferedReader(new FileReader("emissiondata.txt"))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] parts = line.split(",");
                if (parts.length == 4) {
                    String powerPlant = parts[0];
                    String pollutant = parts[1];
                    double emissions = Double.parseDouble(parts[2]);
                    LocalDate date = LocalDate.parse(parts[3]);

                    EmissionsData data = new EmissionsData(powerPlant, pollutant, emissions, date);
                    emissionsTable.getItems().add(data);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    
    
    
    @FXML
private void OnActionPowerPlantSelection(ActionEvent event) {
    EmissionsData selectedData = emissionsTable.getSelectionModel().getSelectedItem();
    
    if (selectedData != null) {
        // Clear the existing items in the table
        emissionsTable.getItems().clear();
        
        // Read the data from the file and display only the selected power plant's data
        try (BufferedReader reader = new BufferedReader(new FileReader("emissiondata.txt"))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] parts = line.split(",");
                if (parts.length == 4) {
                    String powerPlant = parts[0];
                    String pollutant = parts[1];
                    double emissions = Double.parseDouble(parts[2]);
                    LocalDate date = LocalDate.parse(parts[3]);

                    if (powerPlant.equals(selectedData.getPowerPlant())) {
                        EmissionsData data = new EmissionsData(powerPlant, pollutant, emissions, date);
                        emissionsTable.getItems().add(data);
                    }
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

}


package sceneDataAnalyst;

import functions.FuelCostandUsage;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import java.net.URL;
import java.time.LocalDate;
import java.util.List;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.scene.control.cell.PropertyValueFactory;
import people.DataAnalyst;

public class FuelCOSTTableviewController implements Initializable {

    @FXML
    private TableView<FuelCostandUsage> tableView;
    @FXML
    private TableColumn<FuelCostandUsage, String> fxidfuelType;
    @FXML
    private TableColumn<FuelCostandUsage, Double> fxidcost;
    @FXML
    private TableColumn<FuelCostandUsage, LocalDate> fxidentryDate;

    @Override
    public void initialize(URL url, ResourceBundle rb) {
      
        
    
    }

    @FXML
    private void OnActionLoad(ActionEvent event) {
        
          // Initialize the DataAnalyst instance with necessary parameters
  DataAnalyst dataAnalyst = new DataAnalyst("name", "address",
                "email", "phone", "password", 0, LocalDate.now());
        String fileName = "fuel_cost_data.bin"; // Change to your actual file name

        // Read fuel cost data from the bin file using DataAnalyst instance
        List<FuelCostandUsage> fuelCostList = dataAnalyst.readFuelCostDataFromBinFile(fileName);

        // Set up TableView columns using PropertyValueFactory
        fxidfuelType.setCellValueFactory(new PropertyValueFactory<>("fuelType"));
        fxidcost.setCellValueFactory(new PropertyValueFactory<>("cost"));
        fxidentryDate.setCellValueFactory(new PropertyValueFactory<>("entryDate"));

        // Populate TableView with fuel cost data
        tableView.getItems().addAll(fuelCostList);
    }
}

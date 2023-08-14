/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package logintestapplicationMainPkg;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.net.URL;
import java.time.LocalDate;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;

/**
 * FXML Controller class
 *
 * @author farhan
 */
public class CustomerPurchaseTableController implements Initializable {


    @FXML
    private TableColumn<PurchaseData, LocalDate> dateColumn;
    @FXML
    private TableColumn<PurchaseData, String> EnergyTypeColumn;
    @FXML
    private TableColumn<PurchaseData, String> AmountColumn;
    @FXML
    private TableColumn<PurchaseData, String> priceColumn;
    @FXML
    private TableView<PurchaseData> purchaseTable;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        EnergyTypeColumn.setCellValueFactory(new PropertyValueFactory<PurchaseData, String>("EnergyType"));
        AmountColumn.setCellValueFactory(new PropertyValueFactory<PurchaseData, String>("AmountKWH"));
        priceColumn.setCellValueFactory(new PropertyValueFactory<PurchaseData, String>("TotalPrice"));
        dateColumn.setCellValueFactory(new PropertyValueFactory<PurchaseData, LocalDate>("PurchaseDate"));

        try (BufferedReader reader = new BufferedReader(new FileReader("EnergyTableData.txt"))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] parts = line.split(",");
                if (parts.length == 4) {
                    String EnergyTypeColumn = parts[0];
                    String AmountColumn = parts[1];
                    String priceColumn = parts[2];
                    LocalDate dateColumn = LocalDate.parse(parts[3]);

                    PurchaseData data = new PurchaseData(EnergyTypeColumn, AmountColumn, priceColumn, dateColumn);
                    purchaseTable.getItems().add(data);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
        // TODO
    }    

    


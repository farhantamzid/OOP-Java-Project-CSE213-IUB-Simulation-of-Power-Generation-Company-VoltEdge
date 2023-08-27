/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package logintestapplicationMainPkg;

import java.net.URL;
import java.util.List;
import java.util.ResourceBundle;
import javafx.beans.property.SimpleStringProperty;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;

/**
 * FXML Controller class
 *
 * @author User
 */

public class PaymentRevenueTableViewController implements Initializable {

    @FXML
    private TableView<String[]> revenuePaymentTable;
    @FXML
    private TableColumn<String[], String> revenueType;
    @FXML
    private TableColumn<String[], String> revenueAmount;

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // Set up columns to display data
        revenueType.setCellValueFactory(cellData -> new SimpleStringProperty(cellData.getValue()[0]));
        revenueAmount.setCellValueFactory(cellData -> new SimpleStringProperty(cellData.getValue()[1]));

        // Load and display data
        List<String[]> data = paymentRevenueFileReader.readData("payment_history.txt");
        revenuePaymentTable.getItems().addAll(data);
    }
}


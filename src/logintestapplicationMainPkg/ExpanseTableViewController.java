/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package logintestapplicationMainPkg;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;

/**
 * FXML Controller class
 *
 * @author User
 */

import java.net.URL;
import java.util.List;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;

public class ExpanseTableViewController implements Initializable {

    @FXML
    private TableView<Expense> expanseTableView;
    @FXML
    private TableColumn<Expense, String> rentType;
    @FXML
    private TableColumn<Expense, Double> rentAmount;

    @Override
    public void initialize(URL url, ResourceBundle rb) {

        rentType.setCellValueFactory(cellData -> cellData.getValue().rentTypeProperty());
        rentAmount.setCellValueFactory(cellData -> cellData.getValue().rentAmountProperty().asObject());

        
        List<String[]> data = ExpenseTableViewFileReader.readData("rent_utilities_expense.txt");
        for (String[] parts : data) {
            if (parts.length >= 2) {
                String description = parts[1];
                double amount = Double.parseDouble(parts[0]);
                expanseTableView.getItems().add(new Expense(description, amount));
            }
        }
    }
}

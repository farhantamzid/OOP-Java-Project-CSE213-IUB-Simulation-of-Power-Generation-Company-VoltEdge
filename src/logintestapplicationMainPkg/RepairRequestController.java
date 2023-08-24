/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package logintestapplicationMainPkg;

import java.awt.Checkbox;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;

/**
 * FXML Controller class
 *
 * @author User
 */
public class RepairRequestController implements Initializable {

    @FXML
    private TableView<RepairConnection> repairTableView;
    @FXML
    private TableColumn<RepairConnection, Checkbox> repairCheckboxColumn;
    @FXML
    private TableColumn<RepairConnection, Integer> repairPlantIdColumn;
    @FXML
    private TableColumn<RepairConnection, String> repairNameColumn;
    @FXML
    private TableColumn<RepairConnection, String> repairLocationColumn;
    @FXML
    private TableColumn<RepairConnection, String> repairDateColumn;


    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        
        
        
    }    

    @FXML
    private void saveSelectedConnections(ActionEvent event) {
    }
    
}

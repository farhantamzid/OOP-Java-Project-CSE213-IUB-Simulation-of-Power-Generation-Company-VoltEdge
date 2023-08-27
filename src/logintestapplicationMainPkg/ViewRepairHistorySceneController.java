/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package logintestapplicationMainPkg;

import java.net.URL;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextArea;
import javafx.scene.control.cell.PropertyValueFactory;

/**
 * FXML Controller class
 *
 * @author farhan
 */
public class ViewRepairHistorySceneController implements Initializable {
    private ArrayList<RepairHistory> repairList;

    @FXML
    private TableView<RepairHistory> historyTableView;
    @FXML
    private TableColumn<RepairHistory, Integer> id;
    @FXML
    private TableColumn<RepairHistory, String> type;

    @FXML
    private TextArea RemarksTextArea;
    @FXML
    private TextArea issueTextArea;
    @FXML
    private Label downtimeLabel;
    @FXML
    private Label timeLabel;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        
        
        id.setCellValueFactory(new PropertyValueFactory<>("id"));
        type.setCellValueFactory(new PropertyValueFactory<>("type"));


        
        

        
        
        repairList = RepairHistory.readFromBin();
        
        for (RepairHistory r : repairList){

            historyTableView.getItems().add(r);
         }

        
        
        
        
        
     
        
        // TODO
    }    

    @FXML
    private void viewDetailsButtonOnClick(ActionEvent event) {
        
        RepairHistory selectedRepair = historyTableView.getSelectionModel().getSelectedItem();
    
    if (selectedRepair != null) {
        RemarksTextArea.setText(selectedRepair.getRemarks());
        issueTextArea.setText(selectedRepair.getIssue());
        downtimeLabel.setText(String.valueOf(selectedRepair.getDowntime()));
        timeLabel.setText(selectedRepair.getTime().toString());
        
        

    }

            
            
        
        
        
        
        
        
        
        
    }
    
}

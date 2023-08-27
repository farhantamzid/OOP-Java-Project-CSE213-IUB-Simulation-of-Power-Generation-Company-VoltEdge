/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package logintestapplicationMainPkg;

import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;

/**
 * FXML Controller class
 *
 * @author farhan
 */
public class LeaveRequestSceneController implements Initializable {
        private ArrayList<leaveRequest> leaveList;

    @FXML
    private TableView<leaveRequest> leaveTableView;
    @FXML
    private TableColumn<leaveRequest, String> name;
    @FXML
    private TableColumn<leaveRequest, String> type;
    @FXML
    private TableColumn<leaveRequest, String> duration;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        
        
        name.setCellValueFactory(new PropertyValueFactory<>("name"));
        type.setCellValueFactory(new PropertyValueFactory<>("type"));
        duration.setCellValueFactory(new PropertyValueFactory<>("duration"));

        
        

        
        
        leaveList = leaveRequest.readFromBin();
        
        for (leaveRequest lr : leaveList){
            

            
            if (!lr.getIsApproved()){
                
                leaveTableView.getItems().add(lr);
                
            }
            
            
        
        
        }

        
        
        
        
        
        // TODO
        
        
        
        // TODO
    } 
    
    @FXML
    private void approveButtonOnClick(ActionEvent event) {
        
        leaveRequest selectedRequest = leaveTableView.getSelectionModel().getSelectedItem();
    
    if (selectedRequest != null) {
        // Perform actions on the selectedGenerator, e.g., toggle its status
        
        selectedRequest.setIsApproved(true);
        
        // Refresh the TableView to reflect the changes
        leaveTableView.refresh();
        
        // Update the corresponding data in your ArrayList (if needed)
        int selectedIndex = leaveTableView.getSelectionModel().getSelectedIndex();
        if (selectedIndex >= 0) {
            leaveList.set(selectedIndex, selectedRequest);
        }
        
        // You might want to save the updated data back to your source (e.g., binary file) here
        leaveRequest.writeToBin(leaveList);
    }

            
            
        
        
        
    
    }
    
    @FXML
        private void denyButtonOnClick(ActionEvent event) {
         leaveRequest selectedRequest = leaveTableView.getSelectionModel().getSelectedItem();
    
    if (selectedRequest != null) {
        // Perform actions on the selectedGenerator, e.g., toggle its status
        
        selectedRequest.setIsApproved(false);
        
        // Refresh the TableView to reflect the changes
        leaveTableView.refresh();
        
        // Update the corresponding data in your ArrayList (if needed)
        int selectedIndex = leaveTableView.getSelectionModel().getSelectedIndex();
        if (selectedIndex >= 0) {
            leaveList.set(selectedIndex, selectedRequest);
        }
        
        // You might want to save the updated data back to your source (e.g., binary file) here
        leaveRequest.writeToBin(leaveList);
    }

            
            
        
        
        
    
            
            
    
    }
    
    
}

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
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;

/**
 * FXML Controller class
 *
 * @author farhan
 */
public class ConfirmServiceRequestSceneController implements Initializable {
    private ArrayList<RepairRequest> repairRequestList;

    @FXML
    private TableView<RepairRequest> requestTableView;
    @FXML
    private TableColumn<RepairRequest, String> type;
    @FXML
    private TableColumn<RepairRequest, String> description;


    @Override
    public void initialize(URL url, ResourceBundle rb) {
        
        type.setCellValueFactory(new PropertyValueFactory<>("repairType"));
        description.setCellValueFactory(new PropertyValueFactory<>("repairDescription"));

        
        

        
        
        repairRequestList = (ArrayList<RepairRequest>) RepairRequestFileHandling.loadRepairRequests();
        
        for (RepairRequest r : repairRequestList){
            

            
            if (!r.isRepairStatus()){
                
                requestTableView.getItems().add(r);
                
            }
            
            
        
        
        }

        
        
        
        
     
        

    }    

    @FXML
    private void confirmServiceButtonOnClick(ActionEvent event) {
        
            RepairRequest selectedGenerator = requestTableView.getSelectionModel().getSelectedItem();
    
    if (selectedGenerator != null) {

        boolean currentStatus = selectedGenerator.isRepairStatus();
        selectedGenerator.setRepairStatus(!currentStatus);
        requestTableView.refresh();

        int selectedIndex = requestTableView.getSelectionModel().getSelectedIndex();
        if (selectedIndex >= 0) {
            repairRequestList.set(selectedIndex, selectedGenerator);
        }
        RepairRequestFileHandling.saveRepairRequests(repairRequestList);
        System.out.println(selectedGenerator.isRepairStatus());

        
    }

            
            
        
        
        
        
        
        
    }
    
}

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
public class PurchaseRequestApprovalDenialController implements Initializable {

    @FXML
    private TableView<Generator> purchaseReqTableView;
    @FXML
    private TableColumn<Generator, String> type;
    @FXML
    private TableColumn<Generator, Integer> price;
    private ArrayList<Generator> generatorList;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        
        type.setCellValueFactory(new PropertyValueFactory<>("type"));
        price.setCellValueFactory(new PropertyValueFactory<>("price"));

        
        

        
        
        generatorList = Generator.readFromBin();
        
        for (Generator g : generatorList){
            

            
            if (g.getIsPurchaseApproved()==false){
                
                purchaseReqTableView.getItems().add(g);
                
            }
            
            
        
        
        }

        
        
        
        
        
        // TODO
        
        
        
        // TODO
    }    

    @FXML
    private void approveButtonOnClick(ActionEvent event) {
        
        Generator selectedGenerator = purchaseReqTableView.getSelectionModel().getSelectedItem();
    
    if (selectedGenerator != null) {

        
        selectedGenerator.setIsPurchaseApproved(true);

        purchaseReqTableView.refresh();

        int selectedIndex = purchaseReqTableView.getSelectionModel().getSelectedIndex();
        if (selectedIndex >= 0) {
            generatorList.set(selectedIndex, selectedGenerator);
        }
        

        Generator.writeToBin(generatorList);
    }

            
            
        
        
        }
        
    


    
}

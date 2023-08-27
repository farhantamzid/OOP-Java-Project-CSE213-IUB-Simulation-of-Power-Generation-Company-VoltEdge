/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package logintestapplicationMainPkg;

import java.net.URL;
import java.util.ArrayList;
import java.util.List;
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
public class FlagForRepairController implements Initializable {
    
    private ArrayList<Generator> generatorList;

    @FXML
    private TableView<Generator> flagTableView;
    @FXML
    private TableColumn<Generator, Integer> flagIdColumn;
    @FXML
    private TableColumn<Generator, String> flagTypeColumn;
    @FXML
    private TableColumn<Generator, Boolean> flagStatusColumn;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        
                
        flagIdColumn.setCellValueFactory(new PropertyValueFactory<>("id"));
        flagTypeColumn.setCellValueFactory(new PropertyValueFactory<>("type"));
        
        flagStatusColumn.setCellValueFactory(new PropertyValueFactory<>("isOn"));
        
        

        
        
        generatorList = Generator.readFromBin();
        
        for (Generator g : generatorList){
            

            
            if (g.getIsPurchaseApproved()&&(g.getIsFunctional())){
                
                flagTableView.getItems().add(g);
                
            }
            
            
        
        
        }

        
        
        
        
        
      
        
        
        // TODO
    }    

@FXML
private void flagButtonOnClick(ActionEvent event) {
    Generator selectedGenerator = flagTableView.getSelectionModel().getSelectedItem();

    if (selectedGenerator != null && selectedGenerator.getIsFunctional()) {
        // Perform actions on the selectedGenerator
        selectedGenerator.setIsFunctional(false);

        // Refresh the TableView to reflect the changes
        

        // Update the corresponding data in your ArrayList (if needed)
        int selectedIndex = flagTableView.getSelectionModel().getSelectedIndex();
        if (selectedIndex >= 0) {
            generatorList.set(selectedIndex, selectedGenerator);
        }

        // Save the updated data back to your source (e.g., binary file)
        Generator.writeToBin(generatorList);

        // Show updated generator information

    }

    
    
}

    
}

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
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;

/**
 * FXML Controller class
 *
 * @author farhan
 */
public class ConfirmRepairSceneController implements Initializable {
    private ArrayList<Generator> generatorList;
    @FXML
    private TableView<Generator> confirmTableView;
    @FXML
    private TableColumn<Generator, Integer> id;
    @FXML
    private TableColumn<Generator, String> type;
    @FXML
    private TextField downtimeTextField;
    @FXML
    private TextField remarksTextField;
    @FXML
    private TextField issueTextField;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        
                
        id.setCellValueFactory(new PropertyValueFactory<>("id"));
        type.setCellValueFactory(new PropertyValueFactory<>("type"));

        
        

        
        
        generatorList = Generator.readFromBin();
        
        for (Generator g : generatorList){
            

            
            if ((g.getIsFunctional()==false)){
                
                confirmTableView.getItems().add(g);
                
            }
            
            
        
        
        }

        
        
        
        
     
        // TODO
    }    

    @FXML
    private void confirmRepairButtonOnClick(ActionEvent event) {
            Generator selectedGenerator = confirmTableView.getSelectionModel().getSelectedItem();

    if (selectedGenerator != null) {
        
        String issue = issueTextField.getText();
        String downtimeStr = downtimeTextField.getText();
        String remarks = remarksTextField.getText();

        if (issue.isEmpty() || downtimeStr.isEmpty() || remarks.isEmpty()) {
            // Display an error message indicating missing fields
            // Adjust the way you display the error message based on your UI framework
            alert.show("Please fill in all the fields");
            return;
        }
        RepairHistory.newRepair(selectedGenerator.getId(), selectedGenerator.getType(), issueTextField.getText(), Integer.parseInt(downtimeTextField.getText()), remarksTextField.getText());

        // Perform actions on the selectedGenerator
        selectedGenerator.setIsFunctional(true);

        // Refresh the TableView to reflect the changes
        confirmTableView.refresh();

        // Update the corresponding data in your ArrayList (if needed)
        int selectedIndex = confirmTableView.getSelectionModel().getSelectedIndex();
        if (selectedIndex >= 0) {
            generatorList.set(selectedIndex, selectedGenerator);
        }

        // Save the updated data back to your source (e.g., binary file)
        Generator.writeToBin(generatorList);

        // Show updated generator information
        Generator.showGenerators();
    }

    confirmTableView.getItems().clear();
            generatorList = Generator.readFromBin();
        
        for (Generator g : generatorList){
            

            
            if (g.getIsPurchaseApproved()&&(!g.getIsFunctional())){
                
                confirmTableView.getItems().add(g);
                
            }
            
            
            
            
        
        
        }
        
        

        
        
        
        
        
        
        
        
        

        

        
        
    }
    
}

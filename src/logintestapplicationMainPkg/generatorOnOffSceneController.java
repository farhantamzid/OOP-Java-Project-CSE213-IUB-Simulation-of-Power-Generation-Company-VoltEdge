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
public class generatorOnOffSceneController implements Initializable {
    
    private ArrayList<Generator> generatorList;

    @FXML
    private TableColumn<Generator, Integer> id;
    @FXML
    private TableColumn<Generator, String> name;
    @FXML
    private TableColumn<Generator, Integer> power;
    @FXML
    private TableColumn<Generator, Boolean> status;
    @FXML
    private TableView<Generator> equipmentTable;

    /**
     * Initializes the controller class.
     * @param url
     * @param rb
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        
        id.setCellValueFactory(new PropertyValueFactory<>("id"));
        name.setCellValueFactory(new PropertyValueFactory<>("type"));
        power.setCellValueFactory(new PropertyValueFactory<>("power"));
        status.setCellValueFactory(new PropertyValueFactory<>("isOn"));
        
        

        
        
        generatorList = Generator.readFromBin();
        
        for (Generator g : generatorList){
            

            
            if (g.getIsPurchaseApproved()&&(g.getIsFunctional())){
                
                equipmentTable.getItems().add(g);
                
            }
            
            
        
        
        }

        
        
        
        
        
        // TODO
    }    

@FXML
private void onOffButton(ActionEvent event) {
    Generator selectedGenerator = equipmentTable.getSelectionModel().getSelectedItem();
    
    if (selectedGenerator != null) {

        boolean currentStatus = selectedGenerator.getIsOn();
        selectedGenerator.setIsOn(!currentStatus);

        equipmentTable.refresh();

        int selectedIndex = equipmentTable.getSelectionModel().getSelectedIndex();
        if (selectedIndex >= 0) {
            generatorList.set(selectedIndex, selectedGenerator);
        }
        

        Generator.writeToBin(generatorList);
    }

            
            
        Generator.showGenerators();
        
        }
    
}

    


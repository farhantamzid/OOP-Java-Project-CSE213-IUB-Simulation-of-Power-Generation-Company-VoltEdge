/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package logintestapplicationMainPkg;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.net.URL;
import java.time.LocalDate;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;



public class CustomerBuyRenewableController implements Initializable {

    @FXML
    private TextField RenewableAmountTextField;
    @FXML
    private DatePicker RenewablePurchaseDatePicker;
    @FXML
    private Label RenewablePriceViewLabel;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        
    }    

    @FXML
    private void RenewablePurchaseButtonOnClick(ActionEvent event) {
        RenewableElectricity e2 = new RenewableElectricity();
        
    String EnergyType = "Renewable";
    String AmountKWH= RenewableAmountTextField.getText();
    String TotalPrice = Integer.toString(Integer.parseInt(RenewableAmountTextField.getText())*e2.getPrice());
    LocalDate PurchaseDate = RenewablePurchaseDatePicker.getValue();


    String purchaseData = EnergyType + "," + AmountKWH + "," + TotalPrice  + "," + PurchaseDate;

    try (FileWriter fileWriter = new FileWriter("EnergyTableData.txt", true);
         BufferedWriter bufferedWriter = new BufferedWriter(fileWriter)) {

        bufferedWriter.write(purchaseData);
        bufferedWriter.newLine(); // Add a new line for each entry

    } catch (IOException e) {
        e.printStackTrace();
    }
        System.out.println("Button Clicked");
    }
        

    @FXML
    private void RenewableShowPriceButtonOnClick(ActionEvent event) {
        RenewableElectricity e1 = new RenewableElectricity();
        
        RenewablePriceViewLabel.setText(Integer.toString(Integer.parseInt(RenewableAmountTextField.getText())*e1.getPrice())+" "+"Tk.");
        
        
        
    }

    
}

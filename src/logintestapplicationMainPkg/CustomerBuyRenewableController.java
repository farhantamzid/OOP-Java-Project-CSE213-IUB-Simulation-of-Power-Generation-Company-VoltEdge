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
        String amountKWH = RenewableAmountTextField.getText();
        LocalDate purchaseDate = RenewablePurchaseDatePicker.getValue();

        EnergyPurchaseService.purchaseRenewableEnergy(amountKWH, purchaseDate);
        System.out.println("Button Clicked");
    }
        

    @FXML
    private void RenewableShowPriceButtonOnClick(ActionEvent event) {
         
        String amountKWH = RenewableAmountTextField.getText();
        int totalPrice = EnergyPurchaseService.calculateRenewableEnergyPrice(amountKWH);

        RenewablePriceViewLabel.setText(totalPrice + " Tk.");
               
    }

    
}

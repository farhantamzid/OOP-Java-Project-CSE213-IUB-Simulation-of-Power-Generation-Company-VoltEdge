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

/**
 * FXML Controller class
 *
 * @author farhan
 */
public class CustomerBuyNonRenewableController implements Initializable {

    @FXML
    private TextField NonRenewableAmountTextField;
    @FXML
    private DatePicker NonRenewablePurchaseDatePicker;
    @FXML
    private Label NonRenewablePriceViewLabel;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void NonRenewablePurchaseButtonOnClick(ActionEvent event) {
    NonRenewableElectricity e2 = new NonRenewableElectricity();
        
    String EnergyType = "Non-Renewable";
    String AmountKWH= NonRenewableAmountTextField.getText();
    String TotalPrice = Integer.toString(Integer.parseInt(NonRenewableAmountTextField.getText())*e2.getPrice());
    LocalDate PurchaseDate = NonRenewablePurchaseDatePicker.getValue();


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
    private void NonRenewableShowPriceButtonOnClick(ActionEvent event) {
        NonRenewableElectricity e1 = new NonRenewableElectricity();
        
        NonRenewablePriceViewLabel.setText(Integer.toString(Integer.parseInt(NonRenewableAmountTextField.getText())*e1.getPrice())+" "+"Tk.");
        
        
    }
    
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package logintestapplicationMainPkg;

import java.net.URL;
import java.util.List;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;

/**
 * FXML Controller class
 *
 * @author User
 */
public class PayBillController implements Initializable {

    @FXML
    private Label paymentLabel;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        List<PurchaseData> purchaseDataList = PurchaseDataFileHandling.loadPurchaseData();
        int totalPriceSum = PurchaseDataFileHandling.calculateTotalPriceSum(purchaseDataList);

        paymentLabel.setText("Total Price Sum: " + totalPriceSum);
        // TODO
    }    

    @FXML
    private void onActionPayBill(ActionEvent event) {
        List<PurchaseData> purchaseDataList = PurchaseDataFileHandling.loadPurchaseData();
        int totalPriceSum = PurchaseDataFileHandling.calculateTotalPriceSum(purchaseDataList);

        PurchaseDataFileHandling.saveTotalPrice(totalPriceSum);
    }
    }
    

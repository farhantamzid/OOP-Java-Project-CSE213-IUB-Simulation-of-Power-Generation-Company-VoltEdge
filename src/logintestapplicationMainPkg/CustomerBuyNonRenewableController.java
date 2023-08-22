package logintestapplicationMainPkg;

import java.net.URL;
import java.time.LocalDate;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class CustomerBuyNonRenewableController implements Initializable {

    @FXML
    private TextField NonRenewableAmountTextField;
    @FXML
    private DatePicker NonRenewablePurchaseDatePicker;
    @FXML
    private Label NonRenewablePriceViewLabel;

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void NonRenewablePurchaseButtonOnClick(ActionEvent event) {
        String amountKWH = NonRenewableAmountTextField.getText();
        LocalDate purchaseDate = NonRenewablePurchaseDatePicker.getValue();

        EnergyPurchaseService.purchaseNonRenewableEnergy(amountKWH, purchaseDate);
        System.out.println("Button Clicked");
    }

    @FXML
    private void NonRenewableShowPriceButtonOnClick(ActionEvent event) {
        String amountKWH = NonRenewableAmountTextField.getText();
        int totalPrice = EnergyPurchaseService.calculateNonRenewableEnergyPrice(amountKWH);

        NonRenewablePriceViewLabel.setText(totalPrice + " Tk.");
    }
}

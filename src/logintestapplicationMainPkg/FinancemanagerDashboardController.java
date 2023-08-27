/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package logintestapplicationMainPkg;

import java.io.IOException;
import java.net.URL;
import java.time.LocalDate;
import java.util.List;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author User
 */
public class FinancemanagerDashboardController implements Initializable {

    private FinanceManager financeManager;
    @Override
    public void initialize(URL url, ResourceBundle rb) {
    financeManager = new FinanceManager("designation", 0, false, false, "email", "password", "name", LocalDate.now(), 1);
    }    
    @FXML
    private void OnActionPurchaseRequests(ActionEvent event) {
    }

    @FXML
    private void OnActionPaymentHistory(ActionEvent event) {
    }

    @FXML
    private void OnActionExpenseReport(ActionEvent event) throws IOException {
    FXMLLoader loader = new FXMLLoader(getClass().getResource("ExpenseTableView.fxml"));
    Parent root = loader.load();
    Stage stage = new Stage();
    stage.setScene(new Scene(root));
    stage.setTitle("Expense Report");
    stage.show();
}


    @FXML
    private void onActionPurchaseRequests(ActionEvent event) throws IOException {
        
        Parent purchaseRequestApprovalDenialViewParent = FXMLLoader.load(getClass().getResource("purchaseRequestApprovalDenial.fxml"));
        Scene purchaseRequestApprovalDenialViewScene = new Scene(purchaseRequestApprovalDenialViewParent);

        Stage newWindow  = new Stage();
        
        newWindow.setTitle("Approve or deny purchase");
        newWindow.setScene(purchaseRequestApprovalDenialViewScene);
        newWindow.show();
    }

    @FXML
    private void onActionApproveSalary(ActionEvent event) {
    }

    @FXML
    private void OnActionSalaryReport(ActionEvent event) {
    }

    @FXML
    private void OnActionVIewIncomeStatement(ActionEvent event) {
    }

    @FXML
    private void OnActionIncomeStatementGeneration(ActionEvent event) {
    }

}

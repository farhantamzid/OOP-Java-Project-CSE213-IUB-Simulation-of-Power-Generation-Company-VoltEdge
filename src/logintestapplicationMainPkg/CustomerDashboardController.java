/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package logintestapplicationMainPkg;

import java.io.IOException;
import java.net.URL;
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
 * @author farhan
 */
public class CustomerDashboardController implements Initializable {

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    




    @FXML
    private void OnActionRenewable(ActionEvent event) throws IOException{
        
        Parent BuyRenewableViewParent = FXMLLoader.load(getClass().getResource("CustomerBuyRenewable.fxml"));
        Scene BuyRenewableViewScene = new Scene(BuyRenewableViewParent);
        //Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
        Stage newWindow  = new Stage();
        
        newWindow.setTitle("Buy Renewable");
        newWindow.setScene(BuyRenewableViewScene);
        newWindow.show();
    }

    @FXML
    private void OnActionNonRenewable(ActionEvent event) throws IOException{
                        
        Parent CustomerBuyNonRenewableViewParent = FXMLLoader.load(getClass().getResource("CustomerBuyNonRenewable.fxml"));
        Scene CustomerBuyNonRenewableViewScene = new Scene(CustomerBuyNonRenewableViewParent);
        //Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
        Stage newWindow  = new Stage();
        
        newWindow.setTitle("Buy Non-Renewable");
        newWindow.setScene(CustomerBuyNonRenewableViewScene);
        newWindow.show();
    }

    @FXML
    private void OnActionTransactionTable(ActionEvent event)  throws IOException{
                
        Parent CustomerPurchaseTableViewParent = FXMLLoader.load(getClass().getResource("CustomerPurchaseTable.fxml"));
        Scene CustomerPurchaseTableViewScene = new Scene(CustomerPurchaseTableViewParent);
        //Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
        Stage newWindow  = new Stage();
        
        newWindow.setTitle("Purchase Table");
        newWindow.setScene(CustomerPurchaseTableViewScene);
        newWindow.show();
    }

    @FXML
    private void OnActionPieChart(ActionEvent event) throws IOException{
                
        Parent PieChartViewParent = FXMLLoader.load(getClass().getResource("PurchasedEnergyTypePieChart.fxml"));
        Scene PieChartViewScene = new Scene(PieChartViewParent);
        //Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
        Stage newWindow  = new Stage();
        
        newWindow.setTitle("Pie-Chart");
        newWindow.setScene(PieChartViewScene);
        newWindow.show();
        
    }

    
}

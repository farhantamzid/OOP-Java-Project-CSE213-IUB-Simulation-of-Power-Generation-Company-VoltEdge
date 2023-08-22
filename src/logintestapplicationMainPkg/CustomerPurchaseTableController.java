package logintestapplicationMainPkg;

import java.net.URL;
import java.time.LocalDate;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;

public class CustomerPurchaseTableController implements Initializable {

    @FXML
    private TableColumn<PurchaseData, LocalDate> dateColumn;
    @FXML
    private TableColumn<PurchaseData, String> EnergyTypeColumn;
    @FXML
    private TableColumn<PurchaseData, String> AmountColumn;
    @FXML
    private TableColumn<PurchaseData, String> priceColumn;
    @FXML
    private TableView<PurchaseData> purchaseTable;

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        PurchaseTableView.loadPurchaseData(purchaseTable, EnergyTypeColumn, AmountColumn, priceColumn, dateColumn);
    }
}

package logintestapplicationMainPkg;

import java.net.URL;
import java.time.LocalDate;
import java.util.ResourceBundle;
import javafx.beans.property.SimpleObjectProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
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
    private TableColumn<PurchaseData, Integer> priceColumn;
    @FXML
    private TableView<PurchaseData> purchaseTable;

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        setupTableColumns();
        populateTableView();
    }

    private void setupTableColumns() {
        EnergyTypeColumn.setCellValueFactory(cellData -> new SimpleObjectProperty<>(cellData.getValue().getEnergyType()));
        AmountColumn.setCellValueFactory(cellData -> new SimpleObjectProperty(cellData.getValue().getAmountKWH()));
        priceColumn.setCellValueFactory(cellData -> new SimpleObjectProperty(cellData.getValue().getTotalPrice()));
        dateColumn.setCellValueFactory(cellData -> new SimpleObjectProperty<>(cellData.getValue().getPurchaseDate()));
    }

    private void populateTableView() {
        ObservableList<PurchaseData> purchasedatas = FXCollections.observableArrayList(EnergyPurchaseService.readPurchaseData());
        purchaseTable.setItems(purchasedatas);
    }
}

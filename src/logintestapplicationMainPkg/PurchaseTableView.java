package logintestapplicationMainPkg;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.time.LocalDate;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;

public class PurchaseTableView {

    public static void loadPurchaseData(TableView<PurchaseData> purchaseTable,
                                       TableColumn<PurchaseData, String> energyTypeColumn,
                                       TableColumn<PurchaseData, String> amountColumn,
                                       TableColumn<PurchaseData, String> priceColumn,
                                       TableColumn<PurchaseData, LocalDate> dateColumn) {
        energyTypeColumn.setCellValueFactory(new PropertyValueFactory<>("energyType"));
        amountColumn.setCellValueFactory(new PropertyValueFactory<>("amountKWH"));
        priceColumn.setCellValueFactory(new PropertyValueFactory<>("totalPrice"));
        dateColumn.setCellValueFactory(new PropertyValueFactory<>("purchaseDate"));

        try (BufferedReader reader = new BufferedReader(new FileReader("EnergyTableData.txt"))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] parts = line.split(",");
                if (parts.length == 4) {
                    String energyType = parts[0];
                    String amount = parts[1];
                    String totalPrice = parts[2];
                    LocalDate purchaseDate = LocalDate.parse(parts[3]);

                    PurchaseData data = new PurchaseData(energyType, amount, totalPrice, purchaseDate);
                    purchaseTable.getItems().add(data);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

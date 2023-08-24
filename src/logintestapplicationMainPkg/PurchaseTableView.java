package logintestapplicationMainPkg;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.time.LocalDate;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;

public class PurchaseTableView {

    public static void loadPurchaseData(TableView<PurchaseData> purchaseTable,
                                        TableColumn<PurchaseData, String> energyTypeColumn,
                                        TableColumn<PurchaseData, String> amountColumn,
                                        TableColumn<PurchaseData, Integer> priceColumn,
                                        TableColumn<PurchaseData, LocalDate> dateColumn) {
        energyTypeColumn.setCellValueFactory(new PropertyValueFactory<>("energyType"));
        amountColumn.setCellValueFactory(new PropertyValueFactory<>("amountKWH"));
        priceColumn.setCellValueFactory(new PropertyValueFactory<>("totalPrice"));
        dateColumn.setCellValueFactory(new PropertyValueFactory<>("purchaseDate"));

        try (FileInputStream fileInputStream = new FileInputStream("EnergyTableData.bin");
             ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream)) {
            while (true) {
                try {
                    PurchaseData data = (PurchaseData) objectInputStream.readObject();
                    purchaseTable.getItems().add(data);
                } catch (ClassNotFoundException e) {
                    e.printStackTrace();
                    break;
                }
            }
        } catch (IOException e) {
            // The exception will be thrown when the end of the file is reached
            // No need to print the stack trace in this case
        }
    }
}

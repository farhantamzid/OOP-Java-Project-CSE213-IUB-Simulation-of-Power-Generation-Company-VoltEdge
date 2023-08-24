package logintestapplicationMainPkg;

import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.List;

public class PurchaseFileDataReaderPDF {
    public static List<PurchaseData> readPurchaseDataFromFile(String filePath) {
        List<PurchaseData> purchaseDataList = new ArrayList<>();

        try (FileInputStream fis = new FileInputStream(filePath);
             ObjectInputStream ois = new ObjectInputStream(fis)) {
            while (true) {
                PurchaseData purchaseData = (PurchaseData) ois.readObject();
                purchaseDataList.add(purchaseData);
            }
        } catch (Exception e) {
            // Reached end of file or encountered an error
        }

        return purchaseDataList;
    }
}

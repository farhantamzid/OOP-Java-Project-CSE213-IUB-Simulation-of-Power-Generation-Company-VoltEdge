/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package logintestapplicationMainPkg;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class PurchaseFileDataReaderPDF {

    public static List<PurchaseData> readPurchaseDataFromFile(String fileName) {
        List<PurchaseData> purchaseDataList = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] parts = line.split(",");
                if (parts.length == 4) {
                    String energyType = parts[0].trim();
                    String amount = parts[1].trim();
                    String totalDue = parts[2].trim();
                    LocalDate purchaseDate = LocalDate.parse(parts[3].trim());

                    PurchaseData purchaseData = new PurchaseData(energyType, amount, totalDue, purchaseDate);
                    purchaseDataList.add(purchaseData);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return purchaseDataList;
    }
}


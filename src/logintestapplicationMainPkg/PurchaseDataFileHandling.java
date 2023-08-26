/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package logintestapplicationMainPkg;

import java.io.*;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class PurchaseDataFileHandling implements Serializable{

    private static final String File = "purchase_data.bin";

    public static void savePurchaseData(List<PurchaseData> purchaseDataList) {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(File))) {
            oos.writeObject(purchaseDataList);
            System.out.println("Purchase data saved successfully.");
        } catch (IOException e) {
        }
    }

    public static List<PurchaseData> loadPurchaseData() {
        List<PurchaseData> purchaseDataList = new ArrayList<>();
        try (ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream(File))) {
            purchaseDataList = (List<PurchaseData>) inputStream.readObject();
            System.out.println("Purchase data loaded successfully.");
        } catch (IOException | ClassNotFoundException e) {
        }
        return purchaseDataList;
    }
        public static int calculateTotalPriceSum(List<PurchaseData> purchaseDataList) {
        int sum = 0;
        for (PurchaseData purchaseData : purchaseDataList) {
            sum += purchaseData.getTotalPrice();
        }
        return sum;
        

    }
    public static void saveTotalPrice(int totalPrice) {
    try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("total_price.bin"))) {
        oos.writeInt(totalPrice);
        System.out.println("Bill Paid.");
    } catch (IOException e) {
        e.printStackTrace();
    }




}}

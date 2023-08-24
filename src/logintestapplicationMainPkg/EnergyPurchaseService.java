package logintestapplicationMainPkg;

import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class EnergyPurchaseService {

    public static void purchaseNonRenewableEnergy(String amountKWH, LocalDate purchaseDate) {
        NonRenewableElectricity e1 = new NonRenewableElectricity();
        String energyType = "Non-Renewable";
        int totalPrice = Integer.parseInt(amountKWH) * e1.getPrice();
        PurchaseData purchaseData = new PurchaseData(energyType, amountKWH, totalPrice, purchaseDate);
        writePurchaseData(purchaseData);
    }

    public static int calculateNonRenewableEnergyPrice(String amountKWH) {
        NonRenewableElectricity e2 = new NonRenewableElectricity();
        return Integer.parseInt(amountKWH) * e2.getPrice();
    }

    public static void purchaseRenewableEnergy(String amountKWH, LocalDate purchaseDate) {
        RenewableElectricity e3 = new RenewableElectricity();
        String energyType = "Renewable";
        int totalPrice = Integer.parseInt(amountKWH) * e3.getPrice();
        PurchaseData purchaseData = new PurchaseData(energyType, amountKWH, totalPrice, purchaseDate);
        writePurchaseData(purchaseData);
    }

    public static int calculateRenewableEnergyPrice(String amountKWH) {
        RenewableElectricity e4 = new RenewableElectricity();
        return Integer.parseInt(amountKWH) * e4.getPrice();
    }

    private static void writePurchaseData(PurchaseData purchaseData) {
        try (FileOutputStream fileOutputStream = new FileOutputStream("EnergyTableData.bin", true);
             BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(fileOutputStream);
             ObjectOutputStream objectOutputStream = new ObjectOutputStream(bufferedOutputStream)) {

            objectOutputStream.writeObject(purchaseData);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static List<PurchaseData> readPurchaseData() {
        List<PurchaseData> purchaseDataList = new ArrayList<>();
        try (FileInputStream fileInputStream = new FileInputStream("EnergyTableData.bin");
             ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream)) {

            while (true) {
                try {
                    PurchaseData purchaseData = (PurchaseData) objectInputStream.readObject();
                    purchaseDataList.add(purchaseData);
                } catch (ClassNotFoundException e) {
                    e.printStackTrace();
                    break;
                }
            }
        } catch (IOException e) {
            // The exception will be thrown when the end of the file is reached
            // No need to print the stack trace in this case
        }
        return purchaseDataList;
    }
}

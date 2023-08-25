package logintestapplicationMainPkg;

import java.time.LocalDate;
import java.util.List;



public class EnergyPurchaseService {
    private static List<PurchaseData> purchaseDataList = PurchaseDataFileHandling.loadPurchaseData();


     public static void purchaseNonRenewableEnergy(String amountKWH, LocalDate purchaseDate) {
        NonRenewableElectricity e1 = new NonRenewableElectricity();
        String energyType = "Non-Renewable";
        int totalPrice = Integer.parseInt(amountKWH) * e1.getPrice();
        PurchaseData purchaseData = new PurchaseData(energyType, amountKWH, totalPrice, purchaseDate);
        purchaseDataList.add(purchaseData);
        PurchaseDataFileHandling.savePurchaseData(purchaseDataList);
   
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
        purchaseDataList.add(purchaseData);
        PurchaseDataFileHandling.savePurchaseData(purchaseDataList);
    }
    
    public static int calculateRenewableEnergyPrice(String amountKWH) {
        RenewableElectricity e4 = new RenewableElectricity();
        return Integer.parseInt(amountKWH) * e4.getPrice();
    }

}

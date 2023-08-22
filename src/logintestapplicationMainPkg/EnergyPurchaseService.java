package logintestapplicationMainPkg;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDate;

public class EnergyPurchaseService {

    public static void purchaseNonRenewableEnergy(String amountKWH, LocalDate purchaseDate) {
        NonRenewableElectricity e2 = new NonRenewableElectricity();
        
        String energyType = "Non-Renewable";
        String totalPrice = Integer.toString(Integer.parseInt(amountKWH) * e2.getPrice());

        String purchaseData = energyType + "," + amountKWH + "," + totalPrice + "," + purchaseDate;

        try (FileWriter fileWriter = new FileWriter("EnergyTableData.txt", true);
             BufferedWriter bufferedWriter = new BufferedWriter(fileWriter)) {

            bufferedWriter.write(purchaseData);
            bufferedWriter.newLine(); // Add a new line for each entry

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static int calculateNonRenewableEnergyPrice(String amountKWH) {
        NonRenewableElectricity e1 = new NonRenewableElectricity();
        return Integer.parseInt(amountKWH) * e1.getPrice();
    }
}

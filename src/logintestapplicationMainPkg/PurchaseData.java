/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package logintestapplicationMainPkg;

import java.time.LocalDate;

/**
 *
 * @author farhan
 */
public class PurchaseData {
    private String EnergyType;
    private String AmountKWH;
    private String  TotalPrice;
    private LocalDate PurchaseDate;

    public PurchaseData(String energytype, String amountkwh, String totalprice, LocalDate purchasedate) {
        this.EnergyType = energytype;
        this.AmountKWH = amountkwh;
        this.TotalPrice = totalprice;
        this.PurchaseDate = purchasedate;
    }

    public String getEnergyType() {
        return EnergyType;
    }

    public String getAmountKWH() {
        return AmountKWH;
    }

    public String getTotalPrice() {
        return TotalPrice;
    }

    public LocalDate getPurchaseDate() {
        return PurchaseDate;
    }
}


/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package logintestapplicationMainPkg;

import java.io.Serializable;
import java.time.LocalDate;


public class PurchaseData implements Serializable{
    private String EnergyType;
    private String AmountKWH;
    private Integer  TotalPrice;
    private LocalDate PurchaseDate;

    public void setEnergyType(String EnergyType) {
        this.EnergyType = EnergyType;
    }

    public void setAmountKWH(String AmountKWH) {
        this.AmountKWH = AmountKWH;
    }

    public void setTotalPrice(Integer TotalPrice) {
        this.TotalPrice = TotalPrice;
    }

    public void setPurchaseDate(LocalDate PurchaseDate) {
        this.PurchaseDate = PurchaseDate;
    }

    public PurchaseData(String energytype, String amountkwh, Integer totalprice, LocalDate purchasedate) {
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

    public Integer getTotalPrice() {
        return TotalPrice;
    }

    public LocalDate getPurchaseDate() {
        return PurchaseDate;
    }
}


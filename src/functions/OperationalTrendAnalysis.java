/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package functions;

import java.time.LocalDate;

/**
 *
 * @author Dell
 */
public class OperationalTrendAnalysis {
     private String equipmentId;
    private LocalDate date;
    private double powerOutputMW;
    private double efficiency;
    private double fuelConsumptionTons;
    private double downtimeDurationHours;
    private int errorCount;

    public OperationalTrendAnalysis(String equipmentId, LocalDate date, double powerOutputMW,
                                    double efficiency, double fuelConsumptionTons,
                                    double downtimeDurationHours, int errorCount) {
        this.equipmentId = equipmentId;
        this.date = date;
        this.powerOutputMW = powerOutputMW;
        this.efficiency = efficiency;
        this.fuelConsumptionTons = fuelConsumptionTons;
        this.downtimeDurationHours = downtimeDurationHours;
        this.errorCount = errorCount;
    }

    public OperationalTrendAnalysis(String equipmentId, int errorCount) {
       this.equipmentId = equipmentId;
       this.errorCount = errorCount;; // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public String getEquipmentId() {
        return equipmentId;
    }

    public void setEquipmentId(String equipmentId) {
        this.equipmentId = equipmentId;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public double getPowerOutputMW() {
        return powerOutputMW;
    }

    public void setPowerOutputMW(double powerOutputMW) {
        this.powerOutputMW = powerOutputMW;
    }

    public double getEfficiency() {
        return efficiency;
    }

    public void setEfficiency(double efficiency) {
        this.efficiency = efficiency;
    }

    public double getFuelConsumptionTons() {
        return fuelConsumptionTons;
    }

    public void setFuelConsumptionTons(double fuelConsumptionTons) {
        this.fuelConsumptionTons = fuelConsumptionTons;
    }

    public double getDowntimeDurationHours() {
        return downtimeDurationHours;
    }

    public void setDowntimeDurationHours(double downtimeDurationHours) {
        this.downtimeDurationHours = downtimeDurationHours;
    }

    public int getErrorCount() {
        return errorCount;
    }

    public void setErrorCount(int errorCount) {
        this.errorCount = errorCount;
    }
    
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package functions;

import java.io.Serializable;
import java.time.LocalDate;

/**
 *
 * @author Dell
 */
public class FuelCostandUsage implements Serializable {
      private String fuelType;
    private double cost;
    private LocalDate entryDate;

    public FuelCostandUsage(String fuelType, double cost, LocalDate entryDate) {
        this.fuelType = fuelType;
        this.cost = cost;
        this.entryDate = entryDate;
    }

    public String getFuelType() {
        return fuelType;
    }

    public void setFuelType(String fuelType) {
        this.fuelType = fuelType;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    public LocalDate getEntryDate() {
        return entryDate;
    }

    public void setEntryDate(LocalDate entryDate) {
        this.entryDate = entryDate;
    }
    
    
}

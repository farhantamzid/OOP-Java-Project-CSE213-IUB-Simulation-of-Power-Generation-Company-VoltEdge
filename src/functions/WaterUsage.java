/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package functions;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.Date;


/**
 *
 * @author Dell
 */
 public class WaterUsage implements Serializable {
    
    private LocalDate date;
    private double waterConsumptionLiters;
    private String location;
    private String usageType;
    private double temperature;
    private String weatherConditions;
    private boolean unusualSpike;

    public WaterUsage(LocalDate date, double waterConsumptionLiters, String location,
            String usageType, double temperature, String weatherConditions, boolean unusualSpike) {
     
            this.date = date;
            this.waterConsumptionLiters = waterConsumptionLiters;
            this.location = location;
            this.usageType = usageType;
            this.temperature = temperature;
            this.weatherConditions = weatherConditions;
            this.unusualSpike = unusualSpike;
    }

    public LocalDate getDateTime() {
        return date;
    } 
    

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public double getWaterConsumptionLiters() {
        return waterConsumptionLiters;
    }

    public void setWaterConsumptionLiters(double waterConsumptionLiters) {
        this.waterConsumptionLiters = waterConsumptionLiters;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getUsageType() {
        return usageType;
    }

    public void setUsageType(String usageType) {
        this.usageType = usageType;
    }

    public double getTemperature() {
        return temperature;
    }

    public void setTemperature(double temperature) {
        this.temperature = temperature;
    }

    public String getWeatherConditions() {
        return weatherConditions;
    }

    public void setWeatherConditions(String weatherConditions) {
        this.weatherConditions = weatherConditions;
    }

   

    public boolean isUnusualSpike() {
        return unusualSpike;
    }

    public void setUnusualSpike(boolean unusualSpike) {
        this.unusualSpike = unusualSpike;
    }

    public LocalDate getDate() {
        return date;
    }
    
    
    
}

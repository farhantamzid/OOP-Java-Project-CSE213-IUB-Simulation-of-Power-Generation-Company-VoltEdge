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
public class OperationPerformanceData implements Serializable {

    private int PlantId;
    private double PowerOutput;
    private double FuelConsumption;
    private double EfficiencyRate;
    private double OperatingTemperature;
    private double EmissionLevels;
    private double NoiseLevels;
    private double EquipmentRunningHours;
    private LocalDate date;

    public OperationPerformanceData(int PlantId, double PowerOutput, double FuelConsumption,
            double EfficiencyRate, double OperatingTemperature, double EmissionLevels, double NoiseLevels, 
            double EquipmentRunningHours, LocalDate date) {
        this.PlantId = PlantId;
        this.PowerOutput = PowerOutput;
        this.FuelConsumption = FuelConsumption;
        this.EfficiencyRate = EfficiencyRate;
        this.OperatingTemperature = OperatingTemperature;
        this.EmissionLevels = EmissionLevels;
        this.NoiseLevels = NoiseLevels;
        this.EquipmentRunningHours = EquipmentRunningHours;
        this.date = date;
    }

    public int getPlantId() {
        return PlantId;
    }

    public void setPlantId(int PlantId) {
        this.PlantId = PlantId;
    }

    public double getPowerOutput() {
        return PowerOutput;
    }

    public void setPowerOutput(double PowerOutput) {
        this.PowerOutput = PowerOutput;
    }

    public double getFuelConsumption() {
        return FuelConsumption;
    }

    public void setFuelConsumption(double FuelConsumption) {
        this.FuelConsumption = FuelConsumption;
    }

    public double getEfficiencyRate() {
        return EfficiencyRate;
    }

    public void setEfficiencyRate(double EfficiencyRate) {
        this.EfficiencyRate = EfficiencyRate;
    }

    public double getOperatingTemperature() {
        return OperatingTemperature;
    }

    public void setOperatingTemperature(double OperatingTemperature) {
        this.OperatingTemperature = OperatingTemperature;
    }

    public double getEmissionLevels() {
        return EmissionLevels;
    }

    public void setEmissionLevels(double EmissionLevels) {
        this.EmissionLevels = EmissionLevels;
    }

    public double getNoiseLevels() {
        return NoiseLevels;
    }

    public void setNoiseLevels(double NoiseLevels) {
        this.NoiseLevels = NoiseLevels;
    }

    public double getEquipmentRunningHours() {
        return EquipmentRunningHours;
    }

    public void setEquipmentRunningHours(double EquipmentRunningHours) {
        this.EquipmentRunningHours = EquipmentRunningHours;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

}

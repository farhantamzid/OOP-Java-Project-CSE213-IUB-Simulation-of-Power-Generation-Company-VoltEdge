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
public class EquipmentRepairsReplacements {
     private String repairReplacementId;
    private String equipmentId;
    private LocalDate date;
    private String typeOfWork;
    private String componentReplaced;
    private String technicianProvider;
    private double costUSD;
    private double durationHours;
    private String description;

    public EquipmentRepairsReplacements(String repairReplacementId, String equipmentId, LocalDate date,
                                        String typeOfWork, String componentReplaced, String technicianProvider,
                                        double costUSD, double durationHours, String description) {
        this.repairReplacementId = repairReplacementId;
        this.equipmentId = equipmentId;
        this.date = date;
        this.typeOfWork = typeOfWork;
        this.componentReplaced = componentReplaced;
        this.technicianProvider = technicianProvider;
        this.costUSD = costUSD;
        this.durationHours = durationHours;
        this.description = description;
    }

    public String getRepairReplacementId() {
        return repairReplacementId;
    }

    public void setRepairReplacementId(String repairReplacementId) {
        this.repairReplacementId = repairReplacementId;
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

    public String getTypeOfWork() {
        return typeOfWork;
    }

    public void setTypeOfWork(String typeOfWork) {
        this.typeOfWork = typeOfWork;
    }

    public String getComponentReplaced() {
        return componentReplaced;
    }

    public void setComponentReplaced(String componentReplaced) {
        this.componentReplaced = componentReplaced;
    }

    public String getTechnicianProvider() {
        return technicianProvider;
    }

    public void setTechnicianProvider(String technicianProvider) {
        this.technicianProvider = technicianProvider;
    }

    public double getCostUSD() {
        return costUSD;
    }

    public void setCostUSD(double costUSD) {
        this.costUSD = costUSD;
    }

    public double getDurationHours() {
        return durationHours;
    }

    public void setDurationHours(double durationHours) {
        this.durationHours = durationHours;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
    
}

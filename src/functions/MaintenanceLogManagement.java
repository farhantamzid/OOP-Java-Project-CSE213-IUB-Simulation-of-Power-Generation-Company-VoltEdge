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
public class MaintenanceLogManagement {
    private String maintenanceId;
    private String equipmentId;
    private LocalDate date;
    private String maintenanceType;
    private String techniciansInvolved;
    private double durationHours;
    private String description;
    private String sparePartsUsed;

    public MaintenanceLogManagement(String maintenanceId, String equipmentId, LocalDate date,
                                    String maintenanceType, String techniciansInvolved,
                                    double durationHours, String description, String sparePartsUsed) {
        this.maintenanceId = maintenanceId;
        this.equipmentId = equipmentId;
        this.date = date;
        this.maintenanceType = maintenanceType;
        this.techniciansInvolved = techniciansInvolved;
        this.durationHours = durationHours;
        this.description = description;
        this.sparePartsUsed = sparePartsUsed;
    }

    public MaintenanceLogManagement(String equipmentId, LocalDate date,double durationHours ) {
       this.equipmentId = equipmentId; 
       this.date = date;
        this.durationHours = durationHours;

    }

  

    public String getMaintenanceId() {
        return maintenanceId;
    }

    public void setMaintenanceId(String maintenanceId) {
        this.maintenanceId = maintenanceId;
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

    public String getMaintenanceType() {
        return maintenanceType;
    }

    public void setMaintenanceType(String maintenanceType) {
        this.maintenanceType = maintenanceType;
    }

    public String getTechniciansInvolved() {
        return techniciansInvolved;
    }

    public void setTechniciansInvolved(String techniciansInvolved) {
        this.techniciansInvolved = techniciansInvolved;
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

    public String getSparePartsUsed() {
        return sparePartsUsed;
    }

    public void setSparePartsUsed(String sparePartsUsed) {
        this.sparePartsUsed = sparePartsUsed;
    }
    
}

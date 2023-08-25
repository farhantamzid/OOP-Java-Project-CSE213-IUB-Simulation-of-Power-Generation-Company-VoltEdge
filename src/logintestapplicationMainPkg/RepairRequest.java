/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package logintestapplicationMainPkg;

import java.io.Serializable;

/**
 *
 * @author User
 */
public class RepairRequest implements Serializable {

    @Override
    public String toString() {
        return "RepairRequest{" + "repairType=" + repairType + ", repairDescription=" + repairDescription + ", repairStatus=" + repairStatus + '}';
    }

    public RepairRequest(String repairType, String repairDescription, boolean repairStatus) {
        this.repairType = repairType;
        this.repairDescription = repairDescription;
        this.repairStatus = repairStatus;
    }

    public String getRepairType() {
        return repairType;
    }

    public void setRepairType(String repairType) {
        this.repairType = repairType;
    }

    public String getRepairDescription() {
        return repairDescription;
    }

    public void setRepairDescription(String repairDescription) {
        this.repairDescription = repairDescription;
    }

    public boolean isRepairStatus() {
        return repairStatus;
    }

    public void setRepairStatus(boolean repairStatus) {
        this.repairStatus = repairStatus;
    }
    private String repairType;
    private String repairDescription;
    private boolean repairStatus;
    
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package logintestapplicationMainPkg;

import java.io.Serializable;
import java.time.LocalDate;

/**
 *
 * @author User
 */
public class Connection implements Serializable{
    private String connectionplantName;
    private String connectionLocation;
    private LocalDate connectionDate;
    private Integer plantID;

    @Override
    public String toString() {
        return "Connection{" + "connectionplantName=" + connectionplantName + ", connectionLocation=" + connectionLocation + ", connectionDate=" + connectionDate + ", plantID=" + plantID + '}';
    }

    public Connection(String connectionplantName, String connectionLocation, LocalDate connectionDate, Integer plantID) {
        this.connectionplantName = connectionplantName;
        this.connectionLocation = connectionLocation;
        this.connectionDate = connectionDate;
        this.plantID = plantID;
    }

    public Integer getPlantID() {
        return plantID;
    }

    public void setPlantID(Integer plantID) {
        this.plantID = plantID;
    }

       
    public String getConnectionplantName() {
        return connectionplantName;
    }

    public void setConnectionplantName(String connectionplantName) {
        this.connectionplantName = connectionplantName;
    }

    public String getConnectionLocation() {
        return connectionLocation;
    }

    public void setConnectionLocation(String connectionLocation) {
        this.connectionLocation = connectionLocation;
    }

    public LocalDate getConnectionDate() {
        return connectionDate;
    }

    public void setConnectionDate(LocalDate connectionDate) {
        this.connectionDate = connectionDate;
    }

    
    
}

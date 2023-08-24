/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package logintestapplicationMainPkg;

import java.time.LocalDate;

/**
 *
 * @author User
 */
public class RepairConnection extends Connection{

    public RepairConnection(boolean checkbox, String connectionplantName, String connectionLocation, LocalDate connectionDate, Integer plantID) {
        super(connectionplantName, connectionLocation, connectionDate, plantID);
        this.checkbox = checkbox;
    }

    @Override
    public String toString() {
        return "RepairConnection{" + "checkbox=" + checkbox + '}';
    }

    public boolean isCheckbox() {
        return checkbox;
    }

    public void setCheckbox(boolean checkbox) {
        this.checkbox = checkbox;
    }
    public boolean checkbox;
    
    public RepairConnection(String connectionplantName, String connectionLocation, LocalDate connectionDate, Integer plantID) {
        super(connectionplantName, connectionLocation, connectionDate, plantID);
    }
    
}

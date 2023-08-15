/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package logintestapplicationMainPkg;

import java.io.Serializable;
import java.time.LocalDate;
import java.time.LocalDateTime;

/**
 *
 * @author User
 */
public class Employee extends User implements Serializable {
    protected String designation;
    protected int salary;
    protected boolean attendance;
    protected boolean applyforleave;

    public boolean isApplyforleave() {
        return applyforleave;
    }

    public void setApplyforleave(boolean applyforleave) {
        this.applyforleave = applyforleave;
    }
    
    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public String getDesignation() {
        return designation;
    }

    public int getSalary() {
        return salary;
    }

    public void setAttendance(boolean attendance) {
        this.attendance = attendance;
    }

    public boolean isAttendance() {
        return attendance;
    }

    public boolean unmarkAttendance(){
        return attendance;
    
    
    }

    public Employee(String designation, int salary, boolean attendance, boolean applyforleave, String email, String password, String name, LocalDate dob, int id) {
        super(email, password, name, dob, id);
        this.designation = designation;
        this.salary = salary;
        this.attendance = attendance;
        this.applyforleave = applyforleave;
    }
}





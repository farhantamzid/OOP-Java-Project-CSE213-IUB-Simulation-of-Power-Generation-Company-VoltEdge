/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package logintestapplicationMainPkg;

import java.io.Serializable;
import java.time.LocalDate;

/**
 *
 * @author farhan
 */
public class Engineer extends Employee implements Serializable{
    
    public Engineer(String designation, int salary, boolean attendance, boolean applyforleave, String email, String password, String name, LocalDate dob, int id) {
        super(designation, salary, attendance, applyforleave, email, password, name, dob, id);
        
        
    }
    
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package logintestapplicationMainPkg;

import java.time.LocalDate;

/**
 *
 * @author farhan
 */
public class Customer extends User {
    protected String name;
    protected LocalDate doj;
    protected LocalDate dob;
    
    
    
    public Customer(String email, String password,String name, LocalDate doj, LocalDate dob) {
        super(email, password);
        this.name=name;
        this.doj=doj;
        this.dob=dob;
        
    }
    
    
    
}

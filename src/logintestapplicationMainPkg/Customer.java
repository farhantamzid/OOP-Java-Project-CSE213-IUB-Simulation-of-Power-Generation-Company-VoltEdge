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
public class Customer extends User implements Serializable{
    
    
    public Customer(String email, String password, String name, LocalDate dob, int id) {
        super(email, password, name, dob, id);
    }
    
}

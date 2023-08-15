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
public class User implements Serializable {
    
    protected String email;
    protected String password;
    protected String name;
    protected LocalDate dob;
    protected int id;

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }

    public String getName() {
        return name;
    }

    public LocalDate getDob() {
        return dob;
    }

    public int getId() {
        return id;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDob(LocalDate dob) {
        this.dob = dob;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "User{" + "email=" + email + ", password=" + password + ", name=" + name + ", dob=" + dob + ", id=" + id + '}';
    }

    public User(String email, String password, String name, LocalDate dob, int id) {
        this.email = email;
        this.password = password;
        this.name = name;
        this.dob = dob;
        this.id = id;
    }
}

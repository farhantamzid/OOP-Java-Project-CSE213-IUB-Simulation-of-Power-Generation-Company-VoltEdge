/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package functions;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.List;

/**
 *
 * @author Dell
 */
public class EmissionData {

    private String powerPlant;
    private String pollutant;
    private double emissions;
    private LocalDate date;

    public EmissionData(String powerPlant, String pollutant, double emissions, LocalDate date) {
        this.powerPlant = powerPlant;
        this.pollutant = pollutant;
        this.emissions = emissions;
        this.date = date;
    }

    public String getPowerPlant() {
        return powerPlant;
    }

    // Getters and setters for your other fields
    public String getPollutant() {
        return pollutant;
    }

    public double getEmissions() {
        return emissions;
    }

    public LocalDate getDate() {
        return date;
    }

}

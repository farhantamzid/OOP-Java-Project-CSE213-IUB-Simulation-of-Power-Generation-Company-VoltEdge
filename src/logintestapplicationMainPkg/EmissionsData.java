package logintestapplicationMainPkg;

import java.time.LocalDate;

public class EmissionsData {
    private String powerPlant;
    private String pollutant;
    private double emissions;
    private LocalDate date;

    public EmissionsData(String powerPlant, String pollutant, double emissions, LocalDate date) {
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

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package people;

import functions.EmissionData;
import functions.WaterUsage;
import functions.OperationPerformanceData;
import functions.RelevantRegulations;
import functions.WasteDisposal;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.swing.event.DocumentListener;
import javax.swing.event.UndoableEditListener;
import javax.swing.text.AttributeSet;
import javax.swing.text.BadLocationException;
import javax.swing.text.Document;
import javax.swing.text.Element;
import javax.swing.text.Position;
import javax.swing.text.Segment;

/**
 *
 * @author Dell
 */
public class EnvironmentalComplianceOfficer extends Employee {

    public EnvironmentalComplianceOfficer(String name, String address, String email, String phoneNumber, String empPassword, 
        int salary, LocalDate dateOfBirth) {
        super(name, address, email, phoneNumber, empPassword, salary, dateOfBirth);
    }

    public void writeEmissionDataToFile(String powerPlant, String pollutant,
            double emissions, LocalDate date, String fileName) {
        EmissionData emissionData = new EmissionData(powerPlant, pollutant, emissions, date);
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(fileName, true))) {
            String line = String.format("%s,%s,%.2f,%s%n",
                    emissionData.getPowerPlant(),
                    emissionData.getPollutant(),
                    emissionData.getEmissions(),
                    emissionData.getDate().toString());

            writer.write(line);
            System.out.println("Emission data written to file successfully.");
        } catch (IOException e) {
            e.printStackTrace();
            System.err.println("Error while writing emission data to file.");
        }
    }

    public static void writeOperationPerformanceDataToBin(int PlantId, double PowerOutput, double FuelConsumption,
            double EfficiencyRate, double OperatingTemperature, double EmissionLevels, double NoiseLevels,
            double EquipmentRunningHours, LocalDate date, String fileName) {
        OperationPerformanceData opdata = new OperationPerformanceData(PlantId, PowerOutput, FuelConsumption, EfficiencyRate,
                OperatingTemperature, EmissionLevels, NoiseLevels, EquipmentRunningHours, date);

        try (ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream(fileName, true))) {
            outputStream.writeObject(opdata);
            System.out.println("Operation performance data written to bin file successfully.");
        } catch (IOException e) {
            e.printStackTrace();
            System.err.println("Error while writing operation performance data to bin file.");

        }

    }

    public static List<OperationPerformanceData> readOperationPerformanceDatafromBin(String fileName) {
        List<OperationPerformanceData> dataList = new ArrayList<>();

        try (ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream(fileName))) {
            while (true) {
                OperationPerformanceData opdata = (OperationPerformanceData) inputStream.readObject();
                dataList.add(opdata);
            }
        } catch (EOFException e) {
            // Reached end of file, stop reading
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
            System.err.println("Error while reading operation performance data from bin file.");
        }

        return dataList;
    }

    // Other methods in the class
    public static void main(String[] args) {
        String binFileName = "operation_performance_data.bin";
        List<OperationPerformanceData> dataList = readOperationPerformanceDatafromBin(binFileName);

        // You can now use the dataList to populate your TableView
        // For example, pass it to your JavaFX controller and set it as the items for the TableView
    }

    public static List<EmissionData> readFromEmissionDatafromText(String fileName) {
        List<EmissionData> dataList = new ArrayList<>();

        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] parts = line.split(",");
                if (parts.length == 4) {
                    String id = parts[0];
                    String pollutant = parts[1];
                    double emissions = Double.parseDouble(parts[2]);
                    LocalDate date = LocalDate.parse(parts[3]);
                    EmissionData emissionData = new EmissionData(id, pollutant, emissions, date);
                    dataList.add(emissionData);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
            System.err.println("Error while reading data from file.");
        }

        return dataList;
    }

    public static void writeRelevantRegulationsToBin(String regulationId, String title, String text, Date dateAdded,
            String complianceStatus, Date lastUpdatedDate, String filename) {
        RelevantRegulations rr = new RelevantRegulations(regulationId, title, text, dateAdded,
                complianceStatus, lastUpdatedDate);

        try (ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream(filename, true))) {
            outputStream.writeObject(rr);
            System.out.println("RelevantRegulations written to bin file successfully.");
        } catch (IOException e) {
            e.printStackTrace();
            System.err.println("Error while writing RelevantRegulations to bin file.");

        }

    }

    public static void writeWasteDisposalToFileText(Date dateOfDisposal, String wasteType, double quantity,
            String locationOfDisposal, String disposersName, String disposalDocumentation,
            String regulatoryCompliance, String Filename) {
        WasteDisposal wd = new WasteDisposal(dateOfDisposal, wasteType, quantity,
                locationOfDisposal, disposersName, disposalDocumentation,
                regulatoryCompliance);

        try (BufferedWriter writer = new BufferedWriter(new FileWriter(Filename, true))) {
            String line = String.format("%s,%s,%.2f,%s,%s,%s,%s%n",
                    wd.getDateOfDisposal(),
                    wd.getWasteType(),
                    wd.getQuantity(),
                    wd.getLocationOfDisposal(),
                    wd.getDisposersName(),
                    wd.getDisposalDocumentation(),
                    wd.getRegulatoryCompliance());

            writer.write(line);
            System.out.println("Emission data written to file successfully.");
        } catch (IOException e) {
            e.printStackTrace();
            System.err.println("Error while writing emission data to file.");
        }

    }

    public static List<WasteDisposal> readWasteDisposalDataFromFile(String filename) {
        List<WasteDisposal> wasteDisposals = new ArrayList<>();
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd"); // Adjust the format as per your date format

        try (BufferedReader reader = new BufferedReader(new FileReader(filename))) {
            String line; // Skip the header line
            reader.readLine();
            while ((line = reader.readLine()) != null) {
                String[] parts = line.split(",");
                if (parts.length >= 7) {
                    try {
                        Date dateOfDisposal = dateFormat.parse(parts[0]);
                        WasteDisposal wd = new WasteDisposal(dateOfDisposal, parts[1], Double.parseDouble(parts[2]),
                                parts[3], parts[4], parts[5], parts[6]);
                        wasteDisposals.add(wd);
                    } catch (ParseException e) {
                        e.printStackTrace();
                    }
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        return wasteDisposals;
    }
    
   public static void writeWaterUsageToBin(LocalDate date, double waterConsumptionLiters, String location,
            String usageType, double temperature, String weatherConditions, boolean unusualSpike, String fileName) {

        WaterUsage ws = new WaterUsage(date, waterConsumptionLiters, location, usageType, temperature,
                weatherConditions, unusualSpike); // Assuming WaterUsage class constructor accepts these parameters

        try (ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream(fileName, true))) {
            outputStream.writeObject(ws);
            System.out.println("WaterUsage written to bin file successfully.");
        } catch (IOException e) {
            e.printStackTrace();
            System.err.println("Error while writing WaterUsage to bin file.");
        }
    }
   
  
     
    public static List<WaterUsage> loadDataFromBinFile(String fileName) {
        List<WaterUsage> waterUsages = new ArrayList<>();

        try (ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream(fileName))) {
            while (true) {
                WaterUsage waterUsage = (WaterUsage) inputStream.readObject();
                waterUsages.add(waterUsage);
            }
        } catch (EOFException e) {
            // End of file reached
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }

        return waterUsages;
    }
   
   
   

   
    

}

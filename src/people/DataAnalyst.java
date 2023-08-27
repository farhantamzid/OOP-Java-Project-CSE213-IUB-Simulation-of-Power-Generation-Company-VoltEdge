package people;


import functions.EquipmentRepairsReplacements;
import functions.FuelCostandUsage;
import functions.MaintenanceLogManagement;
import functions.OperationalTrendAnalysis;
import java.io.BufferedReader;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.PrintWriter;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class DataAnalyst extends Employee {

    public DataAnalyst(String name, String address, String email, String phoneNumber, String empPassword, 
        int salary, LocalDate dateOfBirth) {
        super(name, address, email, phoneNumber, empPassword, salary, dateOfBirth);
    }

    public void writeFuelCostinBIN(String fuelType, double cost, LocalDate entryDate, String fileName) {
        FuelCostandUsage fuel = new FuelCostandUsage(fuelType, cost, entryDate);

        try (ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream(fileName, true))) {
            outputStream.writeObject(fuel);
            System.out.println("Fuel cost data written to bin file successfully.");
        } catch (IOException e) {
            e.printStackTrace();
            System.err.println("Error while writing fuel cost data to bin file.");
        }
    }

    public void writeOperationalTrendAnalysisToFile(OperationalTrendAnalysis analysis) {
        String fileName = "operational_trend_analysis.txt";

        try (PrintWriter writer = new PrintWriter(new FileWriter(fileName, true))) {
            writer.println("Equipment ID: " + analysis.getEquipmentId());
            writer.println("Date: " + analysis.getDate());
            writer.println("Power Output (MW): " + analysis.getPowerOutputMW());
            writer.println("Efficiency: " + analysis.getEfficiency());
            writer.println("Fuel Consumption (Tons): " + analysis.getFuelConsumptionTons());
            writer.println("Downtime Duration (Hours): " + analysis.getDowntimeDurationHours());
            writer.println("Error Count: " + analysis.getErrorCount());
            writer.println();  // Add an empty line to separate entries

            System.out.println("Operational trend analysis data written to file: " + fileName);
        } catch (IOException e) {
            System.err.println("Error writing to file: " + e.getMessage());
        }
    }

    public void writeMaintenanceLogManagement(MaintenanceLogManagement maintenanceLog) {
        String fileName = "maintenance_log.txt";

        try (PrintWriter writer = new PrintWriter(new FileWriter(fileName, true))) {
            writer.println("Maintenance ID: " + maintenanceLog.getMaintenanceId());
            writer.println("Equipment ID: " + maintenanceLog.getEquipmentId());
            writer.println("Date: " + maintenanceLog.getDate());
            writer.println("Maintenance Type: " + maintenanceLog.getMaintenanceType());
            writer.println("Technicians Involved: " + maintenanceLog.getTechniciansInvolved());
            writer.println("Duration (Hours): " + maintenanceLog.getDurationHours());
            writer.println("Description: " + maintenanceLog.getDescription());
            writer.println("Spare Parts Used: " + maintenanceLog.getSparePartsUsed());
            writer.println();  // Add an empty line to separate entries

            System.out.println("Maintenance log data written to file: " + fileName);
        } catch (IOException e) {
            System.err.println("Error writing to file: " + e.getMessage());
        }
    }

    public void writeEquipmentRepairsReplacements(EquipmentRepairsReplacements repairsReplacements) {
        String fileName = "equipment_repairs_replacements.txt";

        try (PrintWriter writer = new PrintWriter(new FileWriter(fileName, true))) {
            writer.println("Repair/Replacement ID: " + repairsReplacements.getRepairReplacementId());
            writer.println("Equipment ID: " + repairsReplacements.getEquipmentId());
            writer.println("Date: " + repairsReplacements.getDate());
            writer.println("Type of Work: " + repairsReplacements.getTypeOfWork());
            writer.println("Component Replaced: " + repairsReplacements.getComponentReplaced());
            writer.println("Technician Provider: " + repairsReplacements.getTechnicianProvider());
            writer.println("Cost (USD): " + repairsReplacements.getCostUSD());
            writer.println("Duration (Hours): " + repairsReplacements.getDurationHours());
            writer.println("Description: " + repairsReplacements.getDescription());
            writer.println();  // Add an empty line to separate entries

            System.out.println("Equipment repairs and replacements data written to file: " + fileName);
        } catch (IOException e) {
            System.err.println("Error writing to file: " + e.getMessage());
        }
    }

    public List<FuelCostandUsage> readFuelCostDataFromBinFile(String fileName) {
        List<FuelCostandUsage> fuelCostList = new ArrayList<>();
        try (ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream(fileName))) {
            while (true) {
                try {
                    FuelCostandUsage fuelCost = (FuelCostandUsage) inputStream.readObject();
                    fuelCostList.add(fuelCost);
                } catch (EOFException e) {
                    // End of file reached, break the loop
                    break;
                }
            }
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
            System.err.println("Error while reading fuel cost data from bin file.");
        }
        return fuelCostList;
    }
    
 public List<OperationalTrendAnalysis> readOperationalTrendAnalysisDataFromTxtFile(String fileName) {
       List<OperationalTrendAnalysis> operationalTrendData = new ArrayList<>();
        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            String line;
            String equipmentId = null;
            int errorCount = 0;

            while ((line = reader.readLine()) != null) {
                if (line.startsWith("Equipment ID:")) {
                    equipmentId = line.substring("Equipment ID:".length()).trim();
                } else if (line.startsWith("Error Count:")) {
                    errorCount = Integer.parseInt(line.substring("Error Count:".length()).trim());
                    operationalTrendData.add(new OperationalTrendAnalysis(equipmentId, errorCount));
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
            System.err.println("Error while reading operational trend analysis data from txt file.");
        }

        return operationalTrendData;
    }
public List<MaintenanceLogManagement> readMaintenanceLogDataFromTxtFile(String fileName) {
    List<MaintenanceLogManagement> maintenanceLogList = new ArrayList<>();

    try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
        String line;
        String equipmentId = null;
        LocalDate date = null;
        double duration = 0.0;

        while ((line = reader.readLine()) != null) {
            if (line.startsWith("Equipment ID:")) {
                equipmentId = line.substring(line.indexOf(":") + 1).trim();
            } else if (line.startsWith("Date:")) {
                String dateString = line.substring(line.indexOf(":") + 1).trim();
                date = LocalDate.parse(dateString);
            } else if (line.startsWith("Duration Hours:")) {
                String durationString = line.substring(line.indexOf(":") + 1).trim();
                duration = Double.parseDouble(durationString);
            } else if (line.isEmpty() && equipmentId != null && date != null) {
                // Create a new MaintenanceLogManagement instance with collected data
                MaintenanceLogManagement log = new MaintenanceLogManagement(equipmentId, date, duration);
                maintenanceLogList.add(log);
                // Reset data for the next entry
                equipmentId = null;
                date = null;
                duration = 0.0;
            }
            // Add more fields as needed
        }

    } catch (IOException e) {
        e.printStackTrace();
        System.err.println("Error while reading maintenance log data from txt file.");
    }

    return maintenanceLogList;
}
///doesn't work
  public static List<EquipmentRepairsReplacements> readEquipmentRepairsReplacementsDataFromTxtFile(String fileName) {
    List<EquipmentRepairsReplacements> repairsReplacementsList = new ArrayList<>();

    try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
        String line;
        String repairReplacementId = null;
        String equipmentId = null;
        LocalDate date = null;
        String typeOfWork = null;
        String componentReplaced = null;
        String technicianProvider = null;
        double costUSD = 0.0;
        double durationHours = 0.0;
        String description = null;

        while ((line = reader.readLine()) != null) {
            if (line.startsWith("Repair/Replacement ID:")) {
                repairReplacementId = line.substring(line.indexOf(":") + 1).trim();
            } else if (line.startsWith("Equipment ID:")) {
                equipmentId = line.substring(line.indexOf(":") + 1).trim();
            } else if (line.startsWith("Date:")) {
                String dateString = line.substring(line.indexOf(":") + 1).trim();
                date = LocalDate.parse(dateString);
            } else if (line.startsWith("Type of Work:")) {
                typeOfWork = line.substring(line.indexOf(":") + 1).trim();
            } else if (line.startsWith("Component Replaced:")) {
                componentReplaced = line.substring(line.indexOf(":") + 1).trim();
            } else if (line.startsWith("Technician Provider:")) {
                technicianProvider = line.substring(line.indexOf(":") + 1).trim();
            } else if (line.startsWith("Cost (USD):")) {
                String costString = line.substring(line.indexOf(":") + 1).trim();
                costUSD = Double.parseDouble(costString);
            } else if (line.startsWith("Duration (Hours):")) {
                String durationString = line.substring(line.indexOf(":") + 1).trim();
                durationHours = Double.parseDouble(durationString);
            } else if (line.startsWith("Description:")) {
                description = line.substring(line.indexOf(":") + 1).trim();
            } else if (line.isEmpty() && repairReplacementId != null) {
                // Create a new EquipmentRepairsReplacements instance with collected data
                EquipmentRepairsReplacements entry = new EquipmentRepairsReplacements(
                        repairReplacementId, equipmentId, date, typeOfWork,
                        componentReplaced, technicianProvider, costUSD, durationHours, description);
                repairsReplacementsList.add(entry);
                // Reset data for the next entry
                repairReplacementId = null;
                equipmentId = null;
                date = null;
                typeOfWork = null;
                componentReplaced = null;
                technicianProvider = null;
                costUSD = 0.0;
                durationHours = 0.0;
                description = null;
            }
        }
    } catch (IOException e) {
        e.printStackTrace();
        System.err.println("Error while reading equipment repairs and replacements data from txt file.");
    }

    return repairsReplacementsList;
}

  //table view of EquipmentRepairsReplacements
public List<EquipmentRepairsReplacements> readEquipmentRepairsReplacementsDataFromTxtFiletable(String fileName) {
    List<EquipmentRepairsReplacements> repairsReplacementsList = new ArrayList<>();

    try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
        String line;
        String repairReplacementId = null;
        String equipmentId = null;
        LocalDate date = null;
        String typeOfWork = null;
        String componentReplaced = null;
        String technicianProvider = null;
        double costUSD = 0.0;
        double durationHours = 0.0;
        String description = null;

        while ((line = reader.readLine()) != null) {
            if (line.startsWith("Repair/Replacement ID:")) {
                repairReplacementId = line.substring("Repair/Replacement ID:".length()).trim();
            } else if (line.startsWith("Equipment ID:")) {
                equipmentId = line.substring("Equipment ID:".length()).trim();
            } else if (line.startsWith("Date:")) {
                date = LocalDate.parse(line.substring("Date:".length()).trim());
            } else if (line.startsWith("Type of Work:")) {
                typeOfWork = line.substring("Type of Work:".length()).trim();
            } else if (line.startsWith("Component Replaced:")) {
                componentReplaced = line.substring("Component Replaced:".length()).trim();
            } else if (line.startsWith("Technician Provider:")) {
                technicianProvider = line.substring("Technician Provider:".length()).trim();
            } else if (line.startsWith("Cost (USD):")) {
                costUSD = Double.parseDouble(line.substring("Cost (USD):".length()).trim());
            } else if (line.startsWith("Duration (Hours):")) {
                durationHours = Double.parseDouble(line.substring("Duration (Hours):".length()).trim());
            } else if (line.startsWith("Description:")) {
                description = line.substring("Description:".length()).trim();

                // Create a new EquipmentRepairsReplacements instance with collected data
                EquipmentRepairsReplacements repairsReplacements = new EquipmentRepairsReplacements(
                    repairReplacementId, equipmentId, date, typeOfWork, componentReplaced,
                    technicianProvider, costUSD, durationHours, description
                );

                repairsReplacementsList.add(repairsReplacements);

                // Reset data for the next entry
                repairReplacementId = null;
                equipmentId = null;
                date = null;
                typeOfWork = null;
                componentReplaced = null;
                technicianProvider = null;
                costUSD = 0.0;
                durationHours = 0.0;
                description = null;
            }
        }
    } catch (IOException e) {
        e.printStackTrace();
        System.err.println("Error while reading equipment repairs and replacements data from txt file.");
    }

    return repairsReplacementsList;
}

  

}

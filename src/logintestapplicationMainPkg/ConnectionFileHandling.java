/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package logintestapplicationMainPkg;

import javafx.scene.control.Alert;

import java.io.*;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class ConnectionFileHandling {

    public static void applyForConnection(String connectionName, String connectionLocation,Integer plantID, LocalDate connectionDate) {
        List<Connection> connections = loadConnections();
        boolean isDuplicate = connections.stream().anyMatch(connection -> connection.getPlantID().equals(plantID));
        if (isDuplicate) {
            showAlert("Duplicate Plant ID", "Same Plant ID found in Database.");
            return;
        }

  
        Connection connection = new Connection(connectionName, connectionLocation, connectionDate, plantID);
        connections.add(connection);
        saveConnections(connections);
    }
    public static List<Connection> loadConnections() {
        return loadConnectionsFromFile();       
    }
    private static List<Connection> loadConnectionsFromFile(){
     List<Connection> connections= new ArrayList<>();
     try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("connection_file.bin"))) {
         connections = (List<Connection>) ois.readObject();
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }

        return connections;
    
    }

    private static void saveConnections(List<Connection> connections) {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("connection_file.bin"))) {
            oos.writeObject(connections);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public static Map<String, Long> countConnectionsByLocation() {
    List<Connection> connections = loadConnectionsFromFile();
        return connections.stream().collect(Collectors.groupingBy(Connection::getConnectionLocation, Collectors.counting()));
    }
    private static void showAlert(String title, String message) {
        Alert alert = new Alert(Alert.AlertType.WARNING);
        alert.setTitle(title);
        alert.setHeaderText(null);
        alert.setContentText(message);
        alert.showAndWait();
    }
}

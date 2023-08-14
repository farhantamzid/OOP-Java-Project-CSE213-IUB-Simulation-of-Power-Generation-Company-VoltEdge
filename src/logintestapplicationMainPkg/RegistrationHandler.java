/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package logintestapplicationMainPkg;

import java.io.*;
import java.util.HashMap;
import java.util.Map;

public class RegistrationHandler {
    private static final String REGISTRATION_FILE = "registration.bin";

    public static Map<String, String> loadRegisteredUsers() {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(REGISTRATION_FILE))) {
            return (Map<String, String>) ois.readObject();
        } catch (IOException | ClassNotFoundException e) {
            return new HashMap<>();
        }
    }

    public static void saveRegisteredUsers(Map<String, String> registeredUsers) {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(REGISTRATION_FILE))) {
            oos.writeObject(registeredUsers);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void registerUser(String email, String password) {
        Map<String, String> registeredUsers = loadRegisteredUsers();
        registeredUsers.put(email, password);
        saveRegisteredUsers(registeredUsers);
    }
}



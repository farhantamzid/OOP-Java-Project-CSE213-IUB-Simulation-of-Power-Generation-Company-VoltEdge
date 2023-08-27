/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package logintestapplicationMainPkg;

import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;

/**
 *
 * @author farhan
 */
public class alert {
    @FXML
    public static void show(String text) {
        Alert alert = new Alert(AlertType.INFORMATION);
        alert.setTitle(text);
        alert.setHeaderText(text);
        alert.setContentText(text);

        alert.showAndWait();
    }
}

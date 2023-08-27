/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package logintestapplicationMainPkg;

import javafx.beans.property.SimpleDoubleProperty;
import javafx.beans.property.SimpleStringProperty;

public class Expense {
    private final SimpleStringProperty rentType;
    private final SimpleDoubleProperty rentAmount;

    public Expense(String rentType, double rentAmount) {
        this.rentType = new SimpleStringProperty(rentType);
        this.rentAmount = new SimpleDoubleProperty(rentAmount);
    }

    public String getRentType() {
        return rentType.get();
    }

    public SimpleStringProperty rentTypeProperty() {
        return rentType;
    }

    public double getRentAmount() {
        return rentAmount.get();
    }

    public SimpleDoubleProperty rentAmountProperty() {
        return rentAmount;
    }
}

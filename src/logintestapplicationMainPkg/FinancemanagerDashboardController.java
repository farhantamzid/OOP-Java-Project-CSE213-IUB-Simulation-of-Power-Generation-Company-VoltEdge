/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package logintestapplicationMainPkg;

import java.net.URL;
import java.time.LocalDate;
import java.util.List;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;

/**
 * FXML Controller class
 *
 * @author User
 */
public class FinancemanagerDashboardController implements Initializable {

    private FinanceManager financeManager;
    @Override
    public void initialize(URL url, ResourceBundle rb) {
    financeManager = new FinanceManager("designation", 0, false, false, "email", "password", "name", LocalDate.now(), 1);
    }    
    @FXML
    private void OnActionPurchaseRequests(ActionEvent event) {
    }

    @FXML
    private void OnActionPaymentHistory(ActionEvent event) {
    }

    @FXML
    private void OnActionExpenseReport(ActionEvent event) {
    }

    @FXML
    private void OnActionExpenseReportPiechart(ActionEvent event) {
    }

    @FXML
    private void onActionPurchaseRequests(ActionEvent event) {
    }

    @FXML
    private void onActionApproveSalary(ActionEvent event) {
    }

    @FXML
    private void OnActionSalaryReport(ActionEvent event) {
    }

    @FXML
    private void OnActionVIewIncomeStatement(ActionEvent event) {
    }

    @FXML
    private void OnActionIncomeStatementGeneration(ActionEvent event) {
    }

    @FXML
    private void giveAttendance(ActionEvent event) {
        financeManager.markAttendance();
        System.out.println("Attendance marked for FinanceManager: " + financeManager.getName());
    }

    @FXML
private void showAttendanceRecords(ActionEvent event) {
    List<Attendance> attendanceRecords = AttendanceFileHandler.readAttendanceRecords();

    if (attendanceRecords.isEmpty()) {
        System.out.println("No attendance records found.");
        return;
    }

    System.out.println("Attendance Records:");
    for (Attendance record : attendanceRecords) {
        User user = record.getEmployee();
        if (user instanceof Employee) {
            Employee employee = (Employee) user;

            System.out.println("Employee Name: " + employee.getName() +
                               ", Employee ID: " + employee.getId() +
                               ", Designation: " + employee.getDesignation() +
                               ", Salary: " + employee.getSalary() +
                               ", Attendance Date: " + record.getAttendanceDate());
        }
    }
}
}

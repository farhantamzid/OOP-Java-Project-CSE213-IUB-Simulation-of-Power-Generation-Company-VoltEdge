/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package logintestapplicationMainPkg;

import java.io.Serializable;
import java.time.LocalDate;
import java.time.LocalDateTime;

/**
 *
 * @author farhan
 */
public class FinanceManager extends Employee implements Serializable{
    
    public FinanceManager(String designation, int salary, boolean attendance, boolean applyforleave, String email, String password, String name, LocalDate dob, int id) {
        super(designation, salary, attendance, applyforleave, email, password, name, dob, id);
    }
        public void markAttendance() {
        LocalDateTime currentTime = LocalDateTime.now();
        Attendance attendanceRecord = new Attendance(this.id, currentTime);
        // Save attendance record to a binary file
        AttendanceFileHandler.saveAttendanceRecord(attendanceRecord);
        this.attendance = true;
}}

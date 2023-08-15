
package logintestapplicationMainPkg;

import java.io.Serializable;
import java.time.LocalDate;
import java.time.LocalDateTime;

public class FinanceManager extends Employee implements Serializable {
    
    public FinanceManager(String designation, int salary, boolean attendance, boolean applyforleave, String email, String password, String name, LocalDate dob, int id) {
        super(designation, salary, attendance, applyforleave, email, password, name, dob, id);
    }
    
    public void markAttendance() {
        LocalDateTime currentTime = LocalDateTime.now();
        Attendance attendanceRecord = new Attendance(this, currentTime);
        // Save attendance record to a binary file
        AttendanceFileHandler.saveAttendanceRecord(attendanceRecord);
        this.attendance = true;
    }
}


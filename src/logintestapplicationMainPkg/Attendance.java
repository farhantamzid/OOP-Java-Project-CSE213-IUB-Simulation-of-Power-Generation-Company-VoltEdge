package logintestapplicationMainPkg;

import java.io.Serializable;
import java.time.LocalDateTime;

public class Attendance implements Serializable {
    private int employeeId;
    private LocalDateTime attendanceDate;

    public Attendance(int employeeId, LocalDateTime attendanceDate) {
        this.employeeId = employeeId;
        this.attendanceDate = attendanceDate;
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public LocalDateTime getAttendanceDate() {
        return attendanceDate;
    }
}

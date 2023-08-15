package logintestapplicationMainPkg;

import java.io.Serializable;
import java.time.LocalDateTime;

public class Attendance implements Serializable {
    private User employee;
    private LocalDateTime attendanceDate;

    public Attendance(User employee, LocalDateTime attendanceDate) {
        this.employee = employee;
        this.attendanceDate = attendanceDate;
    }

    public User getEmployee() {
        return employee;
    }

    public LocalDateTime getAttendanceDate() {
        return attendanceDate;
    }
}


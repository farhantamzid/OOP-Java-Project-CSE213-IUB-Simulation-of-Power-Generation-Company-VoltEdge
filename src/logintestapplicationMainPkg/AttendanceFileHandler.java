package logintestapplicationMainPkg;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class AttendanceFileHandler {
    private static final String attendancefile = "attendance.bin";

    public static void saveAttendanceRecord(Attendance attendance) {
        List<Attendance> attendanceList = readAttendanceRecords();
        attendanceList.add(attendance);

        try (ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream(attendancefile))) {
            outputStream.writeObject(attendanceList);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static List<Attendance> readAttendanceRecords() {
        List<Attendance> attendanceList = new ArrayList<>();
        try (ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream(attendancefile))) {
            attendanceList = (List<Attendance>) inputStream.readObject();
        } catch (IOException | ClassNotFoundException e) {
            // Handle exceptions
        }
        return attendanceList;
    }
    
}

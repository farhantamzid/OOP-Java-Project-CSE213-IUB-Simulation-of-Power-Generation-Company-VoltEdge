package logintestapplicationMainPkg;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class RepairRequestFileHandling {

    private static final String File = "repair_request.bin";

    public static void saveRepairRequests(List<RepairRequest> repairRequests) {
        try (ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream(File))) {
            outputStream.writeObject(repairRequests);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static List<RepairRequest> loadRepairRequests() {
        List<RepairRequest> repairRequests = new ArrayList<>();
        try (ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream(File))) {
            repairRequests = (List<RepairRequest>) inputStream.readObject();
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
        return repairRequests;
    }
}

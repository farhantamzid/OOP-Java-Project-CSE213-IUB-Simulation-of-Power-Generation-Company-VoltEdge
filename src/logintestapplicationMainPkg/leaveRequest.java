/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package logintestapplicationMainPkg;

import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import static logintestapplicationMainPkg.Generator.readFromBin;

/**
 *
 * @author farhan
 */
public class leaveRequest implements Serializable{
    
    private String name;
    private String type;
    private String duration;
    private String reason;
    private Boolean isApproved;

    public leaveRequest(String name, String type, String duration,String reason) {
        this.name = name;
        this.type = type;
        this.duration = duration;
        this.reason=reason;
        this.isApproved=false;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getDuration() {
        return duration;
    }

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }

    public Boolean getIsApproved() {
        return isApproved;
    }

    public void setIsApproved(Boolean isApproved) {
        this.isApproved = isApproved;
    }

    public void setDuration(String duration) {
        this.duration = duration;
    }
    
        public static void newLeave(String name, String type, String duration,String reason){
        

        
        leaveRequest lr = new leaveRequest(name,  type,  duration,reason);
        leaveRequest.writeToBin(lr);
        
    
    
    }
    
    
    public static void writeToBin(leaveRequest lr){
        

        File f = null;
        FileOutputStream fos = null;      
        ObjectOutputStream oos = null;
        
        try{
            File file = new File("LeaveRequests.bin");
            if(file.exists()){
                fos = new FileOutputStream(file,true);
                oos = new AppendableObjectOutputStream(fos);
            }else{
                fos = new FileOutputStream(file);
                oos = new ObjectOutputStream(fos);
            }
            oos.writeObject(lr);
        }catch(IOException e){
            System.err.println(e.getMessage());
        }finally{
            try {
                if(oos != null) oos.close();
            } catch (IOException ex) {
                System.err.println(ex.getMessage());

            }
        }
   
    }
    
    public static ArrayList<leaveRequest> readFromBin(){
        ArrayList<leaveRequest> leaveList = new ArrayList();
        
        try(ObjectInputStream ois = new ObjectInputStream(new FileInputStream("LeaveRequests.bin"))){
            while(true){
                try{
                    leaveRequest lr = (leaveRequest)ois.readObject();
                    leaveList.add(lr);
                }catch(EOFException e){
                    break;
                }catch(ClassNotFoundException e){
                   System.err.println("Class not Found");
                }
            }
        }catch(FileNotFoundException e){
                    System.err.println("File not Found");
        }catch(IOException e){
                    System.err.println("IO exception" + e.getMessage());
        }
        
        return leaveList ;
    }
    public static void writeToBin(ArrayList<leaveRequest> leaveList) {
    File file = new File("LeaveRequests.bin");
    
    try (FileOutputStream fos = new FileOutputStream(file);
         ObjectOutputStream oos = new ObjectOutputStream(fos)) {

        for (leaveRequest lr : leaveList) {
            oos.writeObject(lr);
        }
        
    } catch (IOException e) {
        System.err.println("IO exception: " + e.getMessage());
    }
}
    
}

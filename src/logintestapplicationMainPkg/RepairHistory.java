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
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.ArrayList;

/**
 *
 * @author farhan
 */
public class RepairHistory implements Serializable{

    public LocalDateTime getTime() {
        return time;
    }

    public void setTime(LocalDateTime time) {
        this.time = time;
    }
    
    private Integer id;
    private String type;
    private String issue;
    private Integer downtime;
    private String remarks;
    private LocalDateTime time;

    public RepairHistory(Integer id, String type, String issue, Integer downtime, String remarks) {
        this.id = id;
        this.type = type;
        this.issue = issue;
        this.downtime = downtime;
        this.remarks = remarks;
        this.time=LocalDateTime.now();
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getIssue() {
        return issue;
    }

    public void setIssue(String issue) {
        this.issue = issue;
    }

    public Integer getDowntime() {
        return downtime;
    }

    public void setDowntime(Integer downtime) {
        this.downtime = downtime;
    }

    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks;
    }

    
    public String toString() {
        return "RepairHistory{" + "id=" + id + ", type=" + type + ", issue=" + issue + ", downtime=" + downtime + ", remarks=" + remarks + '}' + time;
    }
    
        public static void newRepair(Integer id, String type, String issue, Integer downtime, String remarks){
        



            RepairHistory r1 = new RepairHistory(id,type,issue,downtime,remarks);
            RepairHistory.writeToBin(r1);
            
        
    
    
    }
        
        public static void showRepairs(){
        for (RepairHistory r : RepairHistory.readFromBin()){
            
        System.out.println(r.toString());
        }
    
    }
    public static void writeToBin(RepairHistory r){
        

        File f = null;
        FileOutputStream fos = null;      
        ObjectOutputStream oos = null;
        
        try{
            File file = new File("RepairHistory.bin");
            if(file.exists()){
                fos = new FileOutputStream(file,true);
                oos = new AppendableObjectOutputStream(fos);
            }else{
                fos = new FileOutputStream(file);
                oos = new ObjectOutputStream(fos);
            }
            oos.writeObject(r);
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
    
    public static ArrayList<RepairHistory> readFromBin(){
        ArrayList<RepairHistory> repairList = new ArrayList();
        
        try(ObjectInputStream ois = new ObjectInputStream(new FileInputStream("RepairHistory.bin"))){
            while(true){
                try{
                    RepairHistory r = (RepairHistory)ois.readObject();
                    repairList.add(r);
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
        
        return repairList;
    }
    
}

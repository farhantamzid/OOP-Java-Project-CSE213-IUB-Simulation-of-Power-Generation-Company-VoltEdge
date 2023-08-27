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
import javafx.scene.control.Alert;

/**
 *
 * @author farhan
 */
public class Generator implements Serializable{
    
    private Integer id;
    private String type;
    private Integer power;
    private Boolean isOn;
    private Boolean isFunctional;
    private Boolean isRenewable;
    private Boolean isPurchaseApproved;
    

    public Generator(Integer id, String type, Integer power) {
        this.id = id;
        this.type=type;
        this.power = power;
        this.isOn = true;
        this.isFunctional = true;
        this.isPurchaseApproved=true;
        if(type.equals("Solar")||(type.equals("Turbine"))){
            
            this.isRenewable=true;
        
        } else{
            
            this.isRenewable=false;
        
        }
    }

    public Integer getId() {
        return id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getPower() {
        return power;
    }

    public void setPower(Integer power) {
        this.power = power;
    }

    public Boolean getIsOn() {
        return isOn;
    }

    public void setIsOn(Boolean isOn) {
        this.isOn = isOn;
    }

    public Boolean getIsFunctional() {
        return isFunctional;
    }

    public void setIsFunctional(Boolean isFunctional) {
        this.isFunctional = isFunctional;
    }

    public Boolean getIsRenewable() {
        return isRenewable;
    }

    public void setIsRenewable(Boolean isRenewable) {
        this.isRenewable = isRenewable;
    }

    public Boolean getIsPurchaseApproved() {
        return isPurchaseApproved;
    }

    public void setIsPurchaseApproved(Boolean isPurchaseApproved) {
        this.isPurchaseApproved = isPurchaseApproved;
    }

    @Override
    public String toString() {
        return "Generator{" + "id=" + id + ", type=" + type + ", power=" + power + ", isOn=" + isOn + ", isFunctional=" + isFunctional + ", isRenewable=" + isRenewable + ", isPurchaseApproved=" + isPurchaseApproved + '}';
    }


    
    
    
    public static void newTurbine(Integer id, String type, Integer power){
        
        ArrayList<Generator> loadedGeneratorList = readFromBin();
        boolean isDuplicate;
        isDuplicate = loadedGeneratorList.stream().anyMatch(connection -> connection.getId().equals(id));
        if (isDuplicate) {
            alert.show("Duplicate ID. Please enter a unique one.");
            return;
        }
        
        Generator g1 = new Generator(id,type,power);
        Generator.writeToBin(g1);
        
    
    
    }
    
    public static void writeToBin(Generator g){
        

        File f = null;
        FileOutputStream fos = null;      
        ObjectOutputStream oos = null;
        
        try{
            File file = new File("Generators.bin");
            if(file.exists()){
                fos = new FileOutputStream(file,true);
                oos = new AppendableObjectOutputStream(fos);
            }else{
                fos = new FileOutputStream(file);
                oos = new ObjectOutputStream(fos);
            }
            oos.writeObject(g);
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
    
    public static ArrayList<Generator> readFromBin(){
        ArrayList<Generator> generatorList = new ArrayList();
        
        try(ObjectInputStream ois = new ObjectInputStream(new FileInputStream("Generators.bin"))){
            while(true){
                try{
                    Generator g = (Generator)ois.readObject();
                    generatorList.add(g);
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
        
        return generatorList;
    }
    
public static void writeToBin(ArrayList<Generator> generators) {
    File file = new File("Generators.bin");
    
    try (FileOutputStream fos = new FileOutputStream(file);
         ObjectOutputStream oos = new ObjectOutputStream(fos)) {

        for (Generator g : generators) {
            oos.writeObject(g);
        }
        
    } catch (IOException e) {
        System.err.println("IO exception: " + e.getMessage());
    }
}


    
    public static void showGenerators(){
        for (Generator g : Generator.readFromBin()){
            
        System.out.println(g.toString());
        }
    
    }
    
    
}

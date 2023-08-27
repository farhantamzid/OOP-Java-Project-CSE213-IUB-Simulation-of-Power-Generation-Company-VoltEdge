/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package logintestapplicationMainPkg;

import java.util.ArrayList;

/**
 *
 * @author farhan
 */
public class liveCalculation {
    
    public static Integer Renewable(){
        
        ArrayList<Generator> list = Generator.readFromBin();
        
        Integer totalR=0;
        
        
        for (Generator g : list){
    
            if(g.getIsFunctional()&&(g.getIsOn())&&(g.getIsRenewable())){
                
                
                totalR = totalR+g.getPower();
            
            
            
            }
    
            


}
        

        return totalR;
        
    
    
    
    }
    
    
    public static Integer NonRenewable(){
        
        ArrayList<Generator> listNR = Generator.readFromBin();
        Integer totalNR=0;
        for (Generator g : listNR){
    
            if(g.getIsFunctional()&&(g.getIsOn())&&(!g.getIsRenewable())){
                
                
                totalNR = totalNR+g.getPower();
            
            
            
            }
    
            


}
       return totalNR; 
    }
    
    public static Integer totalPower(){
        
        
        return Renewable()+NonRenewable();
    
    
    
    }
    
    
}

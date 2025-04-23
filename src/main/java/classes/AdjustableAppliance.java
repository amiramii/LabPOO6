/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package classes;

/**
 *
 * @author HP
 */
public abstract class AdjustableAppliance extends SmartAppliance {
    public AdjustableAppliance(String brand,String model,boolean powerStatus){
        super(brand,model,powerStatus);
        
    }
    public abstract void adjustSetting(int level);
    
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package classes;

import interfaces.Connectable;
import interfaces.Schedulable;

/**
 *
 * @author HP
 */
public class SmartLight extends SmartAppliance implements Schedulable,Connectable {
    private int brightnessLevel=0;
    public SmartLight(String brand,String model,boolean powerStatus,int brightnessLevel){
        super(brand,model,powerStatus);
        this.brightnessLevel=brightnessLevel;
    }
    @Override
    public void performFunction(){
        System.out.println(getBrand() + " light illuminating at brightness " + brightnessLevel + "%");
    }
    @Override
    public void schedule(String time){ 
        System.out.println(getBrand() + " light scheduled to turn on at " + time);
    }
    @Override
    public void  connectToWiFi(String networkName){
        System.out.println(getBrand() + " light connected to " + networkName);
    }

    /**
     * @return the brightnessLevel
     */
    public int getBrightnessLevel() {
        return brightnessLevel;
    }

    /**
     * @param brightnessLevel the brightnessLevel to set
     */
    public void setBrightnessLevel(int brightnessLevel) {
        this.brightnessLevel = brightnessLevel;
    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package classes;

import interfaces.Connectable;

/**
 *
 * @author HP
 */
public class SmartThermostat extends AdjustableAppliance implements Connectable{
    private int temperature=0;
    public SmartThermostat(String brand,String model,boolean powerStatus,int temperature){
        super(brand,model,powerStatus);
        this.temperature=temperature;
        System.out.println(getBrand() + " thermostat temperature set to " + temperature + "°C");
    }
    @Override
     public  void adjustSetting(int level){
         setTemperature(level);
         System.out.println(getBrand() + " thermostat temperature set to " + getTemperature() + "°C");
     };
    @Override
      public void connectToWiFi(String networkName){
          System.out.println(getBrand() + " thermostat connected to " + networkName);
      };
    @Override
      public void performFunction(){
          System.out.println(getBrand() + " regulating room temperature to " + getTemperature() + "°C");
      }

    /**
     * @return the temperature
     */
    public int getTemperature() {
        return temperature;
    }

    /**
     * @param temperature the temperature to set
     */
    public void setTemperature(int temperature) {
        this.temperature = temperature;
    }
      
    
}

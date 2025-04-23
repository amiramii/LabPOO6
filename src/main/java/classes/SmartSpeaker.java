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
public class SmartSpeaker extends AdjustableAppliance implements Connectable {
    private int volumeLevel=0;
    public SmartSpeaker(String brand,String model,boolean powerStatus,int volumeLevel){
        super(brand,model,powerStatus);
        this.volumeLevel=volumeLevel;
    }
    @Override
     public  void adjustSetting(int level){
         this.setVolumeLevel(level);
        System.out.println(getBrand() + " speaker volume set to " + getVolumeLevel());
         
     };
    @Override
      public void connectToWiFi(String networkName){
          System.out.println(getBrand() + " speaker connected to " + networkName);
      };
    @Override
      public void performFunction(){
          System.out.println(getBrand() + " playing Quran at volume " + getVolumeLevel());
      }

    /**
     * @return the volumeLevel
     */
    public int getVolumeLevel() {
        return volumeLevel;
    }

    /**
     * @param volumeLevel the volumeLevel to set
     */
    public void setVolumeLevel(int volumeLevel) {
        this.volumeLevel = volumeLevel;
    }
}

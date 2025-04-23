
package classes;

public abstract class SmartAppliance {
    private String brand="";
    private String model="";
    private boolean powerStatus=true;
    public SmartAppliance(String brand,String model,boolean powerStatus){
        this.brand=brand;
        this.model=model;
        this.powerStatus=powerStatus;
    }
    public void togglePower(){
         powerStatus = !powerStatus;
        System.out.println(brand + " " + model + " turned " + (powerStatus ? "ON" : "OFF"));
    }
    public abstract void performFunction();

    /**
     * @return the brand
     */
    public String getBrand() {
        return brand;
    }

    /**
     * @param brand the brand to set
     */
    public void setBrand(String brand) {
        this.brand = brand;
    }

    /**
     * @return the model
     */
    public String getModel() {
        return model;
    }

    /**
     * @param model the model to set
     */
    public void setModel(String model) {
        this.model = model;
    }

    /**
     * @return the powerStatus
     */
    public boolean isPowerStatus() {
        return powerStatus;
    }

    /**
     * @param powerStatus the powerStatus to set
     */
    public void setPowerStatus(boolean powerStatus) {
        this.powerStatus = powerStatus;
    }
    
    
}

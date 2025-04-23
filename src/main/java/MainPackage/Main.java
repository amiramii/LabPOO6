<<<<<<< HEAD
package MainPackage;

import classes.*;
import interfaces.Connectable;
import interfaces.Schedulable;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        SmartAppliance[] appliances = new SmartAppliance[3];

        System.out.println("Enter details for Smart Light:");
        System.out.print("Brand: ");//LED
        String lightBrand = scanner.nextLine();
        System.out.print("Model: ");//A1
        String lightModel = scanner.nextLine();
        System.out.print("Brightness Level (0-100): ");
        int brightness = scanner.nextInt();
        scanner.nextLine(); // Consume newline

        appliances[0] = new SmartLight(lightBrand, lightModel, false, brightness);

        System.out.println("\nEnter details for Smart Thermostat:");
        System.out.print("Brand: ");//Nest
        String thermoBrand = scanner.nextLine();
        System.out.print("Model: ");//T3007ES
        String thermoModel = scanner.nextLine();
        System.out.print("Temperature (°C): ");
        int temperature = scanner.nextInt();
        scanner.nextLine();

        appliances[1] = new SmartThermostat(thermoBrand, thermoModel, true, temperature);

        System.out.println("\nEnter details for Smart Speaker:");
        System.out.print("Brand: ");//Sony
        String speakerBrand = scanner.nextLine();
        System.out.print("Model: ");//SRS-XB43
        String speakerModel = scanner.nextLine();
        System.out.print("Volume Level (0-100): ");
        int volume = scanner.nextInt();
        scanner.nextLine();

        appliances[2] = new SmartSpeaker(speakerBrand, speakerModel, true, volume);

        System.out.println("\n===== Device Summary and Actions =====");
        for (SmartAppliance appliance : appliances) {
            System.out.println("==== " + appliance.getBrand() + " " + appliance.getModel() + " ====");

            appliance.togglePower(); // Show power toggle
            appliance.performFunction(); // Call abstract method (polymorphism)

            if (appliance instanceof Connectable) {
                ((Connectable) appliance).connectToWiFi("TP-Link");//downcasting
            }

            if (appliance instanceof Schedulable) {
                ((Schedulable) appliance).schedule("20:00");
            }

            if (appliance instanceof AdjustableAppliance) {
                System.out.print("Enter new setting level for " + appliance.getBrand() + ": ");
                int newLevel = scanner.nextInt();
                scanner.nextLine();
                ((AdjustableAppliance) appliance).adjustSetting(newLevel);
            }

            System.out.println();
        }

        scanner.close();
    }
=======

package MainPackage;

import classes.Developer;
import classes.SalesPerson;
import classes.Tester;


public class Main {
     public static void main(String[] args){
         SalesPerson newSalesPerson=new SalesPerson("Amine",30,101,5000.0,1000.0);
         newSalesPerson.calculateBonus();
         newSalesPerson.approveLeave("Amine");
         Developer newDeveloper=new Developer("Amira",18,176,20000.0,2);
         Tester newTester=new Tester("Zakaria",21,"new project");
         newDeveloper.calculateBonus();
         newDeveloper.approveLeave("Amira");
         newTester.approveLeave("Zakaria");
     }
    
>>>>>>> 2744148d1c022e76c7556a6486d0275269424c6d
}

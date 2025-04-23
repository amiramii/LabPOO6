
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
    
}

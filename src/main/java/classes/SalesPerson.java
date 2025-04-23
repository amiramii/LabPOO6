
package classes;

import abstractclasses.Employee;
import interfaces.Manager;

/**
 *
 * @author HP
 */
public class SalesPerson extends Employee implements Manager {
    private double salesAmount=0.0;
    public SalesPerson(String name,int age,int employeeId,double salary,double salesAmount){
        super(name,age,employeeId,salary);
        this.salesAmount=salesAmount;
    }
    @Override
    public double calculateBonus(){
        return getSalesAmount()*0.1;
    }
    @Override
    public void approveLeave(String employeeName){
        System.out.println("Leave approved for employee "+employeeName);
    }

    /**
     * @return the salesAmount
     */
    public double getSalesAmount() {
        return salesAmount;
    }

    /**
     * @param salesAmount the salesAmount to set
     */
    public void setSalesAmount(double salesAmount) {
        this.salesAmount = salesAmount;
    }
    
}

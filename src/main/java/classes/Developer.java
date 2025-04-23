
package classes;

import abstractclasses.Employee;
import interfaces.Manager;


public class Developer extends Employee implements Manager{
    private int experience=0;
    public Developer(String name,int age,int employeeId,double salary,int experience){
        super(name,age,employeeId,salary);
        this.experience=experience;
    }
    @Override 
    public double calculateBonus(){
        return getSalary()*(getExperience()*0.01);
    }
    @Override
    public void approveLeave(String employeeName){
        System.out.println("Leave approved for employee "+employeeName);
    }
    public int getExperience(){
    return this.experience;
    }

    /**
     * @param experience the experience to set
     */
    public void setExperience(int experience) {
        this.experience = experience;
    }
    
}

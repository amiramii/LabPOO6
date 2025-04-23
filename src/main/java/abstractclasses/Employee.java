/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package abstractclasses;

import classes.Person;

/**
 *
 * @author HP
 */
public abstract class Employee extends Person {
    private int employeeId=0;
    private double salary=0;
    public Employee(String name,int age,int employeeId,double salary){
        super(name,age);
        this.employeeId=employeeId;
        this.salary=salary;
        
    }
    public abstract double calculateBonus();
    public int getEmployeeId(){
        return(this.employeeId);
    }
    public double getSalary(){
        return(this.salary);
    }

    /**
     * @param employeeId the employeeId to set
     */
    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    /**
     * @param salary the salary to set
     */
    public void setSalary(double salary) {
        this.salary = salary;
    }
    
}

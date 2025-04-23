/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package classes;

import interfaces.Manager;

/**
 *
 * @author HP
 */
public class Tester implements Manager{
    private String name="";
    private int age=0;
    private String project="";
    public Tester(String name,int age,String project){
        this.name=name;
        this.age=age;
        this.project=project;
    }
    @Override
    public void approveLeave(String employeeName){
        System.out.println("Leave approved for employee "+employeeName);
    }
    public String getName(){
    return this.name;
    }
    public int getAge(){
    return this.age;
    }
    public String getProject(){
    return this.project;
    }
}


package classes;

public class Person {
    private String name="";
    private int age=0;
    public Person(String name,int age){
        this.name=name;
        this.age=age;
    }
    public void printDetails(){
        System.out.println("The name :"+ this.getName() +"\n"+"The age :"+this.getAge());
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the age
     */
    public int getAge() {
        return age;
    }

    /**
     * @param age the age to set
     */
    public void setAge(int age) {
        this.age = age;
    }
}

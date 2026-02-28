public class Employee {

    protected String name;
    protected String surname;
    protected double salary;

    public Employee(String name,String surname,double salary){
        this.name=name;
        this.surname=surname;
        this.salary=salary;
    }

    public double calculateBonus(){
        return salary*0.10;
    }
    
}

public class Manager extends Employee {

    public Manager(String name,String surname,double salary){
        super(name,surname,salary);
    }

    @Override
    public double calculateBonus(){
        return salary * 0.30;
    }
    
}

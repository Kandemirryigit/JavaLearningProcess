public class Developer extends Employee {

    public Developer(String name,String surname,double salary){
        super(name,surname,salary);
    }

    @Override
    public double calculateBonus(){
        return salary * 0.20;
    }
    
}

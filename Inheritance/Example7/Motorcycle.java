public class Motorcycle extends Vehicle {

    public Motorcycle(String brand){
        super(brand);
    }

    public void wheelie(){
        System.out.printf("%s is doing a wheelie",brand);
    }
    
}

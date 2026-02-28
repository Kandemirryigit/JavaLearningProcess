public class Vehicle {

    protected String brand;

    public Vehicle(String brand){
        this.brand=brand;
    }

    public void start(){
        System.out.printf("%s is starting\n",brand);
    }
    
}

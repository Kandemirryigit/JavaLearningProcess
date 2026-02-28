public class Car extends Vehicle {

    public Car(String brand){
        super(brand);
    }

    public void openTrunk(){
        System.out.printf("%s trunk opened\n",brand);
    }
    
}

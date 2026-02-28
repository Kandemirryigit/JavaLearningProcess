public class Main {
    public static void main(String[] args){
        Car car=new Car("BMW");
        Motorcycle bike=new Motorcycle("Yamaha");

        car.start();
        car.openTrunk();

        bike.start();
        bike.wheelie();

    }
}

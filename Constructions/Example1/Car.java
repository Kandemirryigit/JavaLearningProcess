public class Car {

    String make="Ford";
    String model="Mustang";
    int yerar=2025;
    double price=58000.99;
    boolean isRunning=false;


    void startEngine(){
        isRunning=true;
        System.out.println("You started the engine");
    }

    void stopEngine(){
        isRunning=false;
        System.out.println("You stopped the engine");
    }
    
}

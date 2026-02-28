public class Main {
    public static void main(String[] args){

        Car myCar=new Car();

        System.out.println(myCar.make);
        System.out.println(myCar.model);
        System.out.println(myCar.yerar);
        System.out.println(myCar.price);
        
        System.out.println(myCar.isRunning);
        myCar.startEngine();
        System.out.println(myCar.isRunning);
        myCar.stopEngine();
        System.out.println(myCar.isRunning);
    }
    
}

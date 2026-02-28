public class Main {
    public static void main(String[] args){
        Car car1=new Car("Mercedes",100);

        car1.showInfo();
        car1.accelerate(20);
        System.out.println(car1.getSpeed());
    }
    
}

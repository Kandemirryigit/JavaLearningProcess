public class Main {

    public static void main(String[] args){

        Car myFirstCar=new Car("Dacia","Logan",2014,100.000);
        Car mySecondCar=new Car("BMW","i8",2022,500.000);


        System.out.println("My first car's attributes");
        System.out.println(myFirstCar.brand);
        System.out.println(myFirstCar.model);
        System.out.println(myFirstCar.year);
        System.out.println(myFirstCar.price);


        System.out.println("\n\nMy first car's attributes");
        System.out.println(mySecondCar.brand);
        System.out.println(mySecondCar.model);
        System.out.println(mySecondCar.year);
        System.out.println(mySecondCar.price);
    }
    
}

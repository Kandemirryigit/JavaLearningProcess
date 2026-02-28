public class Main {
    public static void main(String[] args){
        Car car1=new Car("Dacia","Logan","White",2014);
        Car car2=new Car("BMW","i8","Blue",2022);
        Car car3=new Car("Mercedes","AMG","Red",2024);

        Car[] cars={car1,car2,car3};

        for(int i=0;i<cars.length;i++){
            System.out.printf("Car%d: ",i+1);
            cars[i].showInfo();
        }
    }
    
}

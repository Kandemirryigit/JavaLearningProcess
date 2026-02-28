public class Car {
    String brand;
    String model;
    String color;
    int year;

    public Car(String brand,String model,String color,int year){
        this.brand=brand;
        this.model=model;
        this.color=color;
        this.year=year;
    }


    void showInfo(){
        System.out.printf("%s %s %s %d\n",brand,model,color,year);
    }
    
}

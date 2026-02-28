public class Car {
    
    private String brand;
    private int speed;

    public Car(String brand,int speed){
        this.brand=brand;
        setSpeed(speed);  
    }

    public void setSpeed(int speed){
        if(speed>=0){
            this.speed=speed;
        }
        else{
            System.out.println("Invalid speed");
            this.speed=0;
        }
    }


    public int getSpeed(){
        return speed;
    }

    public void accelerate(int amount){
        if(amount>0){
            speed+=amount;
        }
        else{
            System.out.println("Invalid amount");
        }
    }

    public void showInfo(){
        System.out.println("Brand: " + brand);
        System.out.println("Speed: " + speed);
    }
        
    
}

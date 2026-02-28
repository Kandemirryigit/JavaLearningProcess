import java.util.Random;

public class Example1 {
    public static void main(String[] args){
        Random random=new Random();

        // Creates random integer number
        int number1=random.nextInt();
        System.out.println(number1);

        // Creates random double number
        double number2=random.nextDouble();
        System.out.println(number2);

        // Creates random float number
        float number3=random.nextFloat();
        System.out.println(number3);

        // creates random integer number between 1-10
        int number4=random.nextInt(1,10);
        System.out.println(number4);

        // Creates random boolean value (true or false)
        boolean value=random.nextBoolean();
        System.out.println(value);




    }
    
}

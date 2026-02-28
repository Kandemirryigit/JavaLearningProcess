public class Example7 {

    public static void printDouble(double number){
        System.out.println("The number is: " + number);
    }

    public static void main(String[] args){
        int num=10;
        printDouble(num);  // Implicitly converts int to double
        // Output: The number is: 10.0
    }
    
}

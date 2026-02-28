public class Example4 {
    
    public static double calculateSquareRoot(double number){
        return Math.sqrt(number);
    }

    public static void main(String[] args){
        double result=calculateSquareRoot(25);
        System.out.println("The square root is: " + result);
    }
}

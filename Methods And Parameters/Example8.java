public class Example8 {

    public static int multiply(int a,int b){
        return a*b;
    }

    public static void main(String[] args){
        double x=5.5;
        double y=2.5;
        int result=multiply((int) x, (int) y);  // Explicitly cast double to int
        System.out.println("The product is: " + result);  // Output: The product is: 10
    }
    
}

public class ParameterExample {

    // Method definition with formal parameters: int num1, int num2
    public static int add(int num1,int num2){
        return num1+num2;
    }
    
    public static void main(String[] args){
        // Method call with actual parameters: 5, 10
        int sum=add(5,10);
        System.out.println("The sum is: " + sum);
    }
}

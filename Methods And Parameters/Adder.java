public class Adder {

    // Method to add two integers
    int add(int a,int b){
        return a+b;
    }

    // Method to add three integers
    int add(int a,int b,int c){
        return a+b+c;
    }

    public static void main(String[] args){
        Adder adder=new Adder();

        System.out.println("Sum of two numbers: "+adder.add(10,20));  // Calls the first add method
        System.out.println("Sum of three numbers: "+adder.add(10,20,30));  // Calls the second add method
    } 


}

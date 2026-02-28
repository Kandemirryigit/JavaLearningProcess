class Calculator {

    // Method to add two integers
    int add(int a, int b) {
        return a + b;
    }


    // Method to add two doubles
    double add(double a, double b) {
        return a + b;
    }

    public static void main(String[] args){
        Calculator calculator=new Calculator();

        System.out.println("Sum of two integers: " + calculator.add(5, 10)); // Calls the first add method
        System.out.println("Sum of two doubles: " + calculator.add(5.5, 10.5)); // Calls the second add method
    }
    
}

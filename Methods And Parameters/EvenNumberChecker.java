public class EvenNumberChecker {

    public static boolean isEven(int number){
        return number % 2==0;
    }

    public static void main(String[] args){
        boolean even1=isEven(10);
        boolean even2=isEven(7);
        System.out.println("10 is even: " + even1); // Output: 10 is even: true
        System.out.println("7 is even: " + even2);  // Output: 7 is even: false
    }
    
}

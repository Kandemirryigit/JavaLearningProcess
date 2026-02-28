public class Example4 {

    public static double cToF(double celsius){
        return (celsius * 9 / 5) + 32;
    }

    public static double fToC(double fahrenheit){
        return (fahrenheit - 32) * 5.0 / 9.0;
    }

    public static void main(String[] args){
        double result1=cToF(25);
        System.out.println("25 C = " + result1 + " F");

        double result2 = fToC(77);
        System.out.println("77 F = " + result2 + " C");
    }
    
}

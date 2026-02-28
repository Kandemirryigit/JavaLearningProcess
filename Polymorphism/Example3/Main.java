public class Main {
    public static void main(String[] args){
        Calculator calc=new Calculator();

        System.out.println(calc.add(5,3));       // int version
        System.out.println(calc.add(5.5,3.2));   // double version
        System.out.println(calc.add(1,2,3));  // 3-parameter version

    }
    
}

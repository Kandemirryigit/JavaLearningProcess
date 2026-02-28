public class PassByValuePrimitive {

    public static void main(String[] args){
        int x=10;
        System.out.println("Before calling modifyValue: x = " + x); // Output: 10
        modifyValue(x);
        System.out.println("After calling modifyValue: x = " + x);  // Output: 10
    }



    public static void modifyValue(int num){
        num=20;
        System.out.println("Inside modifyValue: num = " + num);      // Output: 20
    }

    
}



// In this example, x is initialized to 10.
// The modifyValue method receives a copy of the value 10, assigns it to the local variable num, and then changes num to 20.
// However, the original variable x in the main method remains unchanged. 
// The value of x persists as 10 because modifyValue operated on a copy of x's value

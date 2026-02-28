import java.util.Scanner;

public class Example2 {
    public static void main(String[] args){

        Scanner takeInput=new Scanner(System.in);

        System.out.print("Enter width: ");
        double width=takeInput.nextDouble();

        System.out.print("Enter height: ");
        double height=takeInput.nextDouble();

        double perimeter=2*(width+height);
        double area=width*height;

        System.out.printf("Perimeter: %.2f\n",perimeter);
        System.out.printf("Area: %.2f",area);

    }
}

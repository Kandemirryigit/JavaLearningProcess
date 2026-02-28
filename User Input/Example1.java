import java.util.Scanner;

public class Example1 {
    public static void main(String[] args){
        Scanner takeInput=new Scanner(System.in);

        System.out.print("Enter your name: ");
        String name=takeInput.nextLine();

        System.out.print("Enter your age: ");
        int age=takeInput.nextInt();

        System.out.print("Are you a student (true/false): ");
        boolean isStudent=takeInput.nextBoolean();


        System.out.print("Enter your gpa: ");
        double gpa=takeInput.nextDouble();


        System.out.printf("Hello %s\n",name);
        System.out.printf("You are %d years old \n",age);
        System.out.printf("you are a student: "+isStudent);
        System.out.printf("Your gpa is: %.2f\n",gpa);
        

        takeInput.close();
    }
    
}


// nextLine() for taking string input from keyboard.Stops at enter
// nextInt() for taking integer input from keyboard.Stops at space or enter
// nextDouble() for taking double input from keyboard.Stops at space or enter
// next() for taking full line input from keyboard.Stops at enter

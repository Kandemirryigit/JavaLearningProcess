public class Main {
    public static void main(String[] args){

        Employee e1=new Developer("Ali");
        Employee e2=new Manager("Ayşe");

        e1.work();
        e2.work();
    }
    
}


// Same method,different behavior
// This is polymorphism
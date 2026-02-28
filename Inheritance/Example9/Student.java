public class Student extends Person {

    public Student(String name){
        super(name);
    }

    public void study(){
        System.out.printf("%s is studying\n",name);
    }
    
}

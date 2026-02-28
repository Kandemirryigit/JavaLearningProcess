public class Student extends Person {

    private int grade;

    public Student(String name,int grade){
        super(name);
        this.grade=grade;
    }

    public void study(){
        System.out.printf("%s is studying.His gpa is %d\n",name,grade);
    }
    
}

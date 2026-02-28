public class Main{

    public static void main(String[] args){

        Student student1=new Student("Ali");
        Teacher teacher1=new Teacher("Ayşe");

        student1.introduce();
        student1.study();

        teacher1.introduce();
        teacher1.teach();
    }
    
}

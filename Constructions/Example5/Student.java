public class Student {
    String name;
    int age;

    public Student(String name,int age){
        this.name=name;
        this.age=age;
    }

    void introduce(){
        System.out.printf("Hello my name is %s.I'm %d years old.\n",name,age);
    }
    
}

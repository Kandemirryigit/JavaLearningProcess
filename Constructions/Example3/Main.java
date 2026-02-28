public class Main {
    public static void main(String[] args){
        Student student1=new Student("Yigit","Kandemir","101",3.0);
        Student student2=new Student("Huseyin","Coruk","102",2.5);
        Student student3=new Student("Baris","Tuncer","103",3.3);


        System.out.println("Student 1");
        System.out.printf("%s %s %s %.2f\n\n",student1.name,student1.surname,student1.id,student1.gpa);

        System.out.println("Student 2");
        System.out.printf("%s %s %s %.2f\n\n",student2.name,student2.surname,student2.id,student2.gpa);

        System.out.println("Student 3");
        System.out.printf("%s %s %s %.2f\n",student3.name,student3.surname,student3.id,student3.gpa);



    }
    
}

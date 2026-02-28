public class Teacher extends Person {

    public Teacher(String name){
        super(name);
    }
    
    public void teach(){
        System.out.printf("%s is teaching\n",name);
    }
}

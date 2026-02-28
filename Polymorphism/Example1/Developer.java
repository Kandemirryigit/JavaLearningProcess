public class Developer extends Employee {

    public Developer(String name){
        super(name);
    }

    @Override
    public void work(){
        System.out.printf("%s is writing code\n",name);
    }
    
}

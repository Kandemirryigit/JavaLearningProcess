public class Manager extends Employee {

    public Manager(String name){
        super(name);
    }

    @Override
    public void work(){
        System.out.printf("%s is managing the team\n",name);
    }
    
}

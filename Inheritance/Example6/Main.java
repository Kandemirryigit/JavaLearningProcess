public class Main {
    public static void main(String[] args){
        Employee employee1=new Developer("Yigit","Kandemir",100);
        Employee employee2=new Manager("Ahmet","Kandemir",200);

        System.out.println(employee1.calculateBonus());
        System.out.println(employee2.calculateBonus());
        
    }
    
}

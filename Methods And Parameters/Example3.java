public class Example3 {

    public static String createGreeting(String name,int age,String city){
        return "Hello,my name is "+name+" I'm "+age+" years old.I'm coming from "+city;
    }
    
    public static void main(String[] args){
        String greeting=createGreeting("Yigit",20,"Istanbul");
        System.out.println(greeting);
    }
}

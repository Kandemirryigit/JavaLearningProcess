public class Example2 {

    public static void printMessage(String message,int count){
        for(int i=0;i<count;i++){
            System.out.println(message);
        }
    }

    public static void main(String[] args){
        printMessage("Hello,World!",3);
    }
    
}

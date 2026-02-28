public class Main {
    public static void main(String[] args){
        Payment p1=new CreditCartPayment(500.0,"1234-5678");
        Payment p2=new PaypalPayment(300.0,"yigit@mail.com");

        p1.processPayment();
        p2.processPayment();
    }
    
}

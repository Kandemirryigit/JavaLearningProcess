public class PaypalPayment extends Payment {

    private String email;

    public PaypalPayment(double amount,String email){
        super(amount);
        this.email=email;
    }

    @Override
    public void processPayment(){
        System.out.println("Processing PayPal payment for: " + email);
        System.out.println("Amount: $" + amount);
    }

    
}

public class CreditCartPayment extends Payment {
    private String cardNumber;

    public CreditCartPayment(double amount,String cardNumber){
        super(amount);
        this.cardNumber=cardNumber;
    }

    @Override
    public void processPayment(){
        System.out.println("Charging credit card: " + cardNumber);
        System.out.println("Amount: $" + amount);
    }

    
}

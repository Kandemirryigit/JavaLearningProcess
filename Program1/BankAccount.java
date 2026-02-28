public class BankAccount {

    private String owner;
    private String pin;
    private double balance;

    public BankAccount(String owner,String pin,double balance){
        this.owner=owner;
        this.pin=pin;
        this.balance=balance;
    }


    public boolean authenticate(String enteredPin){
        return this.pin.equals(enteredPin);
    }


    public void deposit(double amount){
        if(amount>0){
            balance+=amount;
            System.out.println("Deposit successful");
        }
        else{
            System.out.println("Invalid amount.");
        }
    }


    public void withdraw(double amount){
        if(amount<=balance && amount>0){
            balance-=amount;
            System.out.println("Withdraw successful");
        }
        else{
            System.out.println("Invalid withdrawal");
        }
    }


    public void checkBalance(){
        System.out.println("cuurent balance: $"+balance);
    }


    public String getOwner(){
        return owner;
    }


    
}

public class BankAccount {
    protected double balance;

    public BankAccount(double balance){
        this.balance=balance;
    }

    public void deposit(double amount){
        balance+=amount;
        System.out.printf("New Balance: %.2f\n",balance);
    }
}

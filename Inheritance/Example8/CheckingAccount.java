public class CheckingAccount extends BankAccount {

    public CheckingAccount(double balance){
        super(balance);
    }

    public void withdraw(double amount){
        balance-=amount;
        System.out.printf("Balance adter withdraw: %.2f\n",balance);
    }


    
}

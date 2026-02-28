public class SavingsAccount extends BankAccount {

    public SavingsAccount(double balance){
        super(balance);
    }

    public void addInterest(){
        balance+=balance*0.05;
        System.out.printf("Balance after interest: %.2f\n",balance);
    }
     
}

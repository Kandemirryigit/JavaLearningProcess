public class Main {
    public static void main(String[] args){
        SavingsAccount s=new SavingsAccount(1000);
        CheckingAccount c=new CheckingAccount(2000);

        System.out.println("\nSavings Account");
        s.deposit(200);
        s.addInterest();

        System.out.println("\nChecking Account");
        c.deposit(300);
        c.withdraw(300);
    }
    
}

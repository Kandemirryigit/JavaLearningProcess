import java.util.Scanner;

public class ATM {

    public static void main(String[] args){
        Scanner takeInput=new Scanner(System.in);

        BankAccount account1=new BankAccount("Yigit Kandemir","1234",1000);
        BankAccount account2=new BankAccount("Ahmet Kandemir","5678",2000);

        System.out.print("Enter your name: ");
        String name=takeInput.nextLine();

        System.out.print("Enter your PIN: ");
        String pin=takeInput.nextLine();

        BankAccount currentAccount=null;

        if(account1.getOwner().equals(name) && account1.authenticate(pin)){
            currentAccount=account1;
        }
        else if(account2.getOwner().equals(name) && account2.authenticate(pin)){
            currentAccount=account2;
        }
        else{
            System.out.println("Authentication failed");
            return;
        }


        int choice=0;
        

        do{
            System.out.println("\n1. Check Balance");
            System.out.println("2. Deposit");
            System.out.println("3. Withdraw");
            System.out.println("4. Exit");
            System.out.print("choose: ");
            choice=takeInput.nextInt();

            switch(choice){
                case 1:
                    currentAccount.checkBalance();
                    break;
                case 2:
                    System.out.print("Enter amount: ");
                    double depositAmount=takeInput.nextDouble();
                    currentAccount.deposit(depositAmount);
                    break;
                case 3:
                    System.out.print("Enter amount: ");
                    double withdrawAmount=takeInput.nextDouble();
                    currentAccount.withdraw(withdrawAmount);
                    break;
                case 4:
                    System.out.println("Goodbye");
                    break;
                default:
                    System.out.println("Invalid choice");
            }

        }while(choice!=4);

  
    }
    
}

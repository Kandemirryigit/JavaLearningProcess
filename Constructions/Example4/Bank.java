public class Bank {
    String name;
    String surname;
    double balance;

    public Bank(String name,String surname,double balance){
        this.name=name;
        this.surname=surname;

        if(balance<0){
            System.out.println("Invalid money");
            this.balance=0;
        }
        else{
            this.balance=balance;
        }
    }


    void showInfo(){
        System.out.printf("Owner: %s %s  Balance: %.2f\n",name,surname,balance);
    }

    
}

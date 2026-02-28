public class Example5 {
    
    public static void checkEligibility(int age,boolean hasConsent){
        if(age>18 || hasConsent){
            System.out.println("Eligible");
        }else{
            System.out.println("Not eligible");
        }
    }


    public static void main(String[] args){
        checkEligibility(16,true);
        checkEligibility(16,false);
        checkEligibility(20,false);
    }
    
}

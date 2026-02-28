public class Main {
    public static void main(String[] args){

        Product p1=new Electronics("Laptop",1000);
        Product p2=new Clothing("T-Shirt",100);

        System.out.printf("%s---> Discount: %.2f\n",p1.getName(),p1.calculateDiscount());
        System.out.printf("%s---> Discount: %.2f\n",p2.getName(),p2.calculateDiscount());
    }
    
}

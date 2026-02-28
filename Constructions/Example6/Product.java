public class Product {
    String name;
    double price;

    public Product(String name,double price){
        this.name=name;

        if(price<0){
            System.out.println("Price cannot be negative");
            this.price=0;
        }
        else{
            this.price=price;
        }

    }

    void showProduct(){
        System.out.printf("Product name:%s price:%.2f\n",name,price);
    }
    
}

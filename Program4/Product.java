abstract class Product {

    private String name;
    protected double price;

    public Product(String name,double price){
        this.name=name;
        this.price=price;
    }

    public String getName(){
        return name;
    }

    public abstract double calculateDiscount();
    
}

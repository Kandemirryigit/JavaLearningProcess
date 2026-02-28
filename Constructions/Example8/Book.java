public class Book {
    String title;
    String author;
    double price;

    // Constructor 1
    public Book(String title,String author){
        this.title=title;
        this.author=author;
        this.price=0;
    }



    // Constructor 2
    public Book(String title,String author,double price){
        this.title=title;
        this.author=author;
        this.price=price;
    }

    void showInfo(){
        System.out.printf("%s by %s %.2f TL\n",title,author,price);
    }
}

public class Book {

    private String title;
    private String author;
    private boolean isAvailable;


    // Construction
    public Book(String title,String author){
        this.title=title;
        this.author=author;
        this.isAvailable=true;
    }



    // Non-static method
    public void borrowBook(){
        if(isAvailable){
            isAvailable=false;
            System.out.println("You borrowed: "+title);
        }
        else{
            System.out.println("book is alreadt borrowed");
        }
    }


    // Non-static method
    public void returnBook(){
        if(!isAvailable){
            isAvailable=true;
            System.out.println("You returned: "+title);
        }
        else{
            System.out.println("Book was not borrowed");
        }
    }


    // Non-static method
    public void displayInfo(){
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Available: " + (isAvailable ? "Yes" : "No"));
        System.out.println("----------------------");
    }

    

    // Non-static method
    public String getTitle(){
        return title;
    }









    
}

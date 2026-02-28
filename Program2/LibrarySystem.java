import java.util.ArrayList;
import java.util.Scanner;


public class LibrarySystem {
    public static void main(String[] args){

    Scanner takeInput=new Scanner(System.in);
    ArrayList<Book> books=new ArrayList<>();


    books.add(new Book("Clean Code","Robert Martin"));
    books.add(new Book("Effective Java","Joshua Bloch"));
    books.add(new Book("The Pragmatic Programmer","Andrew Hunt"));


    int choice;

    do{
        System.out.println("\n1. Show Books");
        System.out.println("2. Borrow Book");
        System.out.println("3. Return Book");
        System.out.println("4. Exit");
        System.out.print("Choose: ");
        choice=takeInput.nextInt();
        takeInput.nextLine();  // consume newline


        switch(choice){
            case 1:
                for(Book book:books){
                    book.displayInfo();
                }
                break;

            case 2:
                System.out.print("Enter book title: ");
                String borrowTitle=takeInput.nextLine();

                for(Book book:books){
                    if(book.getTitle().equalsIgnoreCase(borrowTitle)){
                        book.borrowBook();
                        break;
                    }
                }
                break;

            case 3:
                System.out.print("Enter book title: ");
                String returnTitle = takeInput.nextLine();

                for(Book book:books){
                    if(book.getTitle().equalsIgnoreCase(returnTitle)){
                        book.returnBook();
                        break;
                    }
                }
                break;
            
            case 4:
                System.out.println("Goodbye.");
                break;
            default:
                System.out.println("Invalid choice.");  
        }

    }while(choice!=4);


    }

}

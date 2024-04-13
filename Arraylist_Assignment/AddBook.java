import java.util.List;
import java.util.Scanner;
import java.util.ArrayList;
class AddBook {

    
    static List<Book> bookList=new ArrayList<>(); 
        
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        BookMethods bookMethods=new BookMethods();
       
        while(true) {
            System.out.println("\n 1-Add Book\n 2-Update Book\n 3-Delete Book\n 4-display\n 5-Exit\n");
            System.out.println("Enter choice:");
            int choice=sc.nextInt();
            switch(choice) {
                case 1:bookMethods.addBooklist();
                        break;
                case 2:bookMethods.updateBook();
                        break;
                case 3:bookMethods.deleteBook();
                        break;
                case 4:printBooks();
                        break;
                case 5:return;
            }
        }
    }
    private static void printBooks() {
        if (bookList.size() > 0) {
            System.out.println(String.format("%-5s %-20s %-20s %-20s %s",
                    "ISBN", "Book Name", "Author", "Publication", "Available count"));
            for (Book book : bookList) {
                System.out.println(String.format("%-5s %-20s %-20s %-20s %d",
                        book.getIsbn(), book.getBookName(), book.getAuthor(), book.getPublication(), book.getAvilableCount()));
            }
        } else {
            System.out.println("No books available");
        }
    }
    
    static void addlist(Book book) {
            bookList.add(book);
            System.out.println("book added successfully!");
    }
    public static void deleteBookList(String isbn) {
            if(bookList.size()>0) {
            for(int i=0;i<bookList.size();i++)
            {
            if(bookList.get(i).getIsbn().equals(isbn))
            bookList.remove(i);
            }
            System.out.println("Book deleted successfully!");
            }       
            else
            System.out.println("No books avilable");
        }

    public static void UpdateListBook(String isbn, int count) {
        if(bookList.size()>0) {
        for(int i=0;i<bookList.size();i++)
        {
        if(bookList.get(i).getIsbn().equals(isbn))
        bookList.get(i).setAvilableCount(count);
        }
        System.out.println("Book updated successfully!");
    }
    else
    System.out.println("No books avilable");
    }
        
        
    }
    
   



 class Book {
    private String isbn;
    private String bookName;
    private String Author;
    private String publication;
    private int avilableCount;

    public String getIsbn() {
        return isbn;
    }
    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }
    public String getBookName() {
        return bookName;
    }
    public void setBookName(String bookName) {
        this.bookName = bookName;
    }
    public String getAuthor() {
        return Author;
    }
    public void setAuthor(String author) {
        Author = author;
    }
    public String getPublication() {
        return publication;
    }
    public void setPublication(String publication) {
        this.publication = publication;
    }
    public int getAvilableCount() {
        return avilableCount;
    }
    public void setAvilableCount(int avilableCount) {
        this.avilableCount = avilableCount;
    }
}

class BookMethods {

    Scanner sc=new Scanner(System.in);
    Book book=new Book();
    public void addBooklist() {
        
        System.out.println("Enter book details:");
        System.out.println("Enter ISBN:");
        book.setIsbn(sc.next());
        System.out.println("Enter book name:");
        book.setBookName(sc.next());
        System.out.println("Enter author:");
        book.setAuthor(sc.next());
        System.out.println("Enter publication year:");
        book.setPublication(sc.next());
        System.out.println("Enter avilable count:");
        book.setAvilableCount(sc.nextInt());
        AddBook.addlist(book);

        }
    public void deleteBook() {
       System.out.println("Enter book isbn number");
       AddBook.deleteBookList(sc.next());
    }
    public void updateBook() {
       System.out.println("Enter book id for updation:");
       String isbn=sc.next();
       System.out.println("Enter book avilable count:");
       int count=sc.nextInt();
       AddBook.UpdateListBook(isbn,count);
    }
}

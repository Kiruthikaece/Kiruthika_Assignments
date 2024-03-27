import java.util.*;

class AddBooks {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        System.out.println("Enter how many books added");
        int n=sc.nextInt();
        Book[] arr=new Book[n];

        int i=0;

        while(i<n) {
        System.out.println("Enter ISBN number:");
        String isbn=sc.next();
        System.out.println("Enter Book Title:");
        String title=sc.next();
        System.out.println("Enter Book Author:");
        String author=sc.next();
        System.out.println("Enter Book genre:");
        String genre=sc.next();
        System.out.println("Enter publication year:");
        String year=sc.next();
        System.out.println("Enter Avilable count:");
        int count=sc.nextInt();
        Book book=new Book(isbn,title,author,genre,year,count);
        arr[i]=book;
        i++;
        }

        AddBooks addbooks=new AddBooks();
        addbooks.printDetails(arr);
        sc.close();
    }

    public void printDetails(Book[] arr) {
        System.out.println("----------------------------------------------------------------------------------------------------------");
        System.out.printf("%-15s %-15s %-15s %-15s %-15s %-15s\n","ISBN","Title","Author","Genre","Year","Available count");
        System.out.println("----------------------------------------------------------------------------------------------------------");
        for(Book book : arr) {
            System.out.printf("%-15s %-15s %-15s %-15s %-15s %-15d\n",
            book.getIsbn(), book.getTitle(), book.getAuthor(), book.getGenre(), book.getYear(), book.getAvilableCount());
        }
    }
    
}

class Book {
    private String isbn;
    private String title;
    private String author;
    private String genre;
    private String year;
    private int avilableCount;

    public Book(String isbn,String title,String author,String genre,String year,int avilableCount) {
        this.isbn=isbn;
        this.title=title;
        this.author=author;
        this.genre=genre;
        this.year=year;
        this.avilableCount=avilableCount;
       
    }

    public String getIsbn() {
        return isbn;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public String getGenre() {
        return genre;
    }

    public String getYear() {
        return year;
    }

    public int getAvilableCount() {
        return avilableCount;
    }

   

}
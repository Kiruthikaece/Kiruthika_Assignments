import java.util.Scanner;

class BookDto {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        Book book=new Book();

        System.out.println("Enter ISBN number:");
        book.setIsbn(sc.next());
        System.out.println("Enter Book Title:");
        book.setTitle(sc.next());
        System.out.println("Enter Book Author:");
        book.setAuthor(sc.next());
        System.out.println("Enter Book genre:");
        book.setGenre(sc.next());
        System.out.println("Enter publication year:");
        book.setYear(sc.next());
        System.out.println("Enter Avilable count:");
        book.setAvilableCount(sc.nextInt());

        System.out.println("--------------------------------------");
        System.out.println("    Book Details    ");
        System.out.println("--------------------------------------");
        System.out.println("Library Name:"+book.getLibraryName());
        System.out.println("ISBN:"+book.getIsbn());
        System.out.println("Title:"+book.getTitle());
        System.out.println("Author:"+book.getAuthor());
        System.out.println("Genre:"+book.getGenre());
        System.out.println("Year:"+book.getYear());
        System.out.println("Avilable count:"+book.getAvilableCount());
        System.out.println("--------------------------------------");

        sc.close();
    }
}
class Book {
        private String isbn;
        private String title;
        private String author;
        private String genre;
        private String year;
        private int avilableCount;

        private static String libraryName="ZSGS Libray";


        public String getLibraryName() {
            return libraryName;
        }
        public String getIsbn() {
            return isbn;
        }
        public void setIsbn(String isbn) {
            this.isbn = isbn;
        }
        public String getTitle() {
            return title;
        }  
        public void setTitle(String title) {
            this.title = title;
        }
        public String getAuthor() {
            return author;
        }
        public void setAuthor(String author) {
            this.author = author;
        }
        public String getGenre() {
            return genre;
        }
        public void setGenre(String genre) {
            this.genre = genre;
        }
        public String getYear() {
            return year;
        }
        public void setYear(String year) {
            this.year = year;
        }
        public int getAvilableCount() {
            return avilableCount;
        }
        public void setAvilableCount(int avilableCount) {
            this.avilableCount=avilableCount;
        }
       
}

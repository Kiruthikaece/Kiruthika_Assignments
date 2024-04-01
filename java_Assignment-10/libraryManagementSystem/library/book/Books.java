package libraryManagementSystem.library.book;

public class Books {
        private int isbn;
        private String title;
        private String author;
        private String publicationYear;

        public Books(int isbn,String title,String author,String publicationYear) {
            this.isbn=isbn;
            this.title=title;
            this.author=author;
            this.publicationYear=publicationYear;
        }
        public int getIsbn() {
            return isbn;
        }
        public void setIsbn(int isbn) {
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
        public String getPublicationYear() {
            return publicationYear;
        }
        public void setPublicationYear(String publicationYear) {
            this.publicationYear = publicationYear;
        }
    
}

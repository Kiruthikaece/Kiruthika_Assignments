package library;

 
public class Account {
    private int no_borrowed_books;
    private int no_reserved_books;
    private int no_lost_books;
    private int fine_amount;
    public int getNo_borrowed_books() {
        return no_borrowed_books;
    }
    public void setNo_borrowed_books(int no_borrowed_books) {
        this.no_borrowed_books = no_borrowed_books;
    }
    public int getNo_reserved_books() {
        return no_reserved_books;
    }
    public void setNo_reserved_books(int no_reserved_books) {
        this.no_reserved_books = no_reserved_books;
    }
    public int getNo_lost_books() {
        return no_lost_books;
    }
    public void setNo_lost_books(int no_lost_books) {
        this.no_lost_books = no_lost_books;
    }
    public int getFine_amount() {
        return fine_amount;
    }
    public void setFine_amount(int fine_amount) {
        this.fine_amount = fine_amount;
    }

    public void  calculate_fine() {

    }
    
}

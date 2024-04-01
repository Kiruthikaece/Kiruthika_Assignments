package libraryManagementSystem.library.transaction;

import libraryManagementSystem.library.book.Books;
import libraryManagementSystem.library.member.Members;

public class Transaction {
    private Books book;
    private Members memeber;
    private String transactionDate;

    public Transaction(Books book,Members memeber,String transactionDate) {
        this.book=book;
        this.memeber=memeber;
        this.transactionDate=transactionDate;
    }

    public Books getBook() {
        return book;
    }
    public void setBook(Books book) {
        this.book = book;
    }
    public Members getMemeber() {
        return memeber;
    }
    public void setMemeber(Members memeber) {
        this.memeber = memeber;
    }
    public String getTransactionDate() {
        return transactionDate;
    }
    public void setTransactionDate(String transactionDate) {
        this.transactionDate = transactionDate;
    }
}

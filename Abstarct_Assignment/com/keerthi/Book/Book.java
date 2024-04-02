package com.keerthi.Book;

public class Book {
    private String isbn;
    private String bookName;
    private String Author;
    private String publication;
    private int avilableCount;
    
    Book() {
        
    }
    Book(String isbn,String bookName,String Author,String publication,int avilableCount) {
        this.isbn=isbn;
        this.bookName=bookName;
        this.Author=Author;
        this.publication=publication;
        this.avilableCount=avilableCount;
    }
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

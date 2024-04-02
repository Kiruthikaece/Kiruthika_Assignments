package com.keerthi.Book;

import java.util.Scanner;

abstract class BookMenu {
    abstract void login();
    abstract boolean CheckValidUser(User user);
    abstract void update(Book book);
}

class ExtendBookMenu extends BookMenu{
    Scanner sc=new Scanner(System.in);
    boolean isloggedin=false;

    Book book=new Book();
    void login() {
        User user=new User();

        System.out.println("Enter userName");
        user.setUserName(sc.next());
        System.out.println("Enter password");
        user.setPassword(sc.next());
        CheckValidUser(user);
    }

    boolean CheckValidUser(User user) {
        if(user.getUserName().equalsIgnoreCase("admin") && user.getPassword().equals("admin123")) {
            isloggedin=true;
            System.out.println("\n----Logged in successfully-----");
            return true;
        }
        return false; 
    }

    void update(Book book) {
       
        if(isloggedin) {
            System.out.println("Enter book available count for updation");
            book.setAvilableCount(sc.nextInt());
            System.out.println("Book updated successfully");
            printBookDetails(book);
        } else {
            System.out.println("Invalid credentials");
        }
    }

    private void printBookDetails(Book book) {
       System.out.println("---- Book details -----");
       System.out.println("ISBN:"+book.getIsbn());
       System.out.println("Book name:"+book.getBookName());
       System.out.println("Book Author:"+book.getAuthor());
       System.out.println("Avilable count:"+book.getAvilableCount());
    }

}

public class BookAuthorization {
    public static void main(String[] args) {
        Book book=new Book("123","Greater world","Willamson","2020",10);
        ExtendBookMenu extendbookmenu=new ExtendBookMenu();
        extendbookmenu.login();
        extendbookmenu.update(book);
    }
}

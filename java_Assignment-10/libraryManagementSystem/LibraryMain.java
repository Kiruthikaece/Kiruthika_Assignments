package libraryManagementSystem;

import java.util.Scanner;

import libraryManagementSystem.library.book.Books;
import libraryManagementSystem.library.member.Members;
import libraryManagementSystem.library.transaction.Transaction;

public class LibraryMain {
    public static void main(String[] args) {
       
        Books book=new Books(10,"Tom and jerry","Kane willamson","2020");

        Members member=new Members(1,"keerthi");
    
        Transaction transaction=new Transaction(book,member,"1.1.2024");

        System.out.println("ISBN:"+book.getIsbn());
        System.out.println("book name:"+book.getTitle());
        System.out.println("Member Name:"+member.getMemberName());
        System.out.println("Transaction Date:"+transaction.getTransactionDate());
    }
}

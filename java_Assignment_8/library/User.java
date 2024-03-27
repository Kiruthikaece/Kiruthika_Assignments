package library;

import java.util.*;

class User {
    List<Book> book=new ArrayList<>();
    List<Account> account=new ArrayList<>();
    private String name;
    private int id;
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }

    public void verify() {

    }
    public void checkAccount() {

    }

    public void get_book_info() {

    }
}

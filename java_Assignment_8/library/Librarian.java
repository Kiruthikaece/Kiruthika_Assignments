package library;

import java.util.*;

public class Librarian {

    private String name;
    private String id;
    private String password;
    private String searchString;

    List<Book> book=new ArrayList<>();
    
    public Librarian() {

    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }
    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }
    public String getSearchString() {
        return searchString;
    }
    public void setSearchString(String searchString) {
        this.searchString = searchString;
    }
    
    public void verify_librarian() {

    }
    public void search() {

    }
}

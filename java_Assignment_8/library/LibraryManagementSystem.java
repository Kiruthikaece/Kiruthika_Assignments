package library;

import java.util.*;

public class LibraryManagementSystem {
    private String userType;
    private String userName;
    private String password;
    Librarian librarian;
    List<User> user=new ArrayList<>();
    List<Book> book=new ArrayList<>();

    

    public String getUserType() {
        return userType;
    }
    public void setUserType(String userType) {
        this.userType = userType;
    }
    public String getUserName() {
        return userName;
    }
    public void setUserName(String userName) {
        this.userName = userName;
    }
    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }

    public void login() {

    }

    public void register() {
        
    }

    public void logout() {
        
    }

}

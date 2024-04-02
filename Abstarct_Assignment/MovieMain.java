import java.util.Scanner;

abstract class Movie { 
    
    abstract String getName();
    abstract String genre();
    abstract double duration();
    public void printDetails() {
        System.out.println("Name: " + getName());
        System.out.println("Genre: " + genre());
        System.out.println("Duration: " + duration() + " hours");
    }
    
    
}

class ActionMovie extends Movie {

    String getName() {
        return "Thrill";
    }
    String genre() {
      return "Action";
    }

    double duration() {
      return 2.30;
    }
}

class HorrorMovie extends Movie {

    String getName() {
        return "Ghost come";
    }
    String genre() {
      return "Horror movie";
    }

    double duration() {
      return 2.15;
    }
}

public class MovieMain {
    public static void main(String[] args) {
        Movie movie1=new HorrorMovie();
        movie1.printDetails();
        Movie movie2=new ActionMovie();
        movie2.printDetails();
    }
}
public class MovieHierarchy {
    public static void main(String[] args) {

        Movie movie1=new RomComMovie();
        movie1.printGenre();
        Movie movie2=new ThrillerMovie();
        movie2.printGenre();
        Movie movie3=new ComedyMovie();
        movie3.printGenre();
    }
}


abstract class Movie {
abstract public void printGenre();
}
class RomComMovie extends Movie {
    public void printGenre() {
        System.out.println("RomComMovie");
    }
}
class ThrillerMovie extends Movie {
    public void printGenre() {
        System.out.println("ThrillerMovie");
    }
}
class ComedyMovie extends Movie {
    public void printGenre() {
        System.out.println("ComedyMovie");
    }
}

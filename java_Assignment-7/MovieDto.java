import java.util.Scanner;

class MovieDto {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        Movie movie=new Movie();

        System.out.println("Enter movie name:");
        movie.setMovieName(sc.next());
        System.out.println("Enter genre:");
        movie.setGenre(sc.next());
        System.out.println("Enter duration:");
        movie.setDuration(sc.nextFloat());
        System.out.println("Enter show Time:");
        movie.setShowTime(sc.next());

        System.out.println("--------------------------------------");
        System.out.println("   Movie Details    ");
        System.out.println("--------------------------------------");
        System.out.println("Theatre name:"+movie.getTheatreName());
        System.out.println("Movie name:"+movie.getMovieName());
        System.out.println("Movie genre:"+movie.getGenre());
        System.out.println("Movie Show Time:"+movie.getShowTime());
        System.out.println("Movie Duration:"+movie.getDuration());
        System.out.println("--------------------------------------");

        sc.close();
    }
}
class Movie { 
    private String movieName;
    private String genre;
    private float duration ;
    private String showTime;
    private static String theatreName="GHMS Theatre";

    public String getTheatreName() {
        return theatreName;
    }
    public String getMovieName() {
        return movieName;
    }
    public void setMovieName(String movieName) {
        this.movieName = movieName;
    }
    public String getGenre() {
        return genre;
    }
    public void setGenre(String genre) {
        this.genre = genre;
    }
    public float getDuration() {
        return duration;
    }
    public void setDuration(float duration) {
        this.duration = duration;
    }
    public String getShowTime() {
        return showTime;
    }
    public void setShowTime(String showTime) {
        this.showTime = showTime;
    }

    
}
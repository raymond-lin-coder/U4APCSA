package U4T11;
import java.util.ArrayList;
public class Movie {
    private String title;
    private String[] cast;
    private String director;
    private String overview;
    private int runtime;
    private double userRating;
    public Movie(String title, String cast, String director, String overview, int runtime, double userRating) {
        this.title = title;
        this.cast = cast.split("\\|");
        this.director = director;
        this.overview = overview;
        this.runtime = runtime;
        this.userRating = userRating;
    }
    public String getTitle() {
        return title;
    }

    public String[] getCast() {
        return cast;
    }

    public String getDirector() {
        return director;
    }

    public String getOverview() {
        return overview;
    }

    public int getRuntime() {
        return runtime;
    }

    public double getUserRating() {
        return userRating;
    }
    public String toString() {
        String castString = "[";
        for(int i = 0; i < cast.length - 1; i++) {
            castString += cast[i] + ", ";
        }
        castString += cast[cast.length - 1] + "]";
        return "TITLE: " + title + "\nCAST: " + castString + "\nDIRECTOR: " + director + "\nOVERVIEW: " + overview + "\nRUNTIME: " + runtime + " minutes\nUSER RATING: " + userRating;
    }
    public static void printAverages(ArrayList<Movie> movies) {
        double totalRuntime = 0;
        double totalRating = 0;
        for(Movie movie : movies) {
            totalRuntime += movie.getRuntime();
            totalRating += movie.getUserRating();
        }
        double averageRuntime = totalRuntime / movies.size();
        double averageRating = totalRating / movies.size();
        System.out.println("Average runtime: " + averageRuntime + "\nAverage rating: " + averageRating);
    }
}

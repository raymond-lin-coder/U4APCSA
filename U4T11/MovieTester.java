package U4T11;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class MovieTester {
    public static void searchTitles(Scanner scan, ArrayList<Movie> movies) {
        System.out.print("Enter a title search term: ");
        String searchTerm = scan.nextLine();
        int count = 0;
        ArrayList<Movie> matches = new ArrayList<Movie>();
        for(Movie movie : movies) {
            String title = movie.getTitle();
            if (title.toLowerCase().contains(searchTerm.toLowerCase())) {
                count ++;
                matches.add(movie);
                System.out.println("" + count + ". " + title);
            }
        }
        if (count == 0) {
            System.out.println("No movie titles match that search term!");
        }
        else {
            System.out.println("Which movie would you like to learn more about?");
            System.out.print("Enter number: ");
            int movieNumber = scan.nextInt();
            scan.nextLine();
            while (movieNumber < 1 || movieNumber > count) {
                System.out.println("Invalid movie number! Try again.");
                System.out.print("Enter number: ");
                movieNumber = scan.nextInt();
                scan.nextLine();
            }
            System.out.println(matches.get(movieNumber - 1));
            System.out.print("** Press Enter to Return to Main Menu **");
            scan.nextLine();
            }
        }
    public static void main(String[] args) {
        ArrayList<Movie> movies = new ArrayList<Movie>();
        try {
            File f = new File("U4T11/movies_data.csv");
            Scanner s = new Scanner(f);
            while (s.hasNextLine()) {
                String line = s.nextLine();
                ArrayList<String> data = new ArrayList<String>();
                String str = "";
                for(int i = 0; i < line.length(); i++) {
                        if (!line.substring(i, i + 1).equals(",")) {
                            str += line.substring(i, i + 1);
                        }
                        else {
                            data.add(str);
                            str = "";
                            continue;
                        }
                }
                data.add(str);
                if (!line.equals("")) {
                    movies.add(new Movie(data.get(0), data.get(1), data.get(2), data.get(3), Integer.parseInt(data.get(4)), Double.parseDouble(data.get(5))));
                }
            }
            s.close();
        }
        catch (FileNotFoundException e) {
            System.out.println("File not found: " + "movies_data.csv");
        }
        Scanner inputScanner = new Scanner(System.in);

System.out.println("Welcome to the movie collection!");

String menuOption = "";





while (!menuOption.equals("q")) {

  System.out.println("------------ Main Menu ----------");

  System.out.println("- search (t)itles");

  System.out.println("- (q)uit");

  System.out.print("Enter choice: ");

  menuOption = inputScanner.nextLine();





  if (menuOption.equals("t")) {

    searchTitles(inputScanner, movies);

  } else if (menuOption.equals("q")) {

    System.out.println("Goodbye!");

  } else {

    System.out.println("Invalid choice!");

  }

}
    }
}

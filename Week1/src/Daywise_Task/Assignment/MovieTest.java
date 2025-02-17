package Assignment;
import java.util.*;

public class MovieTest {
    public static void main(String[] args) {
        MovieManager movieManager = new MovieManager();
        List<Movie> movies = movieManager.createMovieSet();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\n--------- Movie Sorting Menu ----------");
            System.out.println("1. Sort by Language");
            System.out.println("2. Sort by Duration");
            System.out.println("3. Sort by Director");
            System.out.println("4. Display Movies");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");

            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    movieManager.sortByLanguage(movies);
                    break;
                case 2:
                    movieManager.sortByDuration(movies);
                    break;
                case 3:
                    movieManager.sortByDirector(movies);
                    break;
                case 4:
                    movieManager.displayMovies(movies);
                    break;
                case 5:
                    System.out.println("Exiting...");
                    scanner.close();
                    return;
                default:
                    System.out.println("Invalid choice! Please try again.");
            }
        }
    }
}
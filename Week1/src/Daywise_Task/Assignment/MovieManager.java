package Assignment;

import java.util.*;

public class MovieManager {

    public List<Movie> createMovieSet() {
        List<Movie> movieList = new ArrayList<>();
        movieList.add(new Movie("Inception", "English", "2010-07-16", "Christopher Nolan", "Emma Thomas", 2.8));
        movieList.add(new Movie("Parasite", "Korean", "2019-05-30", "Bong Joon-ho", "Kwak Sin-ae", 2.12));
        movieList.add(new Movie("Spirited Away", "Japanese", "2001-07-20", "Hayao Miyazaki", "Toshio Suzuki", 2.05));
        movieList.add(new Movie("Dangal", "Hindi", "2016-12-23", "Nitesh Tiwari", "Aamir Khan", 2.49));
        movieList.add(new Movie("Interstellar", "English", "2014-11-07", "Christopher Nolan", "Emma Thomas", 2.89));
        movieList.add(new Movie("The Godfather", "English", "1972-03-24", "Francis Ford Coppola", "Albert S. Ruddy", 2.92));
        return movieList;
    }

    public void sortByLanguage(List<Movie> movieList) {
        Collections.sort(movieList); 
        System.out.println("\nMovies sorted by Language:");
        displayMovies(movieList);
    }

    // Sort by Duration 
    public void sortByDuration(List<Movie> movieList) {
        movieList.sort(Comparator.comparingDouble(Movie::getDuration)); 
        System.out.println("\nMovies sorted by Duration:");
        displayMovies(movieList);
    }

    // Sort by Director
    public void sortByDirector(List<Movie> movieList) {
        movieList.sort(Comparator.comparing(Movie::getDirector)); // Sort by director
        System.out.println("\nMovies sorted by Director:");
        displayMovies(movieList);
    }

    // Display the movies 
    public void displayMovies(List<Movie> movieList) {
        for (Movie movie : movieList) {
            System.out.println(movie);
        }
    }
}
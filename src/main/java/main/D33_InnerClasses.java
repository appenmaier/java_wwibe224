package main;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;

import model.InvalidValueException;
import model.Movie;
import model.Movie.Genre;

/**
 * Inner Classes
 *
 * @author Daniel Appenmaier
 * @version 1.0
 *
 */
public class D33_InnerClasses {

   public static void main(String[] args) throws InvalidValueException {
      List<Movie> movies = new ArrayList<>();

      movies.add(new Movie("John Wick 4",
            List.of(Genre.ACTION, Genre.CRIME, Genre.THRILLER),
            "2023",
            169,
            7.8,
            241552));
      movies.add(new Movie("Disaster Movie",
            List.of(Genre.COMEDY, Genre.SCIENCE_FICTION),
            "2008",
            87,
            2.1,
            93334));
      movies.add(new Movie("The Super Mario Bros. Movie",
            List.of(Genre.ANIMATION, Genre.ADVENTURE, Genre.COMEDY),
            "2023",
            92,
            7.1,
            161146));

      /* Outer Class */
      Collections.sort(movies, new Movie.MovieByRatingDescendingComparator());
      System.out.println(movies);

      /* Local Class */
      class MovieByRuntimeInMinutesDescendingComparator implements Comparator<Movie> {

         @Override
         public int compare(Movie movie1, Movie movie2) {
            return Integer.compare(movie1.getRuntimeInMinutes(), movie2.getRuntimeInMinutes());
         }

      }
      Collections.sort(movies, new MovieByRuntimeInMinutesDescendingComparator());
      System.out.println(movies);

      /* Anonymous Class */
      Collections.sort(movies, new Comparator<Movie>() {

         @Override
         public int compare(Movie movie1, Movie movie2) {
            return Integer.compare(movie2.getRuntimeInMinutes(), movie1.getRuntimeInMinutes());
         }

      });
      System.out.println(movies);

      /* Lambda Expression */
      Collections.sort(movies, (movie1, movie2) -> movie2.getTitle().compareTo(movie1.getTitle()));
      System.out.println(movies);

      /* Ausgabe */
      for (Movie m : movies) {
         System.out.println(m);
      }

      /* Local Class */
      class MoviePrinter implements Consumer<Movie> {

         @Override
         public void accept(Movie movie) {
            System.out.println(movie);
         }

      }
      movies.forEach(new MoviePrinter());

      /* Anonymous Class */
      movies.forEach(new Consumer<Movie>() {

         @Override
         public void accept(Movie movie) {
            System.out.println(movie);
         }

      });

      /* Lambda Expression */
      movies.forEach(movie -> System.out.println(movie));

      /* Method Reference */
      movies.forEach(System.out::println);
   }

}

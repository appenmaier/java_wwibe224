package main;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import model.Movie;
import model.Movie.MovieByRatingDescendingComparator;

/**
 * Comparators
 *
 * @author Daniel Appenmaier
 * @version 2.0
 *
 */
public class D29_Comparators {

   public static void main(String[] args) {
      List<Integer> numbers = new ArrayList<>();
      numbers.add(5);
      numbers.add(9);
      numbers.add(2);
      System.out.println(numbers);
      Collections.sort(numbers);
      System.out.println(numbers);

      List<String> names = new ArrayList<>();
      names.add("Hans");
      names.add("Peter");
      names.add("Lisa");
      System.out.println(names);
      Collections.sort(names);
      System.out.println(names);

      List<Movie> movies = new ArrayList<>();
      /*
       * version 1.0: movies.add(new Movie("John Wick 4", List.of(Genre.ACTION, Genre.CRIME,
       * Genre.THRILLER), "2023", 169, 7.8, 241552)); movies.add(new Movie("Disaster Movie",
       * List.of(Genre.COMEDY, Genre.SCIENCE_FICTION), "2008", 87, 2.1, 93334)); movies.add(new
       * Movie("The Super Mario Bros. Movie", List.of(Genre.ANIMATION, Genre.ADVENTURE,
       * Genre.COMEDY), "2023", 92, 7.1, 161146));
       */
      System.out.println(movies);
      Collections.sort(movies);
      System.out.println(movies);
      Collections.sort(movies, new MovieByRatingDescendingComparator());
      System.out.println(movies);
   }

}

package model;

import java.util.ArrayList;
import java.util.List;

import model.Movie.Genre;

/**
 * Movies
 *
 * @author Daniel Appenmaier
 * @version 1.0
 *
 */
public class Movies {

   public static List<Movie> getMovies() throws InvalidValueException {
      List<Movie> movies = new ArrayList<>();

      movies.add(new Movie("John Wick 4",
            List.of(Genre.ACTION, Genre.CRIME, Genre.THRILLER),
            "2023",
            169,
            1,
            -1));

      return movies;
   }

}

package model;

import java.util.Comparator;

/**
 * MovieByRatingDescendingComparator
 *
 * @author Daniel Appenmaier
 * @version 1.0
 *
 */
public class MovieByRatingDescendingComparator implements Comparator<Movie> {

   @Override
   public int compare(Movie movie1, Movie movie2) {
      return Double.compare(movie2.getRating(), movie1.getRating());
   }

}

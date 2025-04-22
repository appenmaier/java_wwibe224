package model;

import java.util.List;
import java.util.Objects;

/**
 * Movie
 *
 * @author Daniel Appenmaier
 * @version 1.0
 *
 */
public class Movie implements Comparable<Movie> {

   private final String title;
   private final List<Genre> genres;
   private final String year;
   private final int runtimeInMinutes;
   private final double rating;
   private final int votes;

   public Movie(String title, List<Genre> genres, String year, int runtimeInMinutes, double rating,
         int votes) throws InvalidValueException {
      if (rating < 0 || rating > 10) {
         throw new InvalidValueException("rating", rating);
      }
      if (runtimeInMinutes <= 0) {
         throw new InvalidValueException("runtimeInMinutes", runtimeInMinutes);
      }
      if (votes < 0) {
         throw new InvalidValueException("votes", votes);
      }

      this.title = title;
      this.genres = genres;
      this.year = year;
      this.runtimeInMinutes = runtimeInMinutes;
      this.rating = rating;
      this.votes = votes;
   }

   public String getTitle() {
      return title;
   }

   public List<Genre> getGenres() {
      return genres;
   }

   public String getYear() {
      return year;
   }

   public int getRuntimeInMinutes() {
      return runtimeInMinutes;
   }

   public double getRating() {
      return rating;
   }

   public int getVotes() {
      return votes;
   }

   @Override
   public String toString() {
      return "Movie [title=" + title + ", genres=" + genres + ", year=" + year
            + ", runtimeInMinutes=" + runtimeInMinutes + ", rating=" + rating + ", votes=" + votes
            + "]";
   }

   @Override
   public int hashCode() {
      return Objects.hash(genres, rating, runtimeInMinutes, title, votes, year);
   }

   @Override
   public boolean equals(Object obj) {
      if (this == obj) {
         return true;
      }
      if (obj == null) {
         return false;
      }
      if (getClass() != obj.getClass()) {
         return false;
      }
      Movie other = (Movie) obj;
      return Objects.equals(genres, other.genres)
            && Double.doubleToLongBits(rating) == Double.doubleToLongBits(other.rating)
            && runtimeInMinutes == other.runtimeInMinutes && Objects.equals(title, other.title)
            && votes == other.votes && Objects.equals(year, other.year);
   }

   @Override
   public int compareTo(Movie otherMovie) {
      return title.compareTo(otherMovie.title);
   }

}

package main;

import java.io.FileNotFoundException;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Optional;
import java.util.OptionalDouble;
import java.util.stream.Collectors;

import model.InvalidValueException;
import model.Movie;
import model.Movie.Genre;
import model.Movies;

/**
 * Java Stream API
 *
 * @author Daniel Appenmaier
 * @version 1.0
 *
 */
public class D37_JavaStreamApi {

   private static List<Movie> movies;

   public static void main(String[] args) throws FileNotFoundException, InvalidValueException {
      movies = Movies.getMovies(50, 100_000);
      movies.forEach(System.out::println);
      System.out.println();

      /* filter, map, forEach */
      printAllThrillersWithRatingGE7();
      System.out.println();

      /* mapToDouble/maptoInt/mapToLong, average/sum */
      getAverageRatingOfAllMovies().ifPresent(System.out::println);
      System.out.println();

      /* filter, sorted, limit/skip, toList */
      getTop5HorrorMovies().forEach(System.out::println);
      System.out.println();

      /* max/min/count */
      getLongestMovie().ifPresent(System.out::println);
      System.out.println();

      /* filter, findAny/findFirst */
      printDrama();
      System.out.println();

      /* anyMatch/allMatch/noneMatch */
      System.out.println(isThereAHorrorMovieAfter1982());
      System.out.println();

      /* map, distinct, sorted */
      getAllYearsAsSortedList().forEach(System.out::println);
      System.out.println();

      /* collect */
      getAllMoviesByYear().forEach((year, movies) -> System.out.println(year + ": " + movies));
      System.out.println();

      /* peek */
      getAllMovieTitlesWithRuntimeInMinutesLT90();
      System.out.println();

      /* Java Stream API bei Maps */
      Map<String, List<Movie>> allMoviesByYear = getAllMoviesByYear();

      OptionalDouble averageYear =
            allMoviesByYear.keySet().stream().mapToInt(year -> Integer.valueOf(year)).average();
      averageYear.ifPresent(System.out::println);

      long numberOfYears =
            allMoviesByYear.values().stream().filter(movies -> movies.size() > 2).count();
      System.out.println(numberOfYears);

      allMoviesByYear.entrySet()
            .stream()
            .filter(entry -> entry.getValue().size() > 2)
            .map(Entry::getKey) // .map(entry -> entry.getKey())
            .forEach(System.out::println);
   }

   private static List<String> getAllMovieTitlesWithRuntimeInMinutesLT90() {
      List<String> movieTitlesWithRuntimeInMinutesLT90 = null;

      movieTitlesWithRuntimeInMinutesLT90 = movies.stream()
            .peek(System.out::println)
            .filter(m -> m.getRuntimeInMinutes() < 90)
            .peek(System.out::println)
            .map(Movie::getTitle)
            .peek(System.out::println)
            .toList();

      return movieTitlesWithRuntimeInMinutesLT90;
   }

   private static Map<String, List<Movie>> getAllMoviesByYear() {
      System.out.println("Alle Filme gruppiert nach Jahr:");

      Map<String, List<Movie>> moviesByYear = null;
      moviesByYear = movies.stream().collect(Collectors.groupingBy(Movie::getYear));

      return moviesByYear;
   }

   private static List<String> getAllYearsAsSortedList() {
      System.out.print("Alle Jahre absteigend sortiert: ");

      List<String> years = null;

      years = movies.stream()
            .map(Movie::getYear) // .map(movie -> movie.getYear())
            .sorted()
            .distinct()
            .toList()
            .reversed();

      return years;
   }

   private static boolean isThereAHorrorMovieAfter1982() {
      System.out.print("Gibt es einen Horrorfilm nach 1982?: ");

      boolean exists = false;
      exists = movies.stream()
            .anyMatch(movie -> movie.getGenres().contains(Genre.HORROR)
                  && movie.getYear().compareTo("1982") > 0);

      return exists;
   }

   private static void printDrama() {
      System.out.print("Ein Drama: ");

      Optional<Movie> drama = null;
      drama = movies.stream().filter(m -> m.getGenres().contains(Genre.DRAMA)).findAny();

      /* Variante A */
      drama.ifPresentOrElse(System.out::println, () -> System.out.println("Es gibt kein Drama"));

      /* Variante B */
      if (drama.isPresent()) {
         System.out.println(drama.get());
      } else {
         System.out.println("Es gibt kein Drama");
      }
   }

   private static Optional<Movie> getLongestMovie() {
      System.out.print("Der längste Film: ");

      Optional<Movie> longestMovie = null;
      longestMovie = movies.stream()
            .max((movie1, movie2) -> Integer.compare(movie1.getRuntimeInMinutes(),
                  movie2.getRuntimeInMinutes()));

      return longestMovie;
   }

   private static List<Movie> getTop5HorrorMovies() {
      System.out.println("Die 5 bestbewerteten Horror-Filme:");

      List<Movie> horrorMovies = null;
      horrorMovies = movies.stream()
            .filter(m -> m.getGenres().contains(Genre.HORROR))
            .sorted((movie1, movie2) -> Double.compare(movie2.getRating(), movie1.getRating()))
            .limit(5)
            .toList();

      return horrorMovies;
   }

   private static OptionalDouble getAverageRatingOfAllMovies() {
      System.out.print("Die Durchschnittsbewertung aller Filme: ");

      OptionalDouble averageRating = null;
      averageRating = movies.stream()
            .mapToDouble(Movie::getRating) // .mapToDouble(m -> m.getRating())
            .average();
      return averageRating;
   }

   private static void printAllThrillersWithRatingGE7() {
      System.out
            .println("Alle Thriller mit einer Bewertung von min. 7 in der Form [Titel] ([Jahr]):");

      movies.stream()
            .filter(movie -> movie.getGenres().contains(Genre.THRILLER))
            .filter(movie -> movie.getRating() >= 7)
            .map(movie -> movie.getTitle() + " (" + movie.getYear() + ")")
            .forEach(System.out::println); // .forEach(text -> System.out.println(text));
   }

}

package main;

import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

import model.FlashLight;
import model.Genre;
import model.InvalidValueException;
import model.Light;
import model.Movie;
import model.TableLight;

/**
 * Exceptions
 *
 * @author Daniel Appenmaier
 * @version 1.0
 *
 */
public class D30_Exceptions {

   @SuppressWarnings("resource")
   public static void main(String[] args) {
      String[] names = {"Hans", "Peter", null};

      /* ArrayIndexOutOfBoundsException */
      try {
         System.out.println(names[3]);
      } catch (ArrayIndexOutOfBoundsException e) {
         e.printStackTrace();
      }

      /* NullPointerException */
      try {
         String name = names[2];
         System.out.println(name.toUpperCase());
      } catch (NullPointerException e) {
         System.out.println("Null Pointer Exception");
      }

      /* InputMismatchException */
      try {
         Scanner scanner = new Scanner(System.in);
         System.out.print("Kommazahl: ");
         double d1 = scanner.nextDouble();
         System.out.println(d1);
      } catch (InputMismatchException e) {
         System.out.println("Kommazahl!");
      }

      /* ClassCastException */
      try {
         Light light = new TableLight();
         FlashLight flashLight = (FlashLight) light;
         System.out.println(flashLight);
      } catch (ClassCastException e) {
         System.out.println(e.getMessage());
      }

      /* InvalidRatingException */
      try {
         Movie movie = new Movie("John Wick 4",
               List.of(Genre.ACTION, Genre.CRIME, Genre.THRILLER),
               "2023",
               169,
               1,
               -1);
         System.out.println(movie);
      } catch (InvalidValueException e) {
         System.err.println(e.getMessage());
      } catch (NullPointerException | ArrayIndexOutOfBoundsException e) {
         e.printStackTrace();
      }
   }

}

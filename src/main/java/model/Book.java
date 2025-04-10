package model;

/**
 * Book
 *
 * @author Daniel Appenmaier
 * @version 1.0
 *
 */
public class Book extends Present {

   private final String title;
   private final String author;

   public Book(String title, String author) {
      this.title = title;
      this.author = author;
   }

   @Override
   public String getDescription() {
      return title + " " + author;
   }

}

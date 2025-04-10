package main;

import model.Book;
import model.SantaClaus;
import model.Toy;

/**
 * Exam Task 4 (Santa Claus)
 *
 * @author Daniel Appenmaier
 * @version 1.0
 *
 */
public class X04_ExamTask04 {

   public static void main(String[] args) {
      SantaClaus santa = new SantaClaus();

      santa.addPresent(new Toy("Elektrische Eisenbahn", 199));
      santa.addPresent(new Book("Stephen King", "Es"));

      santa.wrapAllPresents();

      System.out.println("Spielzeuge: " + santa.getNumberOfToys());
   }

}

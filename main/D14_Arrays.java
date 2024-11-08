package main;

import java.util.Random;

/**
 * Arrays
 *
 * @author Daniel Appenmaier
 * @version 1.0
 *
 */
public class D14_Arrays {

  public static void main(String[] args) {

    Random rd = new Random();

    /* Deklaration und Initialisierung */
    int[] is = new int[100];
    String[] names = {"Hans", "Peter", "Lisa"}; // new String[3]

    /* Zugriff auf Feldelemente */
    System.out.println("Anzahl Namen: " + names.length);
    names[1] = "Max";
    System.out.println(names[names.length - 1]);

    /* Sequentieller Zugriff */
    for (int i = 0; i < is.length; i++) {
      int randomNumber = rd.nextInt(1, 7);
      is[i] = randomNumber;
    }

    for (int i = 0; i < is.length; i++) {
      System.out.println(is[i]);
    }

    for (int i = 0; i < names.length; i++) {
      String name = names[i];
      if (name.length() == 4) {
        System.out.println(names[i]);
      }
    }

  }

}

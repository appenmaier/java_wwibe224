package main;

import model.LightBulb;

/**
 * String toString() and boolean equals(o: Object)
 *
 * @author Daniel Appenmaier
 * @version 1.0
 *
 */
public class D21_ToStringAndEquals {

  public static void main(String[] args) {

    /* Objektvergleich mit boolean equals(o: Object) */

    String string1 = new String("Text");
    String string2 = new String("Text");

    if (string1 == string2) {
      System.out.println("Die beiden Zeichenketten sind identisch");
    } else if (string1.equals(string2)) {
      System.out.println("Die beiden Zeichenketten sind gleich");
    }

    LightBulb lightBulb1 = new LightBulb("rot");
    LightBulb lightBulb2 = new LightBulb("rot");

    if (lightBulb1 == lightBulb2) {
      System.out.println("Die beiden Glühbirnen sind identisch");
    } else if (lightBulb1.equals(lightBulb2)) {
      System.out.println("Die beiden Glühbirnen sind gleich");
    }

    /* Objektumwandlung mit String toString() */
    System.out.println(string1);
    System.out.println(string2);

    System.out.println(lightBulb1);
    System.out.println(lightBulb2);

  }

}

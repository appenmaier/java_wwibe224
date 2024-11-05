package main;

import java.util.Scanner;

/**
 * Loops
 *
 * @author Daniel Appenmaier
 * @version 1.0
 *
 */
public class D13_Loops {

  @SuppressWarnings("resource")
  public static void main(String[] args) {

    /* while-Schleife (kopfgesteuerte Schleife) */
    int i = 1;
    while (i <= 10) {
      System.out.println(i);
      i++;
    }
    System.out.println();

    /* do/while-Schleife (fußfesteuerte Schleife) */
    int x = 1;
    do {
      System.out.println(x);
      x++;
    } while (x <= 10);
    System.out.println();

    /* for-Schleife (Zählschleife) */
    for (int a = 1; a <= 10; a++) {
      System.out.println(a);
    }

    /* Anwendungsbeispiele */
    Scanner myScanner = new Scanner(System.in);

    // do/while
    int number;
    do {
      System.out.print("Gib bitte eine Zahl größer Null ein: ");
      number = myScanner.nextInt();
    } while (number <= 0);
    System.out.println(number);

    // while
    while (true) {
      System.out.print("Gib bitte eine Zahl größer Null ein: ");
      number = myScanner.nextInt();
      if (number > 0) {
        break;
      } else if (number == 0) {
        System.out.println("Knapp daneben");
        continue;
      }
      System.out.println("Das war leider nix");
    }
    System.out.println(number);

    // for
    String name = "Daniel";
    int total = 0;
    for (int j = 0; j < name.length(); j++) {
      total += name.charAt(j);
    }
    System.out.println(total);

  }

}

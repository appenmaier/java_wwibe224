package main;

import java.util.Scanner;

/**
 * Cases
 *
 * @author Daniel Appenmaier
 * @version 1.0
 *
 */
public class D12_Cases {

  @SuppressWarnings("resource")
  public static void main(String[] args) {

    Scanner myScanner = new Scanner(System.in);
    char color;
    System.out.print("Gib bitte \"r/R\", \"g/G\" oder \"b/B\" ein: ");
    color = myScanner.next().charAt(0);

    String colorText;
    if (color == 'r' || color == 'R') {
      colorText = "rot";
    } else if (color == 'g' || color == 'G') {
      colorText = "grün";
    } else if (color == 'b' || color == 'B') {
      colorText = "blau";
    } else {
      colorText = "undefined";
    }
    System.out.println("Deine Farbe ist " + colorText);

    /* klassisches switch/case */
    switch (color) {
      case 'r':
      case 'R':
        colorText = "rot";
        break;
      case 'g':
      case 'G':
        colorText = "grün";
        break;
      case 'b':
      case 'B':
        colorText = "blau";
        break;
      default:
        colorText = "undefined";
        break;
    }
    System.out.println("Deine Farbe ist " + colorText);

    /* switch/case-Ausdrücke */
    colorText = switch (color) {
      case 'r', 'R' -> "rot";
      case 'g', 'G' -> "grün";
      case 'b', 'B' -> "blau";
      default -> "undefined";
    };
    System.out.println("Deine Farbe ist " + colorText);

  }

}

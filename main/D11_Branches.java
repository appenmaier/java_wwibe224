package main;

import java.util.Scanner;

/**
 * Branches
 *
 * @author Daniel Appenmaier
 * @version 1.0
 *
 */
public class D11_Branches {

  @SuppressWarnings("resource")
  public static void main(String[] args) {

    Scanner myScanner = new Scanner(System.in);
    int age;
    System.out.print("Gib bitte Dein Alter ein: ");
    age = myScanner.nextInt();

    /* Vergleichsoperatoren */
    // != (ungleich)
    // == (gleich)
    // > (größer)
    // >= (größergleich)
    // < (kleiner)
    // <= (kleinergleich)

    /* Logische Operatoren */
    // && (logisches UND)
    // || (logisches ODER)
    // ! (logische Verneinung)

    /* Einfachverzweigungen */
    if (age >= 18) {
      System.out.println("Du bist volljährig");
    } else {
      System.out.println("Du bist minderjährig");
    }

    /* Mehrfachverzweigungen */
    if (age < 12) {
      System.out.println("Du bist ein Kind");
    } else if (age < 18) {
      System.out.println("Du bist ein Jugendlicher");
    } else if (age < 65) {
      System.out.println("Du bist ein Erwachsener");
    } else {
      System.out.println("Du bist ein alter Mensch");
    }

    /* Vergleich von Zeichenketten */
    System.out.print("Bitte gib die Zeichenkette \"true\" ein: ");
    String input = myScanner.next();
    if (input.equals("true")) {
      System.out.println("Gut gemacht");
    } else {
      System.out.println("Leider falsch");
    }

    /* Bedingte Zuweisungen */
    String ageText;
    if (age > 18) {
      ageText = "volljährig";
    } else {
      ageText = "minderjährig";
    }
    System.out.println("Du bist " + ageText);

    ageText = (age > 18) ? "volljährig" : "minderjährig";
    System.out.println("Du bist " + ageText);

  }

}

package main;

import java.util.Scanner;

/**
 * Console Inputs
 *
 * @author Daniel Appenmaier
 * @version 1.0
 *
 */
public class D09_ConsoleInputs {

  @SuppressWarnings("resource")
  public static void main(String[] args) {

    /* Scanner initialisieren */
    Scanner myScanner = new Scanner(System.in);

    /* Werte auslesen und zurückgeben */
    System.out.print("Bitte gib eine ganze Zahl ein: ");
    int int1 = myScanner.nextInt();
    System.out.println("int1: " + int1);

    System.out.print("Bitte gib eine reelle Zahl ein: ");
    double double1 = myScanner.nextDouble();
    System.out.println("double1: " + double1);

    System.out.print("Bitte gib einen Wahrheitswert ein: ");
    boolean boolean1 = myScanner.nextBoolean();
    System.out.println("boolean1: " + boolean1);

    System.out.print("Bitte gib genau ein Zeichen ein: ");
    char char1 = myScanner.next().charAt(0);
    System.out.println("char1: " + char1);

    System.out.print("Bitte gib Deinen Vornamen ein: ");
    String firstName = myScanner.next();
    System.out.println("firstName: " + firstName);

    System.out.print("Bitte gib Deinen vollständigen Namen ein: ");
    myScanner.nextLine();
    String fullName = myScanner.nextLine();
    System.out.println("fullName: " + fullName);

  }

}

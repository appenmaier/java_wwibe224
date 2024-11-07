package main;

import java.util.Random;
import java.util.Scanner;

/**
 * Kill Team v1
 *
 * @author Daniel Appenmaier
 * @version 1.0
 *
 */
public class R01_KillTeamV1 {

  @SuppressWarnings({"resource", "unused"})
  public static void main(String[] args) {

    Scanner myScanner = new Scanner(System.in);
    Random myRandom = new Random();

    /* Datenobjekte */
    // Spieler
    String nameOfPlayer1;
    String nameOfPlayer2;

    // Kämpfer
    String nameOfFighter1;
    int healthPointsOfFighter1;
    String nameOfFighter2;
    int healthPointsOfFighter2;

    // Würfel
    int valueOfDice1;
    int valueOfDice2;
    int valueOfDice3;
    int valueOfDice4;
    int valueOfDice5;
    int valueOfDice6;
    int valueOfDice7;
    int valueOfDice8;
    int valueOfDice9;
    int valueOfDice10;

    /* Wertzuweisungen */
    System.out.print("Spieler 1, Name eingeben: ");
    nameOfPlayer1 = myScanner.next();
    System.out.print("Spieler 1, Kämpfer 1, Name eingeben: ");
    nameOfFighter1 = myScanner.next();
    System.out.print("Spieler 1, Kämpfer 1, LP eingeben: ");
    healthPointsOfFighter1 = myScanner.nextInt();
    System.out.println();
    System.out.print("Spieler 2, Name eingeben: ");
    nameOfPlayer2 = myScanner.next();
    System.out.print("Spieler 2, Kämpfer 1, Name eingeben: ");
    nameOfFighter2 = myScanner.next();
    System.out.print("Spieler 2, Kämpfer 1, LP eingeben: ");
    healthPointsOfFighter2 = myScanner.nextInt();

    /* Spielablauf */
    // Zug 1 - Ausgabe
    System.out.println();
    System.out.println("*-------*");
    System.out.println("* Zug 1 *");
    System.out.println("*-------*");
    System.out.println("Kämpfer von " + nameOfPlayer1 + ": " + nameOfFighter1 + " ("
        + healthPointsOfFighter1 + " LP)");
    System.out.println("Kämpfer von " + nameOfPlayer2 + ": " + nameOfFighter2 + " ("
        + healthPointsOfFighter2 + " LP)");
    System.out.println();
    System.out.println(nameOfFighter1 + " greift " + nameOfFighter2 + " an.");

    // Zug 1- Treffer
    valueOfDice1 = myRandom.nextInt(1, 7);
    valueOfDice2 = myRandom.nextInt(1, 7);
    valueOfDice3 = myRandom.nextInt(1, 7);
    valueOfDice4 = myRandom.nextInt(1, 7);
    System.out.println(nameOfFighter1 + " würfelt " + valueOfDice1 + ", " + valueOfDice2 + ", "
        + valueOfDice3 + " und " + valueOfDice4 + ".");
    int totalHits = valueOfDice1 + valueOfDice2 + valueOfDice3 + valueOfDice4;
    System.out.println(nameOfFighter1 + " erzielt " + totalHits + " Treffer.");

    // Zug 1 - Blocks
    valueOfDice5 = myRandom.nextInt(1, 7);
    valueOfDice6 = myRandom.nextInt(1, 7);
    valueOfDice7 = myRandom.nextInt(1, 7);
    int totalBlocks = valueOfDice5 + valueOfDice6 + valueOfDice7;
    System.out.println(nameOfFighter2 + " würfelt " + valueOfDice5 + ", " + valueOfDice6 + " und "
        + valueOfDice7 + ".");
    System.out.println(nameOfFighter2 + " erzielt " + totalBlocks + " Blocks.");

    // Zug 1 - Schaden
    int damage = totalHits - totalBlocks;
    healthPointsOfFighter2 -= damage;
    System.out.println(nameOfFighter2 + " erleidet " + damage + " Schaden und hat noch "
        + healthPointsOfFighter2 + " LP.");
    System.out.println();

    // Zug 2 - Ausgabe
    System.out.println();
    System.out.println("*-------*");
    System.out.println("* Zug 2 *");
    System.out.println("*-------*");
    System.out.println("Kämpfer von " + nameOfPlayer1 + ": " + nameOfFighter1 + " ("
        + healthPointsOfFighter1 + " LP)");
    System.out.println("Kämpfer von " + nameOfPlayer2 + ": " + nameOfFighter2 + " ("
        + healthPointsOfFighter2 + " LP)");
    System.out.println();
    System.out.println(nameOfFighter2 + " greift " + nameOfFighter1 + " an.");

    // Zug 2 - Treffer
    valueOfDice1 = myRandom.nextInt(1, 7);
    valueOfDice2 = myRandom.nextInt(1, 7);
    valueOfDice3 = myRandom.nextInt(1, 7);
    valueOfDice4 = myRandom.nextInt(1, 7);
    System.out.println(nameOfFighter2 + " würfelt " + valueOfDice1 + ", " + valueOfDice2 + ", "
        + valueOfDice3 + " und " + valueOfDice4 + ".");
    totalHits = valueOfDice1 + valueOfDice2 + valueOfDice3 + valueOfDice4;
    System.out.println(nameOfFighter2 + " erzielt " + totalHits + " Treffer.");

    // Zug 2 - Blocks
    valueOfDice5 = myRandom.nextInt(1, 7);
    valueOfDice6 = myRandom.nextInt(1, 7);
    valueOfDice7 = myRandom.nextInt(1, 7);
    totalBlocks = valueOfDice5 + valueOfDice6 + valueOfDice7;
    System.out.println(nameOfFighter1 + " würfelt " + valueOfDice5 + ", " + valueOfDice6 + " und "
        + valueOfDice7 + ".");
    System.out.println(nameOfFighter1 + " erzielt " + totalBlocks + " Blocks.");

    // Zug 2 - Schaden
    damage = totalHits - totalBlocks;
    healthPointsOfFighter1 -= damage;
    System.out.println(nameOfFighter1 + " erleidet " + damage + " Schaden und hat noch "
        + healthPointsOfFighter1 + " LP.");
    System.out.println();

  }

}

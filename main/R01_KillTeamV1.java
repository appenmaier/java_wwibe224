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

  @SuppressWarnings({"resource"})
  public static void main(String[] args) {

    /* Datenobjekte */
    Scanner myScanner = new Scanner(System.in);
    Random myRandom = new Random();

    // Spieler
    String nameOfPlayer1;
    String nameOfPlayer2;

    // Kämpfer
    String nameOfFighter1;
    int healthPointsOfFighter1;
    String nameOfFighter2;
    int healthPointsOfFighter2;

    // Würfel
    int diceValue1;
    int diceValue2;
    int diceValue3;
    int diceValue4;
    int diceValue5;
    int diceValue6;
    int diceValue7;
    int diceValue8;

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
    diceValue1 = myRandom.nextInt(1, 7);
    diceValue2 = myRandom.nextInt(1, 7);
    diceValue3 = myRandom.nextInt(1, 7);
    diceValue4 = myRandom.nextInt(1, 7);
    System.out.println(nameOfFighter1 + " würfelt " + diceValue1 + ", " + diceValue2 + ", "
        + diceValue3 + " und " + diceValue4 + ".");
    int totalHits = diceValue1 + diceValue2 + diceValue3 + diceValue4;
    System.out.println(nameOfFighter1 + " erzielt " + totalHits + " Treffer.");

    // Zug 1 - Blocks
    diceValue5 = myRandom.nextInt(1, 7);
    diceValue6 = myRandom.nextInt(1, 7);
    diceValue7 = myRandom.nextInt(1, 7);
    int totalBlocks = diceValue5 + diceValue6 + diceValue7;
    System.out.println(nameOfFighter2 + " würfelt " + diceValue5 + ", " + diceValue6 + " und "
        + diceValue7 + ".");
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
    diceValue5 = myRandom.nextInt(1, 7);
    diceValue6 = myRandom.nextInt(1, 7);
    diceValue7 = myRandom.nextInt(1, 7);
    diceValue8 = myRandom.nextInt(1, 7);
    System.out.println(nameOfFighter2 + " würfelt " + diceValue5 + ", " + diceValue6 + ", "
        + diceValue7 + " und " + diceValue8 + ".");
    totalHits = diceValue5 + diceValue6 + diceValue7 + diceValue8;
    System.out.println(nameOfFighter2 + " erzielt " + totalHits + " Treffer.");

    // Zug 2 - Blocks
    diceValue1 = myRandom.nextInt(1, 7);
    diceValue2 = myRandom.nextInt(1, 7);
    diceValue3 = myRandom.nextInt(1, 7);
    totalBlocks = diceValue1 + diceValue2 + diceValue3;
    System.out.println(nameOfFighter1 + " würfelt " + diceValue1 + ", " + diceValue2 + " und "
        + diceValue3 + ".");
    System.out.println(nameOfFighter1 + " erzielt " + totalBlocks + " Blocks.");

    // Zug 2 - Schaden
    damage = totalHits - totalBlocks;
    healthPointsOfFighter1 -= damage;
    System.out.println(nameOfFighter1 + " erleidet " + damage + " Schaden und hat noch "
        + healthPointsOfFighter1 + " LP.");
    System.out.println();

  }

}

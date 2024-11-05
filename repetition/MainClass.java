package repetition;

import java.util.Random;
import java.util.Scanner;

public class MainClass {

  public static void main(String[] args) {

    /* Datenobjekte */
    // Spieler
    String nameOfPlayer1;
    String nameOfPlayer2;

    // Kämpfer
    String nameOfFighter1;
    int hpOfFighter1;
    int dvOfFighter1;
    String nameOfFighter2;
    int hpOfFighter2;
    int dvOfFighter2;

    // Waffen
    String nameOfWeapon1;
    int avOfWeapon1;
    String nameOfWeapon2;
    int avOfWeapon2;

    // Würfel
    Random myRandom = new Random();
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
    Scanner myScanner = new Scanner(System.in);

    System.out.print("Spieler 1, Name: ");
    nameOfPlayer1 = myScanner.next();
    System.out.print("Spieler 1, Kämpfer 1, Name: ");
    nameOfFighter1 = myScanner.next();
    System.out.print("Spieler 1, Kämpfer 1, LP: ");
    hpOfFighter1 = myScanner.nextInt();
    System.out.print("Spieler 1, Kämpfer 1, VW: ");
    dvOfFighter1 = myScanner.nextInt();
    System.out.print("Spieler 1, Kämpfer 1, Waffe 1, Name: ");
    nameOfWeapon1 = myScanner.next();
    System.out.print("Spieler 1, Kämpfer 1, Waffe 1, AW: ");
    avOfWeapon1 = myScanner.nextInt();

    System.out.print("Spieler 2, Name: ");
    nameOfPlayer2 = myScanner.next();
    System.out.print("Spieler 2, Kämpfer 1, Name: ");
    nameOfFighter2 = myScanner.next();
    System.out.print("Spieler 2, Kämpfer 1, LP: ");
    hpOfFighter2 = myScanner.nextInt();
    System.out.print("Spieler 2, Kämpfer 1, VW: ");
    dvOfFighter2 = myScanner.nextInt();
    System.out.print("Spieler 2, Kämpfer 1, Waffe 1, Name: ");
    nameOfWeapon2 = myScanner.next();
    System.out.print("Spieler 2, Kämpfer 1, Waffe 1, AW: ");
    avOfWeapon2 = myScanner.nextInt();

    /* Spiel */
    System.out.println();
    System.out.println("Runde 1, Zug 1");
    System.out.println(nameOfFighter1 + ": " + hpOfFighter1 + " LP");
    System.out.println(nameOfFighter2 + ": " + hpOfFighter2 + " LP");
    System.out.println();
    valueOfDice1 = myRandom.nextInt(1, 7);
    valueOfDice2 = myRandom.nextInt(1, 7);
    valueOfDice3 = myRandom.nextInt(1, 7);
    valueOfDice4 = myRandom.nextInt(1, 7);
    System.out.println(nameOfFighter1 + " würfelt " + valueOfDice1 + ", " + valueOfDice2 + ", "
        + valueOfDice3 + " und " + valueOfDice4);
    int total1 = valueOfDice1 + valueOfDice2 + valueOfDice3 + valueOfDice4;
    System.out.println(nameOfFighter1 + " erzielt " + total1 + " Treffer");
    valueOfDice5 = myRandom.nextInt(1, 7);
    valueOfDice6 = myRandom.nextInt(1, 7);
    valueOfDice7 = myRandom.nextInt(1, 7);
    int total2 = valueOfDice5 + valueOfDice6 + valueOfDice7;
    System.out.println(
        nameOfFighter2 + " würfelt " + valueOfDice5 + ", " + valueOfDice6 + " und " + valueOfDice7);
    System.out.println(nameOfFighter2 + " erzielt " + total2 + " Blocks");
    int damage = total1 - total2;
    hpOfFighter2 -= damage;
    System.out.println(
        nameOfFighter2 + " erleidet " + damage + " Schaden und hat noch " + hpOfFighter2 + " LP");
    System.out.println();

    System.out.println("Runde 1, Zug 2");
    System.out.println(nameOfFighter1 + ": " + hpOfFighter1 + " LP");
    System.out.println(nameOfFighter2 + ": " + hpOfFighter2 + " LP");
    System.out.println();
    valueOfDice1 = myRandom.nextInt(1, 7);
    valueOfDice2 = myRandom.nextInt(1, 7);
    valueOfDice3 = myRandom.nextInt(1, 7);
    valueOfDice4 = myRandom.nextInt(1, 7);
    System.out.println(nameOfFighter2 + " würfelt " + valueOfDice1 + ", " + valueOfDice2 + ", "
        + valueOfDice3 + " und " + valueOfDice4);
    total1 = valueOfDice1 + valueOfDice2 + valueOfDice3 + valueOfDice4;
    System.out.println(nameOfFighter2 + " erzielt " + total1 + " Treffer");
    valueOfDice5 = myRandom.nextInt(1, 7);
    valueOfDice6 = myRandom.nextInt(1, 7);
    valueOfDice7 = myRandom.nextInt(1, 7);
    total2 = valueOfDice5 + valueOfDice6 + valueOfDice7;
    System.out.println(
        nameOfFighter1 + " würfelt " + valueOfDice5 + ", " + valueOfDice6 + " und " + valueOfDice7);
    System.out.println(nameOfFighter1 + " erzielt " + total2 + " Blocks");
    damage = total1 - total2;
    hpOfFighter1 -= damage;
    System.out.println(
        nameOfFighter1 + " erleidet " + damage + " Schaden und hat noch " + hpOfFighter1 + " LP");
    System.out.println();

  }

}

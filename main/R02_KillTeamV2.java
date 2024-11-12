package main;

import java.util.Random;

/**
 * Kill Team v2
 *
 * @author Daniel Appenmaier
 * @version 1.0
 *
 */
public class R02_KillTeamV2 {

  public static void main(String[] args) {

    int round = 0;
    Random myRandom = new Random();

    /* Datenobjekte */
    // Spieler
    String nameOfPlayer1 = "Hans";
    String nameOfPlayer2 = "Peter";

    // Kämpfer
    String nameOfFighter1 = "Gregor";
    int healthPointsOfFighter1 = 8;
    int defenseValueOfFighter1 = 3;
    int armorRollOfFighter1 = 5;
    String nameOfFighter2 = "Bonekraka";
    int healthPointsOfFighter2 = 10;
    int defenseValueOfFighter2 = 3;
    int armorRollOfFighter2 = 5;

    // Waffen
    String nameOfWeapon1 = "Boltpistole";
    int attackValueOfWeapon1 = 4;
    int skillOfWeapon1 = 3;
    int damageValueOfWeapon1 = 2;
    String nameOfWeapon2 = "Spalta";
    int attackValueOfWeapon2 = 4;
    int skillOfWeapon2 = 4;
    int damageValueOfWeapon2 = 3;

    // Würfel
    int[] diceValuesOfPlayer1 = new int[5];
    int[] diceValuesOfPlayer2 = new int[5];

    /* Spielablauf */
    while (healthPointsOfFighter1 > 0 && healthPointsOfFighter2 > 0) {
      round++;

      // Zug 1 - Ausgabe
      System.out.println("*----------------*");
      System.out.println("* Runde " + round + ", Zug 1 *");
      System.out.println("*----------------*");
      System.out.println("Kämpfer von " + nameOfPlayer1 + ": " + nameOfFighter1 + " ("
          + healthPointsOfFighter1 + " LP)");
      System.out.println("Kämpfer von " + nameOfPlayer2 + ": " + nameOfFighter2 + " ("
          + healthPointsOfFighter2 + " LP)");
      System.out.println();
      System.out
          .println(nameOfFighter1 + " greift " + nameOfFighter2 + " mit " + nameOfWeapon1 + " an.");

      // Zug 1 - Treffer
      int totalHits = 0;
      String output = nameOfFighter1 + " würfelt ";
      for (int i = 0; i < attackValueOfWeapon1; i++) {
        diceValuesOfPlayer1[i] = myRandom.nextInt(1, 7);
        output += diceValuesOfPlayer1[i] + ", ";
        if (diceValuesOfPlayer1[i] >= skillOfWeapon1) {
          totalHits++;
        }
      }

      System.out.println(output);
      System.out.println(nameOfFighter1 + " erzielt " + totalHits + " Treffer.");

      // Zug 1 - Blocks
      int totalBlocks = 0;

      output = nameOfFighter2 + " würfelt ";
      for (int i = 0; i < defenseValueOfFighter2; i++) {
        diceValuesOfPlayer2[i] = myRandom.nextInt(1, 7);
        output += diceValuesOfPlayer2[i] + ", ";
        if (diceValuesOfPlayer2[i] >= armorRollOfFighter2) {
          totalBlocks++;
        }
      }

      System.out.println(output);
      System.out.println(nameOfFighter2 + " erzielt " + totalBlocks + " Blocks.");

      // Zug 1 - Schaden
      if (totalHits > totalBlocks) {
        int damage = (totalHits - totalBlocks) * damageValueOfWeapon1;
        if (damage >= healthPointsOfFighter2) {
          healthPointsOfFighter2 = 0;
          System.out.println(nameOfFighter2 + " erleidet " + damage + " Schaden und stirbt.");
        } else {
          healthPointsOfFighter2 -= damage;
          System.out.println(nameOfFighter2 + " erleidet " + damage + " Schaden und hat noch "
              + healthPointsOfFighter2 + " LP.");
        }
      }
      System.out.println();

      // Zug 2 - Prüfung
      if (healthPointsOfFighter2 == 0) {
        continue;
      }

      // Zug 2 - Ausgabe
      System.out.println("*----------------*");
      System.out.println("* Runde " + round + ", Zug 2 *");
      System.out.println("*----------------*");
      System.out.println("Kämpfer von " + nameOfPlayer2 + ": " + nameOfFighter2 + " ("
          + healthPointsOfFighter2 + " LP)");
      System.out.println("Kämpfer von " + nameOfPlayer1 + ": " + nameOfFighter1 + " ("
          + healthPointsOfFighter1 + " LP)");
      System.out.println();
      System.out
          .println(nameOfFighter2 + " greift " + nameOfFighter1 + " mit " + nameOfWeapon2 + " an.");

      // Zug 2 - Treffer
      totalHits = 0;
      output = nameOfFighter2 + " würfelt ";
      for (int i = 0; i < attackValueOfWeapon2; i++) {
        diceValuesOfPlayer2[i] = myRandom.nextInt(1, 7);
        output += diceValuesOfPlayer2[i] + ", ";
        if (diceValuesOfPlayer2[i] >= skillOfWeapon2) {
          totalHits++;
        }
      }

      System.out.println(output);
      System.out.println(nameOfFighter2 + " erzielt " + totalHits + " Treffer.");

      // Zug 2 - Blocks
      totalBlocks = 0;

      output = nameOfFighter1 + " würfelt ";
      for (int i = 0; i < defenseValueOfFighter1; i++) {
        diceValuesOfPlayer1[i] = myRandom.nextInt(1, 7);
        output += diceValuesOfPlayer1[i] + ", ";
        if (diceValuesOfPlayer1[i] >= armorRollOfFighter1) {
          totalBlocks++;
        }
      }

      System.out.println(output);
      System.out.println(nameOfFighter1 + " erzielt " + totalBlocks + " Blocks.");

      // Zug 2 - Schaden
      if (totalHits > totalBlocks) {
        int damage = (totalHits - totalBlocks) * damageValueOfWeapon2;
        if (damage >= healthPointsOfFighter1) {
          healthPointsOfFighter1 = 0;
          System.out.println(nameOfFighter1 + " erleidet " + damage + " Schaden und stirbt.");
        } else {
          healthPointsOfFighter1 -= damage;
          System.out.println(nameOfFighter1 + " erleidet " + damage + " Schaden und hat noch "
              + healthPointsOfFighter1 + " LP.");
        }
      }
      System.out.println();
    }

  }

}

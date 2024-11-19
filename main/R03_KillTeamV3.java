package main;

import java.util.Random;
import model.Fighter;
import model.Player;
import model.Weapon;

/**
 * Kill Team v3
 *
 * @author Daniel Appenmaier
 * @version 1.0
 *
 */
public class R03_KillTeamV3 {

  public static void main(String[] args) {

    /* Datenobjekte */
    int round = 0;
    Random random = new Random();

    // Waffen
    Weapon weapon1 = new Weapon("Boltpistole", 4, 3, 2);
    Weapon weapon2 = new Weapon("Spalta", 4, 4, 3);

    // Kämpfer
    Fighter fighter1 = new Fighter("Gregor", 8, 3, 5, weapon1);
    Fighter fighter2 = new Fighter("Bonekraka", 10, 3, 5, weapon2);

    // Spieler
    Player player1 = new Player("Hans", fighter1);
    Player player2 = new Player("Peter", fighter2);

    /* Spielablauf */
    while (player1.getFighter().getHealthPoints() > 0
        && player2.getFighter().getHealthPoints() > 0) {
      round++;

      if (random.nextBoolean()) {
        // "Kopf" (Spieler 1 beginnt)
        round(round, player1, player2);
      } else {
        // "Zahl" (Spieler 2 beginnt)
        round(round, player2, player1);
      }

    }

  }

  public static void move(int round, int move, Player attacker, Player defender) {
    // Ausgabe
    System.out.println("*----------------*");
    System.out.println("* Runde " + round + ", Zug " + move + " *");
    System.out.println("*----------------*");
    System.out.println("Kämpfer von " + attacker.getName() + ": " + attacker.getFighter().getName()
        + " (" + attacker.getFighter().getHealthPoints() + " LP)");
    System.out.println("Kämpfer von " + defender.getName() + ": " + defender.getFighter().getName()
        + " (" + defender.getFighter().getHealthPoints() + " LP)");
    System.out.println();
    System.out
        .println(attacker.getFighter().getName() + " greift " + defender.getFighter().getName()
            + " mit " + attacker.getFighter().getWeapon().getName() + " an.");

    // Treffer
    int totalHits = 0;
    String output = attacker.getFighter().getName() + " würfelt ";

    int[] values = attacker.rollTheDices(attacker.getFighter().getWeapon().getAttackValue());
    for (int i = 0; i < values.length; i++) {
      if (i == attacker.getFighter().getWeapon().getAttackValue() - 2) {
        output += values[i] + " und ";
      } else if (i == attacker.getFighter().getWeapon().getAttackValue() - 1) {
        output += values[i] + ".";
      } else {
        output += values[i] + ", ";
      }
      if (values[i] >= attacker.getFighter().getWeapon().getSkill()) {
        totalHits++;
      }
    }

    System.out.println(output);
    System.out.println(attacker.getFighter().getName() + " erzielt " + totalHits + " Treffer.");

    // Blocks
    int totalBlocks = 0;
    output = defender.getName() + " würfelt ";

    values = defender.rollTheDices(defender.getFighter().getDefenseValue());
    for (int i = 0; i < values.length; i++) {
      if (i == defender.getFighter().getDefenseValue() - 2) {
        output += values[i] + " und ";
      } else if (i == defender.getFighter().getDefenseValue() - 1) {
        output += values[i] + ".";
      } else {
        output += values[i] + ", ";
      }
      if (values[i] >= defender.getFighter().getArmorRoll()) {
        totalBlocks++;
      }
    }

    System.out.println(output);
    System.out.println(defender.getFighter().getName() + " erzielt " + totalBlocks + " Blocks.");

    // Schaden
    if (totalHits > totalBlocks) {
      int damage = (totalHits - totalBlocks) * attacker.getFighter().getWeapon().getDamageValue();
      defender.getFighter().reduceHealthPointsByValue(damage);

      if (defender.getFighter().getHealthPoints() <= 0) {
        System.out.println(
            defender.getFighter().getName() + " erleidet " + damage + " Schaden und stirbt.");
      } else {
        System.out.println(defender.getFighter().getName() + " erleidet " + damage
            + " Schaden und hat noch " + defender.getFighter().getHealthPoints() + " LP.");
      }
    }
    System.out.println();
  }

  public static void round(int round, Player playerA, Player playerB) {
    // Zug 1
    move(round, 1, playerA, playerB);

    // Zug 2
    if (playerB.getFighter().getHealthPoints() == 0) {
      return;
    }
    move(round, 2, playerB, playerA);
  }

}

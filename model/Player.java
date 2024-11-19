package model;

/**
 * Player
 *
 * @author Daniel Appenmaier
 * @version 1.0
 *
 */
public class Player {

  private final String name;
  private final Fighter fighter;
  private final D6Dice[] dices;

  public Player(String name, Fighter fighter) {
    this.name = name;
    this.fighter = fighter;
    dices = new D6Dice[5];
    for (int i = 0; i < dices.length; i++) {
      dices[i] = new D6Dice();
    }
  }

  public Fighter getFighter() {
    return fighter;
  }

  public String getName() {
    return name;
  }

  public int[] rollTheDices(int numberOfDices) {
    int[] values = new int[numberOfDices];
    for (int i = 0; i < values.length; i++) {
      D6Dice dice = dices[i];
      dice.rollTheDice();
      values[i] = dice.getValue();
    }
    return values;
  }

}

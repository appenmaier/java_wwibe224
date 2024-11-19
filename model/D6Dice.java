package model;

import java.util.Random;

/**
 * D6 Dice
 *
 * @author Daniel Appenmaier
 * @version 1.0
 *
 */
public class D6Dice {

  private int value;

  public D6Dice() {
    value = 6;
  }

  public int getValue() {
    return value;
  }

  public void rollTheDice() {
    Random random = new Random();
    value = random.nextInt(1, 7);
  }

}

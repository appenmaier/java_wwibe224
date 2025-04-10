package model;

import java.util.Random;

/**
 * Dice
 *
 * @author Daniel Appenmaier
 * @version 1.0
 *
 */
public class Dice {

   private Color color;
   private int value;

   public Dice() {
      rollTheDice();
   }

   public void rollTheDice() {
      Random random = new Random();

      int randomNumber = random.nextInt(1, 4);
      color = switch (randomNumber) {
         case 1  -> Color.RED;
         case 2  -> Color.GREEN;
         default -> Color.BLUE;
      };
      value = random.nextInt(1, 5);
   }

   public Color getColor() {
      return color;
   }

   public int getValue() {
      return value;
   }

}

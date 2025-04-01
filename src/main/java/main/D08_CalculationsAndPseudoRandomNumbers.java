package main;

import java.util.Random;

/**
 * Calculations and Pseudo Random Numbers
 *
 * @author Daniel Appenmaier
 * @version 1.0
 *
 */
public class D08_CalculationsAndPseudoRandomNumbers {

   public static void main(String[] args) {
      /* Mathematische Berechnungen */
      double result = Math.sqrt(64);
      System.out.println("result: " + result);

      /* Pseudozufallszahlen */
      int randomNumber;

      randomNumber = (int) (Math.random() * 100) + 1;
      System.out.println("randomNumber: " + randomNumber);

      Random myRandom = new Random();
      randomNumber = myRandom.nextInt(1, 101);
      System.out.println("randomNumber: " + randomNumber);
   }

}

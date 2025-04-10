package main;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import model.Color;
import model.Dice;

/**
 * Exam Task 03 (Dice Game)
 *
 * @author Daniel Appenmaier
 * @version 1.0
 *
 */
public class X03_ExamTask03 {

   private static List<Dice> dices;
   private static int currentPoints;
   private static int winningPoints;
   private static int round;
   private static Scanner scanner;

   public static void main(String[] args) {
      dices = new ArrayList<>();
      for (int i = 0; i < 5; i++) {
         dices.add(new Dice());
      }

      scanner = new Scanner(System.in);

      System.out.print("Gewinnpunkte: ");
      winningPoints = scanner.nextInt();

      while (currentPoints < winningPoints) {
         round++;
         System.out.print("Farbe: ");
         String color = scanner.next();

         int red = 0;
         int green = 0;
         int blue = 0;

         for (Dice d : dices) {
            d.rollTheDice();
            if (d.getColor().equals(Color.RED)) {
               red += d.getValue();
            } else if (d.getColor().equals(Color.GREEN)) {
               green += d.getValue();
            } else {
               blue += d.getValue();
            }
         }
         System.out.println("Rot: " + red);
         System.out.println("Grün: " + green);
         System.out.println("Blau: " + blue);

         if (color.equals("Rot") && red >= green && red >= blue) {
            System.out.println("Richtig");
            currentPoints++;
         } else if (color.equals("Grün") && green >= red && green >= blue) {
            System.out.println("Richtig");
            currentPoints++;
         } else if (color.equals("Blau") && blue >= red && blue >= green) {
            System.out.println("Richtig");
            currentPoints++;
         } else {
            System.out.println("Falsch");
         }
      }

      System.out.println("Runden: " + round);
   }

}

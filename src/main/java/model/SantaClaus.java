package model;

import java.util.ArrayList;
import java.util.List;

/**
 * Santa Claus
 *
 * @author Daniel Appenmaier
 * @version 1.0
 *
 */
public class SantaClaus {

   private final List<Present> presents;

   public SantaClaus() {
      presents = new ArrayList<>();
   }

   public void addPresent(Present present) {
      presents.add(present);
   }

   public void wrapAllPresents() {
      for (Present p : presents) {
         p.wrap();
      }
   }

   public int getNumberOfToys() {
      int total = 0;

      for (Present p : presents) {
         if (p instanceof Toy) {
            total++;
         }
      }

      return total;
   }

}

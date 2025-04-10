package model;

/**
 * Toy
 *
 * @author Daniel Appenmaier
 * @version 1.0
 *
 */
public class Toy extends Present {

   private final String description;
   private final double priceInEuro;

   public Toy(String description, double priceInEuro) {
      this.description = description;
      this.priceInEuro = priceInEuro;
   }

   @Override
   public String getDescription() {
      return description;
   }

   public double getPriceInEuro() {
      return priceInEuro;
   }

}

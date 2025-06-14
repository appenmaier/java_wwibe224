package model;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Optional;
import java.util.OptionalDouble;

public record Shop<T extends Comparable<T>>(String name, Map<T, List<Integer>> assortment) { // 1,5

   public void addProduct(T product) {
      // 0,5
      /* Variante A */
      // if (!assortment.containsKey(product)) { // 1
      // assortment.put(product, new ArrayList<>()); // 1
      // }

      /* Variante B */
      assortment.putIfAbsent(product, new ArrayList<>()); // 2
   } // 2,5

   public void rateProduct(T product, int rating)
         throws NoProductFoundException, InvalidRatingException { // 1,5
      if (!assortment.containsKey(product)) { // 1
         throw new NoProductFoundException(); // 1
      }

      if (rating < 1 || rating > 5) { // 1
         throw new InvalidRatingException(rating); // 1
      }

      List<Integer> ratings = assortment.get(product); // 0,5
      ratings.add(rating); // 0,5
   } // 6,5

   public Optional<T> getBestRatedProduct() {
      // 0,5
      /* Variante A */
      // T bestRatedProduct = null; // 0,5
      // double bestRating = 0; // 0,5
      // for (Entry<T, List<Integer>> entry : assortment.entrySet()) { // 1
      // T product = entry.getKey(); // 0,5
      // List<Integer> ratings = entry.getValue(); // 0,5
      // double total = 0; // 0,5
      // for (Integer rating : ratings) { // 1
      // total += rating; // 0,5
      // }
      // double averageRating = total / ratings.size(); // 1
      // if (averageRating >= bestRating) { // 1
      // bestRating = averageRating; // 0,5
      // bestRatedProduct = product; // 0,5
      // }
      // }
      //
      // return Optional.ofNullable(bestRatedProduct); // 1

      /* Variante B */
      // Optional<T> bestRatedProduct = null;
      // double bestRating = 0;
      // for (Entry<T, List<Integer>> entry : assortment.entrySet()) {
      // T product = entry.getKey();
      // List<Integer> ratings = entry.getValue();
      // double total = 0;
      // for (Integer rating : ratings) {
      // total += rating;
      // }
      // double averageRating = total / ratings.size();
      // if (averageRating >= bestRating) {
      // bestRating = averageRating;
      // bestRatedProduct = Optional.of(product);
      // }
      // }
      // if (bestRatedProduct.isPresent()) {
      // return bestRatedProduct;
      // } else {
      // return Optional.empty();
      // }

      /* Variante C */
      // T bestRatedProduct = null; // 0,5
      // double bestRating = 0; // 0,5
      // for (Entry<T, List<Integer>> entry : assortment.entrySet()) { // 1
      // T product = entry.getKey(); // 0,5
      // List<Integer> ratings = entry.getValue(); // 0,5
      //
      // OptionalDouble averageRating = ratings.stream().mapToInt(r -> r).average(); // 2
      //
      // if (averageRating.isPresent() && averageRating.getAsDouble() >= bestRating) { // 1,5
      // bestRating = averageRating.getAsDouble(); // 1
      // bestRatedProduct = product; // 0,5
      // }
      // }
      //
      // return Optional.ofNullable(bestRatedProduct); // 1

      /* Variante D */
      return assortment.entrySet() // 1
            .stream() // 0,5
            .sorted((e1, e2) -> { // 0,5
               OptionalDouble optional1 = e1.getValue().stream().mapToInt(r -> r).average(); // 1,5
               OptionalDouble optional2 = e2.getValue().stream().mapToInt(r -> r).average(); // 1,5
               Double averageRating1 = optional1.isPresent() ? optional1.getAsDouble() : 0; // 1,5
               Double averageRating2 = optional2.isPresent() ? optional2.getAsDouble() : 0; // 1,5
               return averageRating2.compareTo(averageRating1);
            })
            .map(Entry::getKey) // 0,5
            .findFirst(); // 0,5
   } // 9,5

   public List<T> getAllProductsSortedByNaturalOrdering() {
      // 0,5
      /* Variante A */
      // List<T> products = new ArrayList<>(); // 0,5
      // for (T p : assortment.keySet()) { // 1
      // products.add(p); // 0,5
      // }
      // Collections.sort(products); // 1
      // return products; // 0,5

      /* Variante B */
      // List<T> products = new ArrayList<>(assortment.keySet()); // 2
      // Collections.sort(products); // 1
      // return products; // 0,5

      /* Variante C */
      return assortment.keySet().stream().sorted().toList(); // 3,5
   } // 4

} // 24

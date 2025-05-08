package main;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.Random;

/**
 * Optionals
 *
 * @author Daniel Appenmaier
 * @version 1.0
 *
 */
public class D35_Optionals {

   public static void main(String[] args) {
      /* Ohne Optionals */
      String text = getText();
      if (text != null) {
         System.out.println(text.toUpperCase());
      }

      List<String> texts = getTexts();
      System.out.println(texts.size());

      /* Mit Optionals */
      Optional<String> optionalText = getOptionalText();
      // imperative Lösung
      if (optionalText.isPresent()) {
         System.out.println(optionalText.get().toUpperCase());
      } else {
         System.out.println("kein Text vorhanden");
      }
      // funktionale Lösung
      optionalText.ifPresent(t -> System.out.println(t.toUpperCase()));
      optionalText.ifPresentOrElse(t -> System.out.println(t.toUpperCase()),
            () -> System.out.println("kein Text vorhanden"));
   }

   private static String getText() {
      Random random = new Random();
      boolean giveBack = random.nextBoolean();
      if (giveBack) {
         return "Hello World";
      } else {
         return null;
      }
   }

   private static List<String> getTexts() {
      List<String> texts = new ArrayList<>();
      return texts;
   }

   private static Optional<String> getOptionalText() {
      Random random = new Random();
      boolean giveBack = random.nextBoolean();
      if (giveBack) {
         return Optional.of("Ciao World");
      } else {
         return Optional.empty();
      }
   }

}

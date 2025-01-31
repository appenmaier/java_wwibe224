package main;

import java.util.ArrayList;
import java.util.List;

/**
 * Loops
 *
 * @author Daniel Appenmaier
 * @version 1.0
 *
 */
public class P01_Loops {

   private static List<String> names;

   public static String getNameByInitial(char initial) {
      String nameWithInitial = null;
      for (String name : names) {
         if (name.charAt(0) == initial) {
            nameWithInitial = name;
            break;
         }
      }
      return nameWithInitial;
   }

   public static List<String> getShortNames() {
      List<String> shortNames = new ArrayList<>();
      for (String name : names) {
         if (name.length() <= 3) {
            shortNames.add(name);
         }
      }
      return shortNames;
   }

   public static void main(String[] args) {
      names = new ArrayList<>();
      names.add("Max");
      names.add("Peter");
      names.add("Hans");
      names.add("Eva");
      names.add("Hubert");

      System.out.println(getShortNames());
      System.out.println(getNameByInitial('H'));
   }

}

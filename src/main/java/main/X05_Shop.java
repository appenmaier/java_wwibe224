package main;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import model.FastFood;
import model.FastFoodCategory;

/**
 * Shop
 *
 * @author Daniel Appenmaier
 * @version 1.0
 *
 */
public class X05_Shop {

   public static void main(String[] args) {
      List<FastFood> fastFood = new ArrayList<>();

      FastFood fastFood1 = new FastFood("Hamburger", FastFoodCategory.BURGER, 800, false);
      FastFood fastFood2 = new FastFood("Pommes", FastFoodCategory.FRIES, 600, true);
      FastFood fastFood3 = new FastFood("Veggie Burger", FastFoodCategory.BURGER, 500, true);

      fastFood.add(fastFood3);
      fastFood.add(fastFood1);
      fastFood.add(fastFood2);

      fastFood.forEach(System.out::println);
      Collections.sort(fastFood);
      fastFood.forEach(System.out::println);
   }

}

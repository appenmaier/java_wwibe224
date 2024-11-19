package main;

import model.PlugType;

/**
 * Enumerations
 *
 * @author Daniel Appenmaier
 * @version 1.0
 *
 */
public class D24_Enumerations {

  @SuppressWarnings("unused")
  public static void main(String[] args) {

    PlugType typeF = PlugType.TYPE_F;
    PlugType typeB = PlugType.TYPE_B;
    PlugType typeF2 = PlugType.TYPE_F;

    String text = "TYPE_I";
    PlugType typeI = PlugType.valueOf(text);
    System.out.println(typeI.getDescription());

    for (int i = 0; i < PlugType.values().length; i++) {
      System.out.println(PlugType.values()[i]);
    }

  }

}

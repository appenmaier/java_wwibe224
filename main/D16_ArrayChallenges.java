package main;

/**
 * Array Challenges
 *
 * @author Daniel Appenmaier
 * @version 1.0
 *
 */
public class D16_ArrayChallenges {

  public static void main(String[] args) {

    String[] names = new String[5];

    names[1] = "Max";
    names[4] = "Peter";

    int total = 0;
    for (int i = 0; i < names.length; i++) {
      if (names[i] != null) {
        total++;
      }
    }
    System.out.println("Anzahl Namen: " + total);

    names[0] = "Maria";
    // names[2] = "Hans";
    names[3] = "Lisa";
    // names[5] = "Friedrich";
    String[] tmp = new String[8];
    for (int i = 0; i < names.length; i++) {
      tmp[i] = names[i];
    }
    names = tmp;
    names[5] = "Friedrich";

    // names[3] = "Heidi";
    for (int i = names.length - 1; i >= 0; i--) {
      if (i == 3) {
        names[i + 1] = names[i];
        names[3] = "Heidi";
        break;
      }
      if (names[i] != null) {
        names[i + 1] = names[i];
      }
    }
    for (int i = 0; i < names.length; i++) {
      System.out.println(names[i]);
    }

  }

}

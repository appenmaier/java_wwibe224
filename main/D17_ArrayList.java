package main;

import java.util.ArrayList;

/**
 * Array Lists
 *
 * @author Daniel Appenmaier
 * @version 1.0
 *
 */
public class D17_ArrayList {

  public static void main(String[] args) {

    // String[] names = new String[10];
    // for (int i = 0; i < names.length; i++) {
    // if (names[i] == null) {
    // names[i] == "Hans";
    // break;
    // }
    // }

    /* Deklaration */
    ArrayList<String> names = new ArrayList<>();

    /* Elemente anfügen */
    names.add("Hans");
    names.add("Peter");
    names.add("Lisa");

    /* Elemente einfügen */
    names.add(1, "Max");

    /* Element löschen */
    names.remove(2);

    /* Elemente auslesen */
    String firstName = names.get(0);
    System.out.println(firstName);

    /* Anzahl Elemente ausgeben */
    System.out.println(names.size());

    /* Liste ausgeben */
    System.out.println(names);

  }

}

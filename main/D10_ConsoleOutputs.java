package main;

import java.util.Locale;

/**
 * Console Outputs
 *
 * @author Daniel Appenmaier
 * @version 1.0
 *
 */
public class D10_ConsoleOutputs {

  public static void main(String[] args) {

    /* print- und println-Methoden */
    System.out.println("Text 1");
    System.out.print("Text 2");
    System.out.print("Text 3");
    System.out.println("Text 4");
    System.out.println();

    /* printf-Methode */
    // Aufbau einer Formatierungsregel: %[flags][width][.precision] conversion character

    // String-Formatierungen (s)
    String text = "Hallo";
    String name = "Hans-Peter";
    System.out.printf("%s %s%n", text, name);
    System.out.printf("%S %S%n", text, name); // Großbuchstabenkonvertierung
    System.out.printf("%20s %s%n", text, name); // Festlegen der Ausgabenlänge
    System.out.printf("%-20s %s%n", text, name); // linksbündige Ausgabe

    // Dezimalzahlen-Formatierungen (d)
    System.out.println(1_000_000_000);
    System.out.printf("%,d%n", 1_000_000_000); // Festlegen des Tausendertrennzeichens
    System.out.printf(Locale.JAPAN, "%,d%n", 1_000_000_000);

    // Gleitkommazahlen-Formatierungen (f)
    System.out.printf("%.2f%n", 3.817264532); // Festlegen der Genauigkeit

  }

}

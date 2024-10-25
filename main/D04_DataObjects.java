package main;

/**
 * Data Objects
 *
 * @author Daniel Appenmaier
 * @version 1.0
 *
 */
public class D04_DataObjects {

  @SuppressWarnings("unused")
  public static void main(String[] args) {

    /* (Lokale) Variablen / (Lokale) variable Datenobjekte */
    String name = "Maier";
    String firstName = "Hans";
    String familyName = "Maier";
    String fullName = "Hans Maier";

    double sizeInM = 1.8;
    double oldSizeInM = sizeInM;
    sizeInM = 1.78;

    System.out.println("sizeInM: " + sizeInM);
    System.out.println("oldSizeInM: " + oldSizeInM);

    /* fixe Datenobjekte / Konstanten */
    final double PI = 3.14159265359;

  }

}

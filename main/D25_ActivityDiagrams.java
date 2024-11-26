package main;

import java.util.ArrayList;
import model.TableLight;

/**
 * Activity Diagrams
 *
 * @author Daniel Appenmaier
 * @version 1.0
 *
 */
public class D25_ActivityDiagrams {

  public static void main(String[] args) {

    // Erstelle eine Liste mit 5 Tischleuchten
    ArrayList<TableLight> lights = new ArrayList<>();
    for (int i = 0; i < 5; i++) {
      TableLight light = new TableLight();
      lights.add(light);
    }

    // Bringe eine Tischleuchte zum Leuchten
    TableLight light = lights.get(3);
    light.switchOn();
    light.plugIn();

    // Index = 0
    int i = 0;

    // Schleife (Bedingung: Index < Länge der Liste)
    while (i < lights.size()) {
      // Tischleuchte = Tischleuchte zum Index
      light = lights.get(i);
      // Verzweigung (Bedingung: Tischleuchte leuchtet)
      if (light.isShining()) {
        System.out.println(light);
      }
      // Index inkrementieren
      i++;
    }

  }

}

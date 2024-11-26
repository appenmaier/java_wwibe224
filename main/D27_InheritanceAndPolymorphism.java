package main;

import java.util.ArrayList;
import model.FlashLight;
import model.Light;
import model.TableLight;

/**
 * Inheritance and Polymorphism
 *
 * @author Daniel Appenmaier
 * @version 1.0
 *
 */
public class D27_InheritanceAndPolymorphism {

  public static void main(String[] args) {

    ArrayList<Light> lights = new ArrayList<>();

    for (int i = 0; i < 5; i++) {
      TableLight t = new TableLight();
      lights.add(t); // Upcast
      FlashLight f = new FlashLight();
      lights.add(f); // Upcast
    }

    for (Light l : lights) {
      l.switchOn(); // Dynamische Polymorphie
      if (l instanceof TableLight) {
        TableLight t = (TableLight) l; // Downcast
        t.plugIn();
      }
      System.out.println(l.isShining()); // Dynamische Polymorphie
    }

  }

}

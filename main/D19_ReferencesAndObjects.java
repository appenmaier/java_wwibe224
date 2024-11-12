package main;

import model.LightBulb;
import model.TableLight;

/**
 * References and Objects
 *
 * @author Daniel Appenmaier
 * @version 1.0
 *
 */
public class D19_ReferencesAndObjects {

  public static void main(String[] args) {

    int i;
    TableLight light1;

    i = 5;
    light1 = new TableLight();
    LightBulb red = new LightBulb("rot");
    light1.changeLightBulb(red);

    int x;
    TableLight light2;

    x = i;
    light2 = light1;

    i = 3;
    light1.switchOn();
    light1.plugIn();
    System.out.println(light2.isShining());

    x = 0;
    light1 = null;
    // light1.switchOff();

    System.out.println("i: " + i);
    System.out.println("x: " + x);
    System.out.println("light1: " + light1);
    System.out.println("light2: " + light2);

  }

}

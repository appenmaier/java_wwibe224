package main;

import model.LightBulb;
import model.TableLight;

/**
 * Data Encapsulation
 *
 * @author Daniel Appenmaier
 * @version 1.0
 *
 */
public class D20_DataEncapsulation {

  @SuppressWarnings("unused")
  public static void main(String[] args) {

    LightBulb redLightBulb = new LightBulb("rot");
    // redLightBulb.color = "rot";
    // redLightBulb.color = "blau";
    // redLightBulb.setColor("rot");
    // redLightBulb.setColor("blau");
    LightBulb whiteLightBulb = new LightBulb();

    TableLight light1 = new TableLight();
    // light1.isOn = false;
    // light1.lightBulb = redLightBulb;
    // System.out.println(light1.isOn);
    light1.switchOn();
    light1.changeLightBulb(redLightBulb);
    System.out.println(light1.isOn());

  }

}

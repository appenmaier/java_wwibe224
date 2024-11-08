package model;

/**
 * Table Light
 *
 * @author Daniel Appenmaier
 * @version 1.0
 *
 */
public class TableLight {

  public boolean isConnected;
  public boolean isOn;
  public LightBulb lightBulb;

  /**
   * Changes the old Light Bulb with a new one
   *
   * @param newLightBulb the new Light Bulb
   * @return the old Light Bulb
   */
  public LightBulb changeLightBulb(LightBulb newLightBulb) {
    LightBulb oldLightBulb = lightBulb;
    lightBulb = newLightBulb;
    return oldLightBulb;
  }

  /**
   * Returns if the Table Light is shining or not
   *
   * @return Table Light is shining (true) or not (false)
   */
  public boolean isShining() {
    if (isConnected && isOn && lightBulb != null) {
      return true;
    } else {
      return false;
    }
  }

  /**
   * Plugs the Table Light in
   */
  public void plugIn() {
    isConnected = true;
  }

  /**
   * Pulls the Plug of the Table Light
   */
  public void pullThePlug() {
    isConnected = false;
  }

  /**
   * Switches the Table Light off
   */
  public void switchOff() {
    isOn = false;
  }

  /**
   * Switches the Table Light on
   */
  public void switchOn() {
    isOn = true;
  }

}

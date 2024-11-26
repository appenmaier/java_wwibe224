package model;

/**
 * Table Light
 *
 * @author Daniel Appenmaier
 * @version 1.0
 *
 */
public class TableLight extends Light {

  public final static String DESCRIPTION = "Tischleuchte";
  private static int numberOfDices;

  public static int getNumberOfDices() {
    return numberOfDices;
  }

  private boolean isConnected;
  private final PlugType plugType;
  private LightBulb lightBulb;

  public TableLight() {
    plugType = PlugType.TYPE_F;
    lightBulb = new LightBulb();
    numberOfDices++;
  }

  public TableLight(LightBulb lightBulb) {
    plugType = PlugType.TYPE_F;
    this.lightBulb = lightBulb;
    numberOfDices++;
  }

  public TableLight(LightBulb lightBulb, PlugType plugType) {
    this.plugType = plugType;
    this.lightBulb = lightBulb;
    numberOfDices++;
  }

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

  public LightBulb getLightBulb() {
    return lightBulb;
  }

  public PlugType getPlugType() {
    return plugType;
  }

  public boolean isConnected() {
    return isConnected;
  }

  /**
   * Returns if the Table Light is shining or not
   *
   * @return Table Light is shining (true) or not (false)
   */
  @Override
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

}

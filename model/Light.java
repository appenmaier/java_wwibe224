package model;

/**
 * Light
 *
 * @author Daniel Appenmaier
 * @version 1.0
 *
 */
public abstract class Light {

  protected boolean isOn;

  public boolean isOn() {
    return isOn;
  }

  public abstract boolean isShining();

  public final void switchOff() {
    isOn = false;
  }

  public void switchOn() {
    isOn = true;
  }

}

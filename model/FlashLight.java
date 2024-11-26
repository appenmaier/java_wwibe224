package model;

/**
 * Flash Light
 *
 * @author Daniel Appenmaier
 * @version 1.0
 *
 */
public class FlashLight extends Light {

  private double energyLevel;

  public FlashLight() {
    energyLevel = 1;
  }

  public double getEnergyLevel() {
    return energyLevel;
  }

  @Override
  public boolean isShining() {
    if (isOn && energyLevel > 0) {
      return true;
    } else {
      return false;
    }
  }

  public void recharge() {
    energyLevel = 1;
  }

  @Override
  public void switchOn() {
    isOn = true;
    if (energyLevel < 0.1) {
      energyLevel = 0;
    } else {
      energyLevel -= 0.1;
    }
  }

}

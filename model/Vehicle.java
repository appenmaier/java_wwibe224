package model;

/**
 * Vehicle
 *
 * @author Daniel Appenmaier
 * @version 1.0
 *
 */
public class Vehicle {

  private final String make;
  private final String model;
  protected double speedInKmh;

  public Vehicle(String make, String model) {
    this.make = make;
    this.model = model;
  }

  public void accelerate(double valueInKmh) {
    speedInKmh += valueInKmh;
  }

  public String getMake() {
    return make;
  }

  public String getModel() {
    return model;
  }

  public double getSpeedInKmh() {
    return speedInKmh;
  }

  @Override
  public String toString() {
    return "Vehicle [make=" + make + ", model=" + model + ", speedInKmh=" + speedInKmh + "]";
  }

}

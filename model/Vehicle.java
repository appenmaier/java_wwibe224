package model;

import java.util.Objects;

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

  @Override
  public boolean equals(Object obj) {
    if (this == obj) {
      return true;
    }
    if (obj == null) {
      return false;
    }
    if (getClass() != obj.getClass()) {
      return false;
    }
    Vehicle other = (Vehicle) obj;
    return Objects.equals(make, other.make) && Objects.equals(model, other.model)
        && Double.doubleToLongBits(speedInKmh) == Double.doubleToLongBits(other.speedInKmh);
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
  public int hashCode() {
    return Objects.hash(make, model, speedInKmh);
  }

  @Override
  public String toString() {
    return "Vehicle [make=" + make + ", model=" + model + ", speedInKmh=" + speedInKmh + "]";
  }

}

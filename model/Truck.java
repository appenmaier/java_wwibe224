package model;

/**
 * Truck
 *
 * @author Daniel Appenmaier
 * @version 1.0
 *
 */
public class Truck extends Vehicle {

  private boolean isTransformed;

  public Truck(String make, String model) {
    super(make, model);
  }

  @Override
  public String toString() {
    return "Truck [isTransformed=" + isTransformed + ", make=" + getMake() + ", model=" + getModel()
        + ", speedInKmh=" + getSpeedInKmh() + "]";
  }

  public void transform() {
    isTransformed = !isTransformed;
  }

}

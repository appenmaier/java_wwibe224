package model;

/**
 * Car
 *
 * @author Daniel Appenmaier
 * @version 1.0
 *
 */
public class Car extends Vehicle {

  private final int seats;

  public Car(String make, String model, int seats) {
    super(make, model);
    this.seats = seats;
  }

  public void doATurboBoost() {
    speedInKmh *= 2;
  }

  public int getSeats() {
    return seats;
  }

  @Override
  public String toString() {
    return "Car [seats=" + seats + ", make=" + getMake() + ", model=" + getModel() + ", speedInKmh="
        + getSpeedInKmh() + "]";
  }

}

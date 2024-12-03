package model;

import java.util.ArrayList;

/**
 * Rental
 *
 * @author Daniel Appenmaier
 * @version 1.0
 *
 */
public class Rental {

  private final String name;
  private final ArrayList<Vehicle> vehicles;

  public Rental(String name) {
    this.name = name;
    vehicles = new ArrayList<>();
  }

  public void addVehicle(Vehicle vehicle) {
    vehicles.add(vehicle);
  }

  public String getName() {
    return name;
  }

  public ArrayList<Vehicle> getVehicles() {
    return vehicles;
  }

  @Override
  public String toString() {
    return "Rental [name=" + name + ", vehicles=" + vehicles + "]";
  }

  public void transformAllTrucks() {
    for (Vehicle v : vehicles) {
      if (v instanceof Truck) {
        Truck t = (Truck) v; // Downcast
        t.transform();
      }
    }
  }

}

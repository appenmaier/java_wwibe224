package main;

import model.Car;
import model.Rental;
import model.Truck;
import model.Vehicle;

/**
 * Polymorphism03
 *
 * @author Daniel Appenmaier
 * @version 1.0
 *
 */
public class E01_Polymorphism03 {

  public static void main(String[] args) {

    Rental rental = new Rental("Sixxt");

    Vehicle v1 = new Car("Audi", "A4", 5); // Upcast
    Vehicle v2 = new Truck("MAN", "TGX"); // Upcast
    Vehicle v3 = new Car("Porsche", "911", 2); // Upcast
    Vehicle v4 = new Truck("Mercedes", "LKW"); // Upcast

    rental.addVehicle(v1);
    rental.addVehicle(v2);
    rental.addVehicle(v3);
    rental.addVehicle(v4);

    System.out.println(rental); // Polymorphie

    rental.transformAllTrucks();

    System.out.println(rental); // Polymorphie

  }

}

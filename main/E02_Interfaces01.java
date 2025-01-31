package main;

import model.Airline;
import model.Car;
import model.Partner;
import model.Rental;
import model.TravelAgency;
import model.Truck;
import model.Vehicle;

/**
 * Interfaces01
 *
 * @author Daniel Appenmaier
 * @version 1.0
 *
 */
public class E02_Interfaces01 {

   public static void main(String[] args) {
      TravelAgency agency = new TravelAgency("Tui");

      Rental rental = new Rental("Sixxt");

      Vehicle v1 = new Car("Audi", "A4", 5);
      Vehicle v2 = new Truck("MAN", "TGX");
      Vehicle v3 = new Car("Porsche", "911", 2);
      Vehicle v4 = new Truck("Mercedes", "LKW");

      Airline airline1 = new Airline("Lufthansa", 589);
      Airline airline2 = new Airline("United Airlines", 734);

      rental.addVehicle(v1);
      rental.addVehicle(v2);
      rental.addVehicle(v3);
      rental.addVehicle(v4);

      agency.addPartner(rental); // Upcast
      agency.addPartner(airline1); // Upcast
      agency.addPartner(airline2); // Upcast

      System.out.println(agency); // Polymorphie
      for (Partner p : agency.getPartners()) {
         if (p instanceof Rental r) { // Downcast
            r.transformAllTrucks();
         }
      }
      System.out.println(agency); // Polymorphie
   }

}

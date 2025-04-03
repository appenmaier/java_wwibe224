package model;

/**
 * Sensor
 *
 * @author Daniel Appenmaier
 * @version 1.0
 *
 */
public enum Sensor {

   TEMPERATURE("Temperature", "°C"), HUMIDITY("Luftfeuchtigkeit", "%");

   private final String description;
   private final String unitOfMeasure;

   Sensor(String description, String unitOfMeasure) {
      this.description = description;
      this.unitOfMeasure = unitOfMeasure;
   }

   public String getDescription() {
      return description;
   }

   public String getUnitOfMeasure() {
      return unitOfMeasure;
   }

}

package model;

import java.util.ArrayList;
import java.util.List;

/**
 * Weather Station
 *
 * @author Daniel Appenmaier
 * @version 1.0
 *
 */
public class WeatherStation {

   private final int id;
   private final String location;
   private final List<MeasurementValue> values;
   private static int counter;

   public WeatherStation(String location) {
      counter++;
      this.location = location;
      values = new ArrayList<>();
      id = counter;
   }

   public void addMeasurementValue(MeasurementValue measurementValue) {
      values.add(measurementValue);
   }

   public int getId() {
      return id;
   }

   public String getLocation() {
      return location;
   }

   public List<MeasurementValue> getValues() {
      return values;
   }

   @Override
   public String toString() {
      return id + ", " + location + ": " + values;
   }

   public double getAverageValueBySensor(Sensor sensor, long start, long end) {
      double average = 0;
      double total = 0;
      int counter = 0;
      for (MeasurementValue m : values) {
         if (m.getSensor().equals(sensor) && m.getTimestamp() >= start && m.getTimestamp() <= end) {
            total += m.getValue();
            counter++;
         }
      }
      average = total / counter;
      return average;
   }

}

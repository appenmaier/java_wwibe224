package model;

import java.util.Objects;

/**
 * Measurement Value
 *
 * @author Daniel Appenmaier
 * @version 1.0
 *
 */
public class MeasurementValue {

   private final long timestamp;
   private final double value;
   private final Sensor sensor;

   public MeasurementValue(long timestamp, double value, Sensor sensor) {
      this.timestamp = timestamp;
      this.value = value;
      this.sensor = sensor;
   }

   public long getTimestamp() {
      return timestamp;
   }

   public double getValue() {
      return value;
   }

   public Sensor getSensor() {
      return sensor;
   }

   @Override
   public String toString() {
      return "MeasurementValue [timestamp=" + timestamp + ", value=" + value + ", sensor=" + sensor
            + "]";
   }

   @Override
   public int hashCode() {
      return Objects.hash(sensor, timestamp, value);
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
      MeasurementValue other = (MeasurementValue) obj;
      return sensor == other.sensor && timestamp == other.timestamp
            && Double.doubleToLongBits(value) == Double.doubleToLongBits(other.value);
   }

}

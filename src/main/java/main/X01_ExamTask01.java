package main;

import java.io.File;
import java.io.FileNotFoundException;

import model.MeasurementValue;
import model.Sensor;
import model.WeatherStation;
import util.ValueHelper;

/**
 * Exam Task 1 (Weather Station)
 *
 * @author Daniel Appenmaier
 * @version 1.0
 *
 */
public class X01_ExamTask01 {

   public static void main(String[] args) throws FileNotFoundException {
      WeatherStation station = new WeatherStation("MP215");
      long now = System.currentTimeMillis();
      station.addMeasurementValue(new MeasurementValue(now, 18, Sensor.TEMPERATURE));
      station.addMeasurementValue(new MeasurementValue(now, 25, Sensor.HUMIDITY));
      station.addMeasurementValue(new MeasurementValue(now - 1000, 17, Sensor.TEMPERATURE));
      station.addMeasurementValue(new MeasurementValue(now - 1000, 26, Sensor.HUMIDITY));

      System.out.println(station.getAverageValueBySensor(Sensor.TEMPERATURE, now - 1000, now));
      System.out.println(station);
      System.out.println(ValueHelper.getValues(new File("src/main/resources/values.txt")));
   }

}

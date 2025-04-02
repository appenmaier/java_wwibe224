package model;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ValueHelper {

   public static List<MeasurementValue> getValues(File file) throws FileNotFoundException {
      List<MeasurementValue> values = new ArrayList<>();
      Scanner scanner = new Scanner(file);
      while (scanner.hasNextLine()) {
         String line = scanner.nextLine();
         String[] tokens = line.split(";");

         long timestamp = Long.valueOf(tokens[0]);
         double value = Double.valueOf(tokens[1]);
         Sensor sensor = Sensor.valueOf(tokens[2]);

         MeasurementValue value2 = new MeasurementValue(timestamp, value, sensor);
         values.add(value2);
      }
      scanner.close();
      return values;
   }

}

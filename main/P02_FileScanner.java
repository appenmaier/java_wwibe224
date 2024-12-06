package main;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import model.WeekDay;

/**
 * File Scanner
 *
 * @author Daniel Appenmaier
 * @version 1.0
 *
 */
public class P02_FileScanner {

  public static void main(String[] args) throws FileNotFoundException {

    File file = new File("resources/weekdays.txt");

    List<WeekDay> weekdays = new ArrayList<>();
    Scanner scanner = new Scanner(file);

    while (scanner.hasNextLine()) {
      String line = scanner.nextLine();
      WeekDay weekday = WeekDay.valueOf(line);
      weekdays.add(weekday);
    }

    scanner.close();

    System.out.println(weekdays);

  }

}

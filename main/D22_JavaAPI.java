package main;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;

/**
 * Java API (LocalDateTime, Wrapper, String, System)
 *
 * @author Daniel Appenmaier
 * @version 1.0
 *
 */
public class D22_JavaAPI {

  @SuppressWarnings("unused")
  public static void main(String[] args) {

    /* Datums- und Zeitangaben */
    LocalDate date = LocalDate.now();
    LocalTime time = LocalTime.now();
    LocalDateTime dateAndTime = LocalDateTime.now();
    LocalDate myBirthday = LocalDate.of(1982, 1, 4);

    System.out.println(date);
    System.out.println(time);
    System.out.println(dateAndTime);

    System.out.println(date.getDayOfYear());
    System.out.println(time.getMinute());
    System.out.println(dateAndTime.format(DateTimeFormatter.ISO_WEEK_DATE));
    System.out.println(myBirthday.getDayOfWeek());

    /* Wrapper-Klassen */
    String numberText = "42";
    int number = Integer.valueOf(numberText);
    System.out.println("number: " + number);
    Integer i = 42;
    System.out.println("i: " + i);
    int[] numbers = new int[3];
    ArrayList<Integer> numbers2 = new ArrayList<>();
    System.out.println(Integer.toUnsignedString(-42));
    Boolean b = Boolean.valueOf("true");
    System.out.println(b);

    /* Zeichenkettenverarbeitung */
    String text = "Hans;Peter;Lisa";
    String[] names = text.split(";");
    for (int x = 0; x < names.length; x++) {
      System.out.println(names[x]);
    }

    /* Systemeigenschaften */
    System.out.println("User Work Directory: " + System.getProperty("user.dir"));
    System.out.println("User Home Directory: " + System.getProperty("user.home"));
    System.out.println("File Separator: " + System.getProperty("file.separator"));

    System.out.println(System.getProperties());

  }

}

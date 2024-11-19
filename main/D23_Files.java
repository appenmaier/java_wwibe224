package main;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;
import model.Person;

/**
 * Files
 *
 * @author Daniel Appenmaier
 * @version 1.0
 *
 */
public class D23_Files {

  public static void main(String[] args) throws FileNotFoundException {

    ArrayList<Person> persons = new ArrayList<>();

    // String path = "C:\\Users\\D054906\\git\\java_wwibe224\\resources\\persons.txt";
    String path = "resources/persons.txt";
    File file = new File(path);
    Scanner scanner = new Scanner(file);

    while (scanner.hasNextLine()) {
      String line = scanner.nextLine();
      String[] tokens = line.split(";");

      String name = tokens[0];
      int age = Integer.valueOf(tokens[1]);
      char gender = Character.valueOf(tokens[2].charAt(0));
      Person person = new Person(name, age, gender);
      persons.add(person);
    }

    scanner.close();

    System.out.println(persons);

  }

}

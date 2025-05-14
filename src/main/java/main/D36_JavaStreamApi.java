package main;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import model.Person;

/**
 * Java Stream API
 *
 * @author Daniel Appenmaier
 * @version 1.0
 *
 */
public class D36_JavaStreamApi {

   public static void main(String[] args) {
      List<Person> persons = new ArrayList<>();
      persons.add(new Person("Hans", 18, 'm'));
      persons.add(new Person("Peter", 27, 'm'));
      persons.add(new Person("Lisa", 43, 'w'));
      persons.add(new Person("Max", 19, 'm'));
      persons.add(new Person("Heidi", 19, 'w'));
      persons.add(new Person("Philipp", 22, 'm'));
      persons.add(new Person("Maria", 17, 'w'));

      /* imperative Lösung */
      List<String> names = new ArrayList<>();
      for (Person p : persons) {
         if (p.getGender() == 'w' && p.getName().length() == 5) {
            String name = p.getName().toUpperCase();
            names.add(name);
         }
      }

      Collections.sort(names, new Comparator<String>() {

         @Override
         public int compare(String name1, String name2) {
            return name2.compareTo(name1);
         }

      });

      names.forEach(System.out::println);
      System.out.println();

      /* funktionale Lösung */
      names = persons.stream()
            .filter(p -> p.getGender() == 'w')
            .filter(p -> p.getName().length() == 5)
            .map(p -> p.getName().toUpperCase())
            .sorted((name1, name2) -> name2.compareTo(name1))
            .toList();

      names.forEach(System.out::println);
      System.out.println();
   }

}

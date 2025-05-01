package main;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;

import model.Exam;
import model.Student;

/**
 * Maps
 *
 * @author Daniel Appenmaier
 * @version 1.0
 *
 */
public class D34_Maps {

   public static void main(String[] args) {
      Map<Student, Exam> studentsWithExam = new HashMap<>();

      /* Werte setzen */
      studentsWithExam.put(new Student("1", "Hans"), new Exam("Mathe", 3.9));
      studentsWithExam.put(new Student("2", "Peter"), new Exam("Mathe", 2.5));
      studentsWithExam.put(new Student("3", "Lisa"), new Exam("Mathe", 1.3));

      /* Werte lesen */
      System.out.println("1, Hans -> " + studentsWithExam.get(new Student("1", "Hans")));

      /* Inhalte pruefen */
      System.out.println("3, Lisa?: " + studentsWithExam.containsKey(new Student("3", "Lisa")));
      System.out.println("Mathe, 1.0?: " + studentsWithExam.containsValue(new Exam("Mathe", 1.0)));

      /* Werte überschreiben */
      System.out.println("1, Hans, old -> "
            + studentsWithExam.put(new Student("1", "Hans"), new Exam("Mathe", 3.7)));
      System.out.println("1, Hans, new -> " + studentsWithExam.get(new Student("1", "Hans")));

      /* Werte ausgeben */
      System.out.println(studentsWithExam);
      System.out.println();

      /* Datensammlungen: Menge aller Schluessel */
      System.out.println("Anwesenheitsliste");
      for (Student s : studentsWithExam.keySet()) {
         System.out.printf("%-10s [ ]%n", s.getName());
      }
      System.out.println();

      /* Datensammlungen: Alle Werte */
      double total = 0;
      int counter = 0;
      for (Exam e : studentsWithExam.values()) {
         total += e.getGrade();
         counter++;
      }
      System.out.println("Durchschnittsnote aller Studenten: " + total / counter);
      System.out.println();

      /* Datensammlungen: Menge aller Eintraege / Schluessel-Werte-Paare */
      System.out.println("Notenliste");
      for (Entry<Student, Exam> entry : studentsWithExam.entrySet()) {
         Student student = entry.getKey();
         Exam exam = entry.getValue();
         System.out.println(student + " -> " + exam);
      }
      System.out.println();

      /* Probleme der TreeMap */
      studentsWithExam = new TreeMap<>(studentsWithExam);

      System.out.println("1, Hans -> " + studentsWithExam.get(new Student("1", "Hans")));
      System.out.println("2, Hans -> " + studentsWithExam.get(new Student("2", "Hans")));
      System.out.println("3, Hans -> " + studentsWithExam.get(new Student("3", "Hans")));
      System.out.println("4, Hans -> " + studentsWithExam.get(new Student("4", "Hans")));
   }

}

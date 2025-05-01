package model;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.ToString;

/**
 * Student
 *
 * @author Daniel Appenmaier
 * @version 1.0
 *
 */
@RequiredArgsConstructor
@Getter
@ToString
@EqualsAndHashCode
public class Student implements Comparable<Student> {

   private final String id;
   private final String name;

   @Override
   public int compareTo(Student student) {
      return name.compareTo(student.name);
   }

}

package model;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * Exam
 *
 * @author Daniel Appenmaier
 * @version 1.0
 *
 */
@Data
@AllArgsConstructor
public class Exam {

   private final String lecture;
   private double grade;

}

package model;

/**
 * Person
 *
 * @author Daniel Appenmaier
 * @version 1.0
 *
 */
public class Person {

  private final String name;
  private int age;
  private char gender;

  public Person(String name, int age, char gender) {
    this.name = name;
    this.age = age;
    this.gender = gender;
  }

  public int getAge() {
    return age;
  }

  public char getGender() {
    return gender;
  }

  public String getName() {
    return name;
  }

  @Override
  public String toString() {
    return "Person [name=" + name + ", age=" + age + ", gender=" + gender + "]";
  }

}

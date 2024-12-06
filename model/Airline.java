package model;

/**
 * Airline
 *
 * @author Daniel Appenmaier
 * @version 1.0
 *
 */
public class Airline implements Partner {

  private final String name;
  private int numberOfFLightsPerYear;

  public Airline(String name, int numberOfFLightsPerYear) {
    this.name = name;
    this.numberOfFLightsPerYear = numberOfFLightsPerYear;
  }

  public String getName() {
    return name;
  }

  public int getNumberOfFLightsPerYear() {
    return numberOfFLightsPerYear;
  }

  @Override
  public String toString() {
    return name + " (" + numberOfFLightsPerYear + ")";
  }

}

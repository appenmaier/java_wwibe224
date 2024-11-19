package model;

/**
 * Fighter
 *
 * @author Daniel Appenmaier
 * @version 1.0
 *
 */
public class Fighter {

  private final String name;
  private int healthPoints;
  private final int defenseValue;
  private final int armorRoll;
  private final Weapon weapon;

  public Fighter(String name, int healthPoints, int defenseValue, int armorRoll, Weapon weapon) {
    this.name = name;
    this.healthPoints = healthPoints;
    this.defenseValue = defenseValue;
    this.armorRoll = armorRoll;
    this.weapon = weapon;
  }

  public int getArmorRoll() {
    return armorRoll;
  }

  public int getDefenseValue() {
    return defenseValue;
  }

  public int getHealthPoints() {
    return healthPoints;
  }

  public String getName() {
    return name;
  }

  public Weapon getWeapon() {
    return weapon;
  }

  public void reduceHealthPointsByValue(int value) {
    if (value >= healthPoints) {
      healthPoints = 0;
    } else {
      healthPoints -= value;
    }
  }

}

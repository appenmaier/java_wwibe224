package model;

/**
 * Weapon
 *
 * @author Daniel Appenmaier
 * @version 1.0
 *
 */
public class Weapon {

  private final String name;
  private final int attackValue;
  private final int skill;
  private final int damageValue;

  public Weapon(String name, int attackValue, int skill, int damageValue) {
    this.name = name;
    this.attackValue = attackValue;
    this.skill = skill;
    this.damageValue = damageValue;
  }

  public int getAttackValue() {
    return attackValue;
  }

  public int getDamageValue() {
    return damageValue;
  }

  public String getName() {
    return name;
  }

  public int getSkill() {
    return skill;
  }

}

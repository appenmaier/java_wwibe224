package model;

import java.util.ArrayList;
import java.util.List;

/**
 * Travel Agency
 *
 * @author Daniel Appenmaier
 * @version 1.0
 *
 */
public class TravelAgency {

  private final String name;
  private final List<Partner> partners;

  public TravelAgency(String name) {
    this.name = name;
    partners = new ArrayList<>();
  }

  public void addPartner(Partner partner) {
    partners.add(partner);
  }

  public String getName() {
    return name;
  }

  public List<Partner> getPartners() {
    return partners;
  }

  @Override
  public String toString() {
    return "TravelAgency [name=" + name + ", partners=" + partners + "]";
  }

}

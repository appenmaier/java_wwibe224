package model;

/**
 * Plug Type
 *
 * @author Daniel Appenmaier
 * @version 1.0
 *
 */
public enum PlugType {

  TYPE_F("Typ F (Schukostecker)", "CEE 7/4", "Europa"), TYPE_B("Typ B", "NEMA-5",
      "Nordamerika"), TYPE_I("Typ I", "AS/NZS 3112", "Australien");

  // public final static PlugType TYPE_F = new PlugType("Typ F (Schukostecker)", "CEE 7/4",
  // "Europa");
  // public final static PlugType TYPE_B = new PlugType("Typ B", "NEMA-5", "Nordamerika");
  // public final static PlugType TYPE_I = new PlugType("Typ I", "AS/NZS 3112", "Australien");

  private final String description;
  private final String norm;
  private final String region;

  PlugType(String description, String norm, String region) {
    // private PlugType(String description, String norm, String region)
    this.description = description;
    this.norm = norm;
    this.region = region;
  }

  public String getDescription() {
    return description;
  }

  public String getNorm() {
    return norm;
  }

  public String getRegion() {
    return region;
  }

}

package model;

/**
 * Toaster
 *
 * @author Daniel Appenmaier
 * @version 1.0
 *
 */
public class Toaster implements WiredDevice {

  @Override
  public void plugIn() {
    System.out.println("Ich bin jetzt eingesteckt");
  }

  @Override
  public void pullThePlug() {
    System.out.println("Ich bin jetzt ausgesteckt");
  }

}

package main;

import java.util.ArrayList;
import model.TableLight;
import model.Toaster;
import model.WiredDevice;

/**
 * Interfaces
 *
 * @author Daniel Appenmaier
 * @version 1.0
 *
 */
public class D28_Interfaces {

  public static void main(String[] args) {

    ArrayList<WiredDevice> wiredDevices = new ArrayList<>();

    WiredDevice w1 = new Toaster(); // Upcast
    WiredDevice w2 = new TableLight(); // Upcast

    wiredDevices.add(w1);
    wiredDevices.add(w2);

    for (WiredDevice w : wiredDevices) {
      w.plugIn(); // Polymorphie
      if (w instanceof TableLight t) { // Downcast
        System.out.println(t.isConnected());
      }
    }

  }

}

package main;

import model.Order;
import model.Order.OrderItem;

/**
 * Member Classes
 *
 * @author Daniel Appenmaier
 * @version 1.0
 *
 */
public class D32_MemberClasses {

   @SuppressWarnings("unused")
   public static void main(String[] args) {
      Order order = new Order();

      OrderItem item = order.new OrderItem("Bestellposition 1");
   }

}

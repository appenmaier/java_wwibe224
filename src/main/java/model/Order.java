package model;

import java.util.List;

import lombok.Data;

/**
 * Order
 *
 * @author Daniel Appenmaier
 * @version 1.0
 *
 */
@Data
public class Order {

   private List<OrderItem> items;

   @Data
   public class OrderItem {

      private final String description;

   }

}

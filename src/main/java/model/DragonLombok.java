package model;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * Dragon
 *
 * @author Daniel Appenmaier
 * @version 1.0
 *
 */
@AllArgsConstructor
@Data
// @RequiredArgsConstructor
// @Getter
// @Setter
// @ToString
// @EqualsAndHashCode
public class DragonLombok {

   private final String name;
   private final DragonType type;
   private int age;

}

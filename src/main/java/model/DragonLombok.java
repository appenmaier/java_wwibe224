package model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.RequiredArgsConstructor;

/**
 * Dragon
 *
 * @author Daniel Appenmaier
 * @version 1.0
 *
 */
@AllArgsConstructor
@RequiredArgsConstructor
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

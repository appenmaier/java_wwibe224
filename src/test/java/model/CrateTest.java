package model;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.Optional;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

/**
 * CrateTest
 *
 * @author Daniel Appenmaier
 * @version 1.0
 *
 */
public class CrateTest {

   private Crate crate;
   @Mock
   private Sphere sphere1;
   @Mock
   private Sphere sphere5;
   @Mock
   private Sphere sphere3;
   @Mock
   private Body body;

   @BeforeEach
   void setUp() {
      MockitoAnnotations.openMocks(this);

      crate = new Crate(new ArrayList<>());
      // sphere1 = new Sphere(1);
      // sphere5 = new Sphere(5);
      // sphere3 = new Sphere(3);
      // body = () -> 2.0;
   }

   @Test
   void testAddBody() {
      crate.addBody(sphere1);
      crate.addBody(sphere5);

      assertTrue(crate.bodies().size() == 2);
      assertEquals(sphere1, crate.bodies().get(0));
      assertEquals(sphere5, crate.bodies().get(1));
   }

   @Test
   void testAddBody2() {
      assertThrows(NullPointerException.class, () -> crate.addBody(null));
   }

   @Test
   void testGetBodyWithHighestVolume() {
      assertEquals(Optional.empty(), crate.getBodyWithHighestVolume());
   }

   @Test
   void testGetBodyWithHighestVolume2() {
      when(sphere1.getVolume()).thenReturn(1.0);
      when(sphere5.getVolume()).thenReturn(5.0);
      when(sphere3.getVolume()).thenReturn(3.0);
      when(body.getVolume()).thenReturn(2.0);

      crate.addBody(sphere1);
      crate.addBody(sphere5);
      crate.addBody(sphere3);
      crate.addBody(body);

      assertEquals(Optional.of(sphere5), crate.getBodyWithHighestVolume());
   }

   @Test
   void testGetAllSpheres() {
      crate.addBody(sphere1);
      crate.addBody(sphere5);
      crate.addBody(sphere3);
      crate.addBody(body);

      assertEquals(3, crate.getAllSpheres().size());
      assertTrue(crate.getAllSpheres().size() == 3);
   }

}

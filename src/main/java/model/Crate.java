package model;

import java.util.List;
import java.util.Optional;

/**
 * Crate
 *
 * @author Daniel Appenmaier
 * @version 1.0
 *
 */
public record Crate(List<Body> bodies) {

   public void addBody(Body body) throws NullPointerException {
      if (body == null) {
         throw new NullPointerException();
      }

      bodies.add(body);
   }

   public Optional<Body> getBodyWithHighestVolume() {
      /* Variante A */
      // Body body = null;
      // double maxVolume = 0;
      //
      // for (Body b : bodies) {
      // if (b.getVolume() >= maxVolume) {
      // maxVolume = b.getVolume();
      // body = b;
      // }
      // }
      //
      // return Optional.ofNullable(body);

      /* Variante B */
      // Optional<Body> body = Optional.empty();
      // double maxVolume = 0;
      //
      // for (Body b : bodies) {
      // if (b.getVolume() >= maxVolume) {
      // maxVolume = b.getVolume();
      // body = Optional.of(b);
      // }
      // }
      //
      // return body;

      /* Variante C */
      return bodies.stream()
            .max((body1, body2) -> Double.compare(body1.getVolume(), body2.getVolume()));
   }

   public List<Sphere> getAllSpheres() {
      /* Variante A */
      // List<Sphere> spheres = new ArrayList<>();
      // for (Body b : bodies) {
      // if (b instanceof Sphere s) {
      // spheres.add(s);
      // }
      // }
      //
      // return spheres;

      /* Variante B */
      return bodies.stream().filter(Sphere.class::isInstance).map(Sphere.class::cast).toList();
   }

}

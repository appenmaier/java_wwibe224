package model;

public abstract class Present implements Wrappable {

   private boolean isWrapped;

   @Override
   public void wrap() {
      isWrapped = true;
   }

   @Override
   public void unwrap() {
      isWrapped = false;
   }

   public boolean isWrapped() {
      return isWrapped;
   }

}

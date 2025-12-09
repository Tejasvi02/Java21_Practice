package test_Nov10;
import java.util.*;
import java.util.concurrent.CopyOnWriteArrayList;
public class Dinosaur {
   private int distance;
   public void stomp() {
      try {
         ++distance;
         Thread.sleep(100_000);
         distance++;
      } catch (InterruptedException e) {}
   }
   private void findBreakfast(int checks) {
      var p = new CopyOnWriteArrayList<Thread>();
      for (int i = 0; i < checks; i++)
         p.add(Thread.ofPlatform().start(this::stomp));
   }
   public static void main(String[] args) throws Exception {
      var ship = new Dinosaur();
      ship.findBreakfast(10);
      Thread.sleep(1000);
      System.out.print(ship.distance);
   } }
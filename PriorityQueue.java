package Collections;
import java.util.*;

class Priority {
 public static void main(String args[])
 {
     PriorityQueue<Integer> pQueue = new PriorityQueue<Integer>();
     pQueue.add(20);
     pQueue.add(30);
     pQueue.add(25);
     System.out.println(pQueue.peek());
     System.out.println(pQueue.poll());
     System.out.println(pQueue.peek());
 }
}
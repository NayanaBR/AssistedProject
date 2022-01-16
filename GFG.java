package Collections;
import java.util.*;
public class GFG {
 public static void main(String args[])
 {
     Stack<String> stack = new Stack<String>();
     stack.push("Naya");
     stack.push("For");
     stack.push("Naya");
     stack.push("Naya");
     Iterator<String> itr = stack.iterator();
     while (itr.hasNext()) {
         System.out.print(itr.next() + " ");
     }

     System.out.println();

     stack.pop();
     itr = stack.iterator();
     while (itr.hasNext()) {
         System.out.print(itr.next() + " ");
     }
 }
}
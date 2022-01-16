package Protected;
public class Human {
 public static int legCount;
 public void display() {
     System.out.println("I am an human.");
     System.out.println("I have " + legCount + " legs.");
 }
}

 class Main {
 public static void main( String[] args ) {
     Human human = new Human();
     Human.legCount = 2;
     human.display();
 }
}


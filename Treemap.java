package Map;
import java.util.*;
public class Treemap {
	public static void main(String[] args) {
		TreeMap<Integer,String> tm=new TreeMap<Integer,String>();      
	      tm.put(1,"Nayana");    
	      tm.put(2,"Madhu");    
	      tm.put(3,"Sindhu");   
	       
	      System.out.println("\nThe elements of Treemap are ");  
	      for(Map.Entry m:tm.entrySet()){    
	       System.out.println(m.getKey()+" "+m.getValue());    
	      }
	}
}
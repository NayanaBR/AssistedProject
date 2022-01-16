package Map;
import java.util.*;
public class Hashmap {
	public static void main(String[] args) {
		HashMap<Integer,String> hm=new HashMap<Integer,String>();      
	      hm.put(1,"Nayana");    
	      hm.put(2,"Madhu");    
	      hm.put(3,"Sindhu");   
	       
	      System.out.println("\nThe elements of Hashmap are ");  
	      for(Map.Entry m:hm.entrySet()){    
	       System.out.println(m.getKey()+" "+m.getValue());    
	      }
	    
	      Hashtable<Integer,String> ht=new Hashtable<Integer,String>();  
	      
	      ht.put(4,"Appu");  
	      ht.put(5,"Vybhu");  
	      ht.put(6,"Shilpu");  
	      ht.put(7,"Pajju");  

	      System.out.println("\nThe elements of HashTable are ");  
	      for(Map.Entry n:ht.entrySet()){    
	       System.out.println(n.getKey()+" "+n.getValue());    
	      }
}
}
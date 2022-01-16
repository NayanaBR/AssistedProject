package EmailValidation;

import java.util.*;

public class EmailValidate {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Enter the email to search: ");
		Scanner scan = new Scanner(System.in);
		String name = scan.next(); 
		
		ArrayList <String> list = new ArrayList<String>();
		list.add("manoraj@gmail.com");
	    list.add("rashmi@gmail.com");
	    list.add("johnabhishek@domain.com");
	    list.add("junnu@domain.com");
	    list.add("karanamma@yahoo.com");
	    
	    System.out.println("Search Results: ");
	    for (String element : list) {
	       if (element.contains(name)) {
	             System.out.println(element + " " + "is present in the array!");
	              }  
	        }
	    scan.close();
	     }
	}
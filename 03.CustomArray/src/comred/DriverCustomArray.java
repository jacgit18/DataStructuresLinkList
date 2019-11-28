package comred;

import java.util.LinkedList;

public class DriverCustomArray {

	public static void main(String[] args) {

		// LinkList
		// searching by index the runtime complexity is bigO of 1 O(1) if you going by the index value or elements it changes to bigO of n O(n) which is worst case scenario
		//meaning searching for the index is more efficient
		// linklist list isnt an array it consist of a head and tail also there is no positioning linklist runtime complexity is O(n) so worst case almost infinite but you might not know the end of the list
		
		CustomArray ca = new CustomArray();
		ca.add("item.01");
		ca.add("item.02");
		ca.add("item.03");
		ca.add("item.04");
		ca.add("item.05");
		ca.add("item.06");
		ca.add("item.07");
		ca.add("item.08");
		ca.add("item.09");
		ca.add("item.10");
		ca.add("item.11");
		ca.add("item.12");
		ca.add("item.13");
		ca.add("item.14");
		
		ca.inserts("item.15", "item.16", "item.17");
		ca.inserts();

//		ca.delete("item.04");
		
		
		String [] allItems = ca.findAll();
		
		for(String string : allItems) {
			
			System.out.println(string);
		}

		
		
	    // Creating an empty test LinkedList 
	      LinkedList<String> list = new LinkedList<String>(); 
	  
	      // Using add() method to add elements in the list 
	       list.add("Geeks"); 
	      list.add("for"); 
	      list.add("Geeks"); 
	      list.add("10"); 
	      list.add("20"); 
	  
	      // Displaying the list 
	      System.out.println("LinkedList:" + list); 
	        
	      // Fetching last element from the list 
	      System.out.println("The last element is: " + list.getLast()); 

	}

}

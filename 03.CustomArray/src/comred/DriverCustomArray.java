package comred;

import comred.CustomArray1;
import edu.citytech.cst.datastructure.CheckCustomArray;
import edu.citytech.cst.datastructure.ICustomArray;

public class DriverCustomArray {
	
	public static void ClassExample() {
		// LinkList
				// searching by index the runtime complexity is bigO of 1 O(1) if you going by the index value or elements it changes to bigO of n O(n) which is worst case scenario
				//meaning searching for the index is more efficient
				// linklist list isnt an array it consist of a head and tail also there is no positioning linklist runtime complexity is O(n) so worst case almost infinite but you might not know the end of the list
				
				CustomArray1 ca = new CustomArray1();
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

//				ca.delete("item.04");
				
				
				String [] allItems = ca.findAll();
				
				for(String string : allItems) {
					
					System.out.println(string);
				}
	}

	public static void MyExample() {
		CustomArray2 array = new CustomArray2();
		String fileLocation = "/data/carpentier.joshua.ser";
//		CheckCustomArray.check(array, fileLocation);

		array.add("Spiderman Batman Thor Wonder-Women HawkGirl BlackWidow SuperGirl");

//		array.add("Spiderman");
//		array.add("Batman");
//		array.add("Thor");
//		array.add("Wonder-Women");
//		array.add("HawkGirl");
//		array.add("Black Widow");
//		array.add("SuperGirl");
////		
//	String [] arrayholder = array.getAll();		
//
//		
//		for (String string :  arrayholder) {
//			System.out.println(string);
//
//		}
//		System.out.println("         ");
//		array.inserts("chicken");
//		
//
//		for (String string :  arrayholder) {
//			System.out.println(string);
//
//		}

		for (String string : array.getAll()) {
			System.out.println(string);

		}
		System.out.println("         ");

//		array.inserts(array.getAll());

		array.inserts(" Ironman SuperMan Robin Flash");

		array.delete("Spiderman Batman Thor Wonder-Women HawkGirl BlackWidow ");

		System.out.println("         ");

		for (String string : array.getAll()) {
			System.out.println(string);
//
		}
	}
	
	public static void main(String[] args) {

//		ClassExample();
		MyExample();

	}

}

package comred;

public class DriverCustomLinkList {

	public static void main(String[] args) {
		/************************************************************
		 * There are only nine values in the list so the index ends at eight so when
		 * prompted to enter index don,t go past eight
		 ***********************************************************/
		CustomLinkList cl = new CustomLinkList();

		cl.add("item.01");
		cl.add("item.02");
		cl.add("item.03");
		cl.insert("item.04");
		cl.insert("item.05");

		cl.insert("item.00");
		cl.insert("item.-01");
		cl.insert("item.100");
		cl.insert("item.200");
		cl.insert("item.09");

//		cl.insertbeg("item.00");
//		cl.insertAt(0, "item.-01");
//		cl.insertAt(3, "item.100");
//		cl.insertAt(8, "item.200");
	

		/**************************************************************************
		 * Temporary solution need to make code for get tail more dynamic because if you
		 * delete a value you will be unable to get new tail so a new value was inserted
		 * to maintain the index value when i was using the other commented out insert
		 * methods above
		 *************************************************************************/
//		cl.insert("item.09");

		System.out.println("Stay within index range of 0 to 9");
		System.out.println("************************************");

		cl.show();
		System.out.println(" ");
		int size = cl.size();
		System.out.println("the size is " + size);
		System.out.println("---------------------");
		cl.getHead();
		cl.getTail();

		/*****************************************************************************************
		 * need to fix this method deletes the values after zero index instead of
		 * getting the position edit the else statement
		 ******************************************************************************************/
//		cl.getPosition(); 
		size = cl.size();
//		cl.show();
//		System.out.println(" ");

		System.out.println(" ");
		System.out.println("the size is " + size);
		System.out.println(" ");
		cl.show();
		System.out.println(" ");

		

		System.out.println("Once you delete a value the index range will change to  0 to 8 stay within that range");
		System.out.println("***************************************************************************************");
		cl.delete();

		size = cl.size();

		System.out.println( "the new size is " + size);
		System.out.println(" ");
		cl.getHead();
//		cl.getTail(); // fix logic flaw when index changes value no value is displayed
		System.out.println(" ");

		String[] items = cl.toArray();
		/*****************************************************************
		 * need a loop but since where dealing with link list so you have to use for
		 * each this is big O O(n) because we are able to reach the end of the list
		 ********************************************************/

		for (String string : items)

			System.out.println(string);

	}

	/*****************************************************************
	 * linear runtime complex is O(n) so worst case as for binary search the runtime
	 * complexity is O(log n) for binary search you basically split a big list in
	 * two then picking the side with value you looking then keep dividing until you
	 * get that value Look at python code watch java sort video
	 ********************************************************/

}

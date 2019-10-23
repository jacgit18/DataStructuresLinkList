package comred.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import comred.CustomLinkList;

class DriverCustomLinkListTest {

	@Test
	void test() {
		
	
		CustomLinkList cl = new CustomLinkList();

		cl.add("item.01");
		cl.add("item.02");
		cl.add("item.03");
		cl.insert("item.04");
		cl.insert("item.05");
//		cl.insertbeg("item.00");
//		cl.insertAt(0, "item.-01");
//		cl.insertAt(3, "item.100");
//		cl.insertAt(8, "item.-02");
		System.out.println("Stay within index range of 0 to 8");
		System.out.println("************************************");

		cl.show();
		System.out.println(" ");
		cl.delete();
		System.out.println(" ");
		cl.show();
		System.out.println(" ");

		cl.insert("item.09");
	
		cl.getHead();
		cl.getTail();
		
//		cl.getPosition(); 
		int size = cl.size();
		cl.show();
		System.out.println(" ");

		System.out.println(" ");
		System.out.println("the size is " + size);

		String[] items = cl.toArray();
		
		for (String string : items)

			System.out.println(string);

		
	}

}

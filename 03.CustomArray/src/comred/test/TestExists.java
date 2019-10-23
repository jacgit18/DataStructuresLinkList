package comred.test;

import static org.junit.jupiter.api.Assertions.*;


/**
 * prepare a test first before coding
 * so you can prepare a test to show someone to make sure your doing something they want
 */

import org.junit.jupiter.api.Test;

import comred.CustomLinkList;

class TestExists {

	@Test
	void test() {
		CustomLinkList c = new CustomLinkList();
		
		
		c.add("A");
		c.add("B");
		c.add("C");
		c.add("D");


		
		int status  = c.size();
		
		assertTrue(status == 4);
		
		
		
	}
	
	
	
	@Test
	void testForExist() {
		
	CustomLinkList c = new CustomLinkList();
		
		
		c.add("A");
		c.add("B");
		c.add("C");
		c.add("D");


		
		boolean status  = c.exists("D");
		
		assertTrue(status);
		
	}
	
	@Test
	void testNotForExist() {
		
	CustomLinkList c = new CustomLinkList();
		
		
		c.add("A");
		c.add("B");
		c.add("C");
		c.add("D");


		
		boolean status  = c.exists("F");
		// this will pass because where assuming that this will be false which is true if we assume true we will get false
		assertFalse(status);
		
	}
	
	

}

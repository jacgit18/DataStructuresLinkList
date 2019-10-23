package comred.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import comred.CustomLinkList;

// for junit test you will find yourself hard coding alot of values

class TestArray {

	@Test
	void test() {
		CustomLinkList c = new CustomLinkList();

		c.add("A");
		c.add("B");
		c.add("C");
		c.add("D");

		int status = c.size();
		int arraySize = c.toArray().length;

		assertTrue(status == 4);
		
		
		
	}

	/**
	 * test the first value in the array
	 */
	@Test
	void test2() {
		CustomLinkList c = new CustomLinkList();

		c.add("A");
		c.add("B");
		c.add("C");
		c.add("D");

		String content = c.toArray()[0];
		assertTrue(content.equals("A"));

	}

	/**
	 * test the last value in the array
	 */
	@Test
	void test3() {
		CustomLinkList c = new CustomLinkList();

		c.add("A");
		c.add("B");
		c.add("C");
		c.add("D");

		String content = c.toArray()[3];
		assertTrue(content.equals("D"));
	}

}

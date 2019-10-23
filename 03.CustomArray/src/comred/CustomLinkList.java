package comred;

import java.util.Scanner;

import edu.citytech.cst.datastructure.ICustomLinkList;

public class CustomLinkList implements ICustomLinkList {
	/***********************************************************
	 * ToDo-------------------------------------------> 
	 * 
	 * \\Extra Credit\\ ----------------- int delete(String data) –delete an item in
	 * the link by position. If an item is successfully the delete method return the
	 * number 1, else return the number 0
	 * ***************************************************************
	 */
	
	Scanner keyin = new Scanner(System.in);
	
	class Node {
		private String value;
		// this represents our link
		private Node link;

		public Node(String value, Node Link) {
			this.value = value;
			this.link = Link;
		}

		@Override
		public String toString() {
			return "Node [value=" + value + ", link=" + link + "]";
		}

	}

	private Node head;
	private Node tail;
	private int size;

	public void add(String item) {

		if (head == null)

			head = tail = new Node(item, null);

		else {
			Node newValue = new Node(item, null);
			tail.link = newValue;
			tail = newValue;

	

		}


		size++;

	}

	public int size() {

		return this.size;

	}

	public String[] toArray() {
		String[] items = new String[this.size];

		// Hard coded value code was here now is commented out at end of the method --------->


		Node next = this.head;
		int i = 0;
		items[i] = this.head.value;

		do {
			next = next.link;
			items[++i] = next.value;

		} while (i < size - 1);

		return items;
		
		
		// Hard coded the list hear
//		items[0]= head.value;
//		items[1]= head.link.value;
//		items[2]= head.link.link.value;
	//	
//		for (int i = 0; i < size; i++) {	
//			
//		}

//			Node lasNode = head;
//			while (lasNode.link != null) {
//				System.out.println(lasNode.value);
//				lasNode =lasNode.link;
//				
//			}
//			System.out.println(lasNode.value);

	}

	/**
	 * f5 or step into is looking at the internal source use over instead with f6
	 * returns a Boolean if found
	 * 
	 * @return
	 */
	public boolean exists(String data) {

		String current = "";
		Node temp = this.head;

		do {
			current = temp.value;

			if (current.equals(data)) {
				return true;

			}

		} while ((temp = temp.link) != null);

		return false;

	}

	/**
	 * insert it the item to the last row
	 * 
	 * @param data
	 */

	@Override
	public void insert(String data) {
		
//		System.out.println("Enter list item  ");
//		data = keyin.nextLine();


		
		Node lastnode = new Node(data, null);

		if (this.head == null) {

			this.head = lastnode;

		} else {

			Node current = this.head;
			while (current.link != null) {
				current = current.link;

			}

			current.link = lastnode;
		}
		size++;


	}

	/**
	 * insert it the item to the beg row
	 * 
	 * @param data
	 */

	public void insertbeg(String data) {

		Node begnode = new Node(data, null);

		begnode.link = this.head;
		this.head = begnode;
		
		size++;


	}

	public void insertAt(int index, String data) {

		Node begnode = new Node(data, null);

		if (index == 0) {
			insertbeg(data);
		}

		else {
			Node nxtnode = this.head;
			for (int i = 0; i < index - 1; i++) {
				nxtnode = nxtnode.link;
			}
			begnode.link = nxtnode.link;
			nxtnode.link = begnode;
		}
		size++;

	}

	public void show() {

		Node lasNode = head;
		while (lasNode.link != null) {
			System.out.println(lasNode.value);
			lasNode = lasNode.link;

		}
		System.out.println(lasNode.value);

	}

	public String getTail() {
		

		System.out.println("Enter tail index ");
		int index = keyin.nextInt();

		if (index == 0) {
			System.out.println("The tail is " + this.head.value );
//			System.out.println("The tail is " + this.tail.value );

			System.out.println(" ");

			}else {
				Node current = this.head.link.link.link.link.link.link.link.link.link;


				while (current != null) {
//					current = this.tail.link.link.link;
					System.out.println("the tail is " + current.value);
//					current = current.link;
					current = null;
			}
				System.out.println(" ");


		}

		return null;

	}

	public String getHead() {
		System.out.println(" ");
		System.out.println("Enter head index ");
		int index = keyin.nextInt();

		if (index == 0) {
			System.out.println("The head is " + this.head.value );
			System.out.println(" ");

			}
		
		return null;

	}

	/**
	 * Deletes tail or anything else
	 */
	@Override
	public void delete() {
		

		System.out.println("Enter index to delete");
		int index = keyin.nextInt();

		// deletes head
		if (index == 0) {
			System.out.println("The head " + this.head.value + " was chopped of" );
			this.head = this.head.link;
			System.out.println("but we have a new head which is " + this.head.value );
			System.out.println(" ");
		} else {
			Node current = this.head;
			Node p1 = null;
			for (int i = 0; i < index - 1; i++) {
				current = current.link;
			}
			p1 = current.link;
			current.link = p1.link;
			System.out.println(p1.value + " is gone");
			// removes item from memory to
			p1 = null;
			System.out.println("  ");

			System.out.println("  ");

		}
		size--;


	}
	
	
	public void getPosition() {    
        Node current = this.head;    
            
   

		System.out.println("enter index to see");
		int index = keyin.nextInt();

		if (index == 0) {
			System.out.println("You picked the index for the head of the list " + this.head.value );
			System.out.println(" ");

			} else {
			Node currentNode = this.head;
			Node p1 = null;
			for (int i = 0; i < index - 1; i++) {
				currentNode = currentNode.link;
			}
			p1 = currentNode.link;
			currentNode.link = p1.link;
			System.out.println(p1 + " is gone");
			p1 = null;
			System.out.println("  ");

			System.out.println("  ");

		}
        
        
    }    

	@Override
	public int delete(String data) {
		// TODO Auto-generated method stub
		return 0;
	}
	
	

}

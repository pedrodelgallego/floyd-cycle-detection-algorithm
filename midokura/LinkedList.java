package midokura;

import java.util.NoSuchElementException;

/**
* LinkedList is an implementation of List, using a linked list. 
* This do not pretend to be a full implementation, just the 
* necessary methods to run the hasLoop algorithm 
*/

public class LinkedList<E> {
	Node<E> start;
	int size;
	
	/**
	 * Constructs an empty list.
	 */
	public LinkedList() {
		start = null; 
	}

	/**
	 * Appends the specified element to the head of this list.
	 * 
	 *  @param data 
	 *  	element to be appended to this list 
	 *  
	 *  @return 
	 *  	Always true
	 */	
	public boolean add(E data) {
		Node<E> newNode = new Node<E>();
		newNode.data = data;
		newNode.next = start;
		start = newNode;

		size++;
		return true;
	}

	/**
	 * Returns the element at the specified position in this list.
	 * 
	 *  @param  index 
	 *  	index of the element to return 
	 *  @return 
	 *  	the element at the specified position in this list
	 *  @throws IndexOutOfBoundsException 
	 *  	if the index is out of range (index < 0 || index >= size )
	 */
	public Node<E> get(int nodePos) throws ArrayIndexOutOfBoundsException {
		if (nodePos >= size || nodePos < 0) {
			throw new IndexOutOfBoundsException();
		}
		Node<E> temp = start;  // Move pointer to the initial position 
		int counter = 0;
		for (; counter < nodePos; counter++) {
			temp = temp.next;  // Move pointer one node ahead
		}
		return temp;
	}

	/**
	 * Returns the first element in this list.
	 *  
	 *  @return 
	 *  	the first element in this list.
	 *  @throws NoSuchElementException 
	 *  	if the list is empty
	 */
	public Node<E> getFirst() {
		if (isEmpty())
			throw new NoSuchElementException();
			
		return this.start;
	}

	/**
	 * Returns the last element in this list.
	 *  
	 *  @return 
	 *  	the last element in this list
	 *  @throws NoSuchElementException 
	 *  	if the list is empty
	 */
	public Node<E> getLast() {
		if (isEmpty())
			throw new NoSuchElementException();
		
		return get(size - 1);
	}

	/**
	 * Returns the number of elements in this list.
	 *  
	 *  @return 
	 *  	the number of elements in this list
	 */
	public int size() {
		return size;		
	}	

	/**
	 * Returns true if this list contains no elements.
	 *  
	 *  @return 
	 *  	true if this list contains no elements, false otherwise
	 */
	public boolean isEmpty() { 
		return start == null;
	}
}

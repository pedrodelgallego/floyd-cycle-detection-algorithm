package midokura; 

public class LinkedListUtils {

	/**
	 * Detect if a linked list has a cycle. 
	 *  
	 *  @return true if the list has a cycle, false otherwise
	 */
	public static boolean hasLoop(LinkedList<Integer> list) {
		if (list.isEmpty())
			return false; 
		
		// The algorithm mantains the position of two pointers.
        // Both pointer start in the same position
		Node<Integer> fastPointer = list.start;
		Node<Integer> slowPointer = list.start;

		// At each step of the algorithm, the slower pointer moves one step forward, 
		// the faster pointer moves two steps forward in the sequenece 
		// and then it compares the list nodes at these two pointers. 
		// If both pointers are pointing at the same node, the list has a cycle
		while (true) {			
			slowPointer = slowPointer.next;
			if (! fastPointer.hasNext() || ! fastPointer.next.hasNext()){ // Check if we are at the end of the list					
				return false;                                             // if so, the list has not cycles
			}
			
			fastPointer = fastPointer.next.next;
			if (slowPointer == fastPointer) { // Are the pointer pointing to the same object
				return true;                  // if so, this is a cycle
			}	
		}		 
	}
 
}

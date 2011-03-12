package midokura;

public class Node<E> {
	E data;
	Node<E> next;
	
	public boolean hasNext() {
		return next != null;
	}	
}

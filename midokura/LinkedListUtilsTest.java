package midokura;

import static org.junit.Assert.* ;
import org.junit.Before;
import org.junit.Test;

public class LinkedListUtilsTest {

	private LinkedList<Integer> listWithLoop;
	private LinkedList<Integer> listWithoutLoop;

	@Before
	public void setUp() {				
		listWithLoop = createListWithLoop();
	}
	
	@Test
	public void detectLoop(){
		assertTrue(LinkedListUtils.hasLoop(listWithLoop));		
	}
	
	@Test
	public void noLoopInNormalList(){
		listWithoutLoop = createSampleList();
		assertFalse(LinkedListUtils.hasLoop(listWithoutLoop));		
	}
	
	@Test
	public void noLoopInEmptyList(){
		LinkedList<Integer> emptyList = new LinkedList<Integer>();
		assertFalse(LinkedListUtils.hasLoop(emptyList));		
	}
	
	private LinkedList<Integer> createSampleList(){
		LinkedList<Integer> list = new LinkedList<Integer>();			
		for (int i = 10; i>=0 ;  i--) {
			list.add(i);
		}
		return list;
	}
	
	private LinkedList<Integer> createListWithLoop(){
		LinkedList<Integer> list = createSampleList();
		// Link the last element to the forth element to create a loop
		list.getLast().next = list.get(4);  
		return list;
	}
	
}

package midokura;

import static org.junit.Assert.* ;
import org.junit.Before;
import org.junit.Test;

public class LinkedListTest {

	private LinkedList<Integer> sampleList;

	@Before
	public void setUp() {
		sampleList = createSampleList();
	}

	@Test
	public void addOneElement() {
		sampleList.add(100);
		assertEquals(sampleList.getFirst().data.intValue(), 100);
	}
	
	@Test
	public void getNodeAtPosition2() {
		assertEquals(sampleList.get(2).data.intValue(), 2);
	}

	@Test
	public void getFirstElement() {
		assertEquals(sampleList.getFirst().data.intValue(), 0);
	}
	 
	@Test
	public void checkAnEmptyList(){
		assertTrue(new LinkedList<Integer>().isEmpty());
	}
	
	@Test
	public void checkAnNonEmptyList(){
		assertFalse(sampleList.isEmpty());
	}
	
	private LinkedList<Integer> createSampleList(){
		LinkedList<Integer> list = new LinkedList<Integer>();			
		for (int i = 10; i>=0 ;  i--) {
			list.add(i);
		}
		return list;
	}
}


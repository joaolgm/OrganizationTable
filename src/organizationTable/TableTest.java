package organizationTable;

import static org.junit.Assert.*;

import org.junit.Test;


public class TableTest {

	Table tablee = new Table();
	@Test
	public void testAddActivity() {
		tablee.addActivity("a", 2, 6);
		tablee.addActivity("b", 4, 2);
		
		assertEquals(2, tablee.sizeTable());
	}

}

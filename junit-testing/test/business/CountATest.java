package business;

import static org.junit.Assert.*;

import org.junit.Test;

public class CountATest {

	@Test
	public void testAcount() {
		BasicCalculations bc = new BasicCalculations();
		assertEquals(2, bc.countA("I am happy"));
	}
}

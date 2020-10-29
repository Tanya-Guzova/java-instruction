package business;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.Test;


class SquareTest {

	@Test
	public void testSquare() {
		BasicCalculations bc = new BasicCalculations();
		int x = bc.square(4);
		assertEquals(16, x);
	}
}
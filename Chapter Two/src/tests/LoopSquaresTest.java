package tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import exercises.LoopSquares;
import junit.framework.Assert;

class LoopSquaresTest {

	@Test
	void testRookie() {
		String expected = "1 4 9 16 25 36 49 64 81 100 ";
		String actual = LoopSquares.rookie();
		assertEquals(expected, actual);
	}
	
	@Test
	void testpro() {
		String expected = "1 4 9 16 25 36 49 64 81 100 ";
		String actual = LoopSquares.pro();
		assertEquals(expected, actual);
	}

}

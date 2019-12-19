package tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import exercises.SpacedNumbers;

class SpacedNumbersTest {

	@Test
	void test() {
		String e = "    1\n"
				+ "   2\n"
				+ "  3\n"
				+ " 4\n"
				+ "5\n";
		String a = SpacedNumbers.spcdNmbrs();
		assertEquals(e, a);
	}

}

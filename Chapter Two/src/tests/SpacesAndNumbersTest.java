package tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import exercises.SpacesAndNumbers;

class SpacesAndNumbersTest {

	@Test
	void test() {
		String e = "    1\n"
				+ "   22\n"
				+ "  333\n"
				+ " 4444\n"
				+ "55555\n";
		String a = SpacesAndNumbers.spcsNmbrs();
		assertEquals(e, a);
	}

}

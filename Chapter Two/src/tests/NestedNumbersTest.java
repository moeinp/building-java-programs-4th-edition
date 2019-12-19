package tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import exercises.NestedNumbers;

class NestedNumbersTest {

	@Test
	void test() {
		String exp = "000111222333444555666777888999\n" + 
				"000111222333444555666777888999\n" + 
				"000111222333444555666777888999\n" + 
				"";
		String act = NestedNumbers.nestedNums();
		assertEquals(exp,act);

	}

}

package tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import exercises.NestedNumbers3;

class NestedNumbers3Test {

	@Test
	void test() {
		String exp = "999999999888888887777777666666555554444333221\n" + 
				"999999999888888887777777666666555554444333221\n" + 
				"999999999888888887777777666666555554444333221\n" + 
				"999999999888888887777777666666555554444333221\n";
		String act = NestedNumbers3.nestedNums3();
		assertEquals(exp,act);
	}

}

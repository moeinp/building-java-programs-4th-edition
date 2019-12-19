package tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import exercises.NumbersOutput60;

class NumbersOutput60Test {

	@Test
	void test() {
		String exp = "         |         |         |         |         |         |\n" + 
				"123456789012345678901234567890123456789012345678901234567890";
		String ans = NumbersOutput60.nums60();
		assertEquals(exp,ans);
	}

}

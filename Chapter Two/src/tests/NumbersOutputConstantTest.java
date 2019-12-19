package tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import exercises.NumbersOutputConstant;

class NumbersOutputConstantTest {

	@Test
	void test() {
		String e = "         |         |         |         |         |         |\n" + 
				"123456789012345678901234567890123456789012345678901234567890";
		String a = NumbersOutputConstant.numsConst();
		assertEquals(e,a);
	}

}

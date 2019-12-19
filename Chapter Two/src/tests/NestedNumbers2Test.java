package tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import exercises.NestedNumbers2;

class NestedNumbers2Test {

	@Test
	void test() {
		String exp = "99999888887777766666555554444433333222221111100000\n" + 
				"99999888887777766666555554444433333222221111100000\n" + 
				"99999888887777766666555554444433333222221111100000\n" + 
				"99999888887777766666555554444433333222221111100000\n" + 
				"99999888887777766666555554444433333222221111100000" + 
				"\n";
		String act = NestedNumbers2.nestedNums2();
		assertEquals(exp,act);
	}

}

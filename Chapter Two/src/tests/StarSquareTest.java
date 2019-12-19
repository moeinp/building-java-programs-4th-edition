package tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import exercises.StarSquare;

class StarSquareTest {

	@Test
	void test() {
		String e = "*****\n" + "*****\n" + "*****\n" + "*****\n";
		String a = StarSquare.strSqr();
		assertEquals(e, a);

	}

}

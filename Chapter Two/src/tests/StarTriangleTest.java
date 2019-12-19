package tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import exercises.StarTriangle;

class StarTriangleTest {

	@Test
	void test() {
		String e = "*\n" + 
				"**\n" + 
				"***\n" + 
				"****\n" + 
				"*****\n";
		String a = StarTriangle.strTrngl();
		assertEquals(e, a);
	}

}

package tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import exercises.NumberTriangle;

class NumberTriangleTest {

	@Test
	void test() {
		String e = "1\n"
				+ "22\n"
				+ "333\n"
				+ "4444\n"
				+ "55555\n"
				+ "666666\n"
				+ "7777777\n";
		String a = NumberTriangle.nmbrTrngl();
		assertEquals(e, a);
				
	}

}

package practice;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class DecimalToBinaryTest {

	@Test
	void test1() {
		int exp = 1011010;
		int act = DecimalToBinary.DToB(90);
		assertEquals(exp, act);
	}
	@Test
	void test2() {
		int exp = 1111110010;
		int act = DecimalToBinary.DToB(1010);
		assertEquals(exp, act);
	}
	@Test
	void test3() {
		int exp = 1110100100;
		int act = DecimalToBinary.DToB(932);
		assertEquals(exp, act);
	}
	@Test
	void test4() {
		int exp = 1011001;
		int act = DecimalToBinary.DToB(89);
		assertEquals(exp, act);
	}
	@Test
	void test5() {
		int exp = 1;
		int act = DecimalToBinary.DToB(1);
		assertEquals(exp, act);
	}
}

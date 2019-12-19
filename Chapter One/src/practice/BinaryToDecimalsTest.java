package practice;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class BinaryToDecimalsTest {

	@Test
	void test1() {
		int exp = 9;
		int act = BinaryToDecimals.bToD(1001);
		assertEquals(exp,act);
	}
	
	@Test
	void test2() {
		int exp = 17;
		int act = BinaryToDecimals.bToD(10001);
		assertEquals(exp,act);	
		}
	
	@Test
	void test3() {
		int exp = 85;
		int act = BinaryToDecimals.bToD(1010101);
		assertEquals(exp,act);	
		}
	
	@Test
	void test4() {
		int exp = -1;
		int act = BinaryToDecimals.bToD(01010101);
		assertEquals(exp,act);	
		}
	
	@Test
	void test5() {
		int exp = -1;
		int act = BinaryToDecimals.bToD(909384039);
		assertEquals(exp,act);	
		}

}

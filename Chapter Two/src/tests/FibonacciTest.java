package tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import exercises.Fibonacci;

class FibonacciTest {

	@Test
	void test() {
		String expected = "1 1 2 3 5 8 13 21 34 55 89 144 ";
		String actual = Fibonacci.fib();
		assertEquals(expected,actual);
	}

}

package tests;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import exercises.Displacement;

class DisplacementTest {

	@Test
	void test1() {
		double expected = 537.0;
		double actual = Displacement.displcmnt();
		Assertions.assertEquals(expected, actual);	
	}
	
	@Test
	void test2() {
		double expected = (12.0 + (3.5 * 10)) + ((9.8 * 10 * 10) / 2);
		double actual = Displacement.displcmnt();
		Assertions.assertEquals(expected, actual);	
	}

}

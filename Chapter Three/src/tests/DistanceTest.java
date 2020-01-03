package tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import exercises.Distance;

class DistanceTest {

	@Test
	void test() {
		assertEquals(7.615773105863909, Distance.distance(10, 2, 3, 5));
	}

}

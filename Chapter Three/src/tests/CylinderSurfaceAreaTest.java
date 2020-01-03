package tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import exercises.CylinderSurfaceArea;

class CylinderSurfaceAreaTest {

	@Test
	void test() {
		assertEquals(CylinderSurfaceArea.cylinderSurfaceArea(3.0, 4.5), 141.3716694115407);;
	}

}

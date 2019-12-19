package tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import exercises.WaveNumbers40;

class WaveNumbers40Test {

	@Test
	void test() {
		String e = "----------------------------------------\n" + 
				"_-^-_-^-_-^-_-^-_-^-_-^-_-^-_-^-_-^-_-^-\n" + 
				"1122334455667788990011223344556677889900\n" + 
				"----------------------------------------";
		String a = WaveNumbers40.waveMaker();
		assertEquals(e,a);
	}

}

package tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import exercises.PrintDesign;

class PrintDesignTest {

	@Test
	void test() {
		String exp = "-----1-----\n" + 
				"----333----\n" + 
				"---55555---\n" + 
				"--7777777--\n" + 
				"-999999999-\n";
		String act = PrintDesign.printDesign();
		assertEquals(exp,act);
	}

}

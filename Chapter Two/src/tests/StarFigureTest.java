package tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import exercises.StarFigure;

class StarFigureTest {

	@Test
	void test() {
		String exp = "////////////////\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\n" + 
				"////////////********\\\\\\\\\\\\\\\\\\\\\\\\\n" + 
				"////////****************\\\\\\\\\\\\\\\\\n" + 
				"////************************\\\\\\\\\n" + 
				"********************************\n";
		String act = StarFigure.strFig();
		assertEquals(exp,act);
	}

}

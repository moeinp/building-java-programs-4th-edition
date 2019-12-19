package tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import exercises.StarFigure2;

class StarFigure2Test {

	@Test
	void test() {
		String exp = "////////////////////\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\n" + 
				"////////////////********\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\n" + 
				"////////////****************\\\\\\\\\\\\\\\\\\\\\\\\\n" + 
				"////////************************\\\\\\\\\\\\\\\\\n" + 
				"////********************************\\\\\\\\\n" + 
				"****************************************\n";
		String act = StarFigure2.strFig();
		assertEquals(exp,act);
	}

}

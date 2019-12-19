package tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import exercises.SlashFigure2;

class SlashFigure2Test {

	@Test
	void test() {
		String exp = "!!!!!!!!!!!!!!!!!!!!!!\n" + 
				"\\\\!!!!!!!!!!!!!!!!!!//\n" + 
				"\\\\\\\\!!!!!!!!!!!!!!////\n" + 
				"\\\\\\\\\\\\!!!!!!!!!!//////\n" + 
				"\\\\\\\\\\\\\\\\!!!!!!////////\n" + 
				"\\\\\\\\\\\\\\\\\\\\!!//////////\n";
		String act = SlashFigure2.slshFig();
		assertEquals(exp,act);
	}

}

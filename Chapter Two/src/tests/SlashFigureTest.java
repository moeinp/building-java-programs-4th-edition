package tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import exercises.SlashFigure;

class SlashFigureTest {

	@Test
	void test() {
		String exp = "!!!!!!!!!!!!!!!!!!!!!!\n" + 
				"\\\\!!!!!!!!!!!!!!!!!!//\n" + 
				"\\\\\\\\!!!!!!!!!!!!!!////\n" + 
				"\\\\\\\\\\\\!!!!!!!!!!//////\n" + 
				"\\\\\\\\\\\\\\\\!!!!!!////////\n" + 
				"\\\\\\\\\\\\\\\\\\\\!!//////////\n";
		String act = SlashFigure.slshFig();
		assertEquals(exp,act);
	}

}

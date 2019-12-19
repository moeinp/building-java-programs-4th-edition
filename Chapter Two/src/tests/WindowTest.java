package tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import exercises.Window;

class WindowTest {

	@Test
	void test() {
		String exp = "+=====+=====+\n" + 
				"|     |     |\n" + 
				"|     |     |\n" + 
				"|     |     |\n" + 
				"|     |     |\n" + 
				"|     |     |\n" + 
				"+=====+=====+\n" + 
				"|     |     |\n" + 
				"|     |     |\n" + 
				"|     |     |\n" + 
				"|     |     |\n" + 
				"|     |     |\n" + 
				"+=====+=====+\n";
		String act = Window.wndw();
		assertEquals(exp,act);
	}

}

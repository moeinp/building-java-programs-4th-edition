package exercises;

import static org.junit.Assert.assertEquals;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.junit.jupiter.api.Test;

class ChapterOneTests {
	@Test
	void differenceTest() {
		String actual = Difference.draw();
		String expected = "What is the difference between\n" + "a ' and a \"?  Or between a \" and a \\\"?\n" + "\n"
				+ "One is what we see when we're typing our program.\n"
				+ "The other is what appears on the \"console.\"";
		assertEquals(expected, actual);
	}

	@Test
	void EggTest() {
		String actual = Egg.draw();
		String expected = "  _______\n" + " /       \\\n" + "/         \\\n" + "-\"-'-\"-'-\"-\n" + "\\         /\n"
				+ " \\_______/";
		assertEquals(expected, actual);
	}

	@Test
	void Egg2Test() {
		String actual = Egg2.draw();
		String expected = "  _______\n" + " /       \\\n" + "/         \\\n" + "\\         /\n" + " \\_______/\n"
				+ "-\"-'-\"-'-\"-\n" + "  _______\n" + " /       \\\n" + "/         \\\n" + "\\         /\n"
				+ " \\_______/\n" + "-\"-'-\"-'-\"-\n" + "\\         /\n" + " \\_______/\n" + "  _______\n"
				+ " /       \\\n" + "/         \\\n" + "-\"-'-\"-'-\"-\n" + "\\         /\n" + " \\_______/";
		assertEquals(expected, actual);
	}

	@Test
	void EggStopTest() {
		String actual = EggStop.draw();
		String expected = "  ______\n" + " /      \\\n" + "/        \\\n" + "\\        /\n" + " \\______/\n" + "\n"
				+ "  ______\n" + " /      \\\n" + "/        \\\n" + "\\        /\n" + " \\______/\n" + "+--------+\n"
				+ "\n" + "  ______\n" + " /      \\\n" + "/        \\\n" + "|  STOP  |\n" + "\\        /\n"
				+ " \\______/\n" + "+--------+";
		assertEquals(expected, actual);
	}

	@Test
	void FightSongTest() {
		ByteArrayOutputStream actual = new ByteArrayOutputStream();
		PrintStream ps = new PrintStream(actual);
		System.setOut(ps);
		FightSong.draw();
		String expected = "Go, team, go!\n" + "You can do it.\n" + "\n" + "Go, team, go!\n" + "You can do it.\n"
				+ "You're the best,\n" + "In the West.\n" + "Go, team, go!\n" + "You can do it.\n" + "\n"
				+ "Go, team, go!\n" + "You can do it.\n" + "You're the best,\n" + "In the West.\n" + "Go, team, go!\n"
				+ "You can do it.\n" + "\n" + "Go, team, go!\n" + "You can do it.";
		assertEquals(expected, actual.toString());
	}

	@Test
	void LanternsTest() {
		String actual = Lanterns.draw();
		String expected = "    *****\n" + "  *********\n" + "*************\n" + "\n" + "    *****\n" + "  *********\n"
				+ "*************\n" + "* | | | | | *\n" + "*************\n" + "    *****\n" + "  *********\n"
				+ "*************\n" + "\n" + "    *****\n" + "  *********\n" + "*************\n" + "    *****\n"
				+ "* | | | | | *\n" + "* | | | | | *\n" + "    *****\n" + "    *****";
		assertEquals(expected, actual);
	}

	@Test
	void MantraTest() {
		String actual = Mantra.repeat();
		String expected = "There's one thing every coder must understand:\n" + "The System.out.println command.\n"
				+ "\n" + "There's one thing every coder must understand:\n" + "The System.out.println command.";
		assertEquals(expected, actual);
	}

	@Test
	void MetaTest() {
		String actual = Meta.draw();
		String expected = "public class Hello { \n" + "    public static void main(String[] args) { \n"
				+ "        System.out.println(\"Hello, world!\"); \n" + "    } \n" + "}";
		assertEquals(expected, actual);
	}

	@Test
	void MushBetterTest() {
		String actual = MuchBetter.draw();
		String expected = "A \"quoted\" String is\n" + "'much' better if you learn\n"
				+ "the rules of \"escape sequences.\"\n" + "Also, \"\" represents an empty String.\n"
				+ "Don't forget: use \\\" instead of \" !\n" + "'' is not the same as \"";
		assertEquals(expected, actual);
	}

	@Test
	void ShiningTest() {
		String actual = Shining.drawXTenXTen();
		String expected = "";
		for (int i = 0; i < 1000; i++) {
			expected = expected + "All work and no play makes Jack a dull boy.\n";
		}
		assertEquals(expected, actual);
	}

	@Test
	void SpikeyTest() {
		String actual = Spikey.draw();
		String expected = "  \\/\n" + " \\\\//\n" + "\\\\\\///\n" + "///\\\\\\\n" + " //\\\\\n" + "  /\\";
		assertEquals(expected, actual);
	}

	@Test
	void StarFiguresTest() {
		String actual = StarFigures.draw();
		String expected = "*****\n" + "*****\n" + " * *\n" + "  *\n" + " * *\n" + "\n" + "*****\n" + "*****\n" + " * *\n"
				+ "  *\n" + " * *\n" + "*****\n" + "*****\n" + "\n" + "  *\n" + "  *\n" + "  *\n" + "*****\n"
				+ "*****\n" + " * *\n" + "  *\n" + " * *\n";
		assertEquals(expected, actual);
	}

	@Test
	void StewieTest() {
		String actual = Stewie.draw();
		String expected = "//////////////////////\n" + 
				"|| Victory is mine! ||\n" + 
				"\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\";
		assertEquals(expected, actual);
	}

	@Test
	void Stewie2Test() {
		String actual = Stewie2.draw();
		String expected = "//////////////////////\n" + 
				"|| Victory is mine! ||\n" + 
				"\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\n" + 
				"|| Victory is mine! ||\n" + 
				"\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\n" + 
				"|| Victory is mine! ||\n" + 
				"\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\n" + 
				"|| Victory is mine! ||\n" + 
				"\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\n" + 
				"|| Victory is mine! ||\n" + 
				"\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\";
		assertEquals(expected, actual);
	}

	@Test
	void TwoRocketsTest() {
		String actual = TwoRockets.draw();
		String expected = "   /\\       /\\\n" + 
				"  /  \\     /  \\\n" + 
				" /    \\   /    \\\n" + 
				"+------+ +------+\n" + 
				"|      | |      |\n" + 
				"|      | |      |\n" + 
				"+------+ +------+\n" + 
				"|United| |United|\n" + 
				"|States| |States|\n" + 
				"+------+ +------+\n" + 
				"|      | |      |\n" + 
				"|      | |      |\n" + 
				"+------+ +------+\n" + 
				"   /\\       /\\\n" + 
				"  /  \\     /  \\\n" + 
				" /    \\   /    \\\n";
		assertEquals(expected, actual);
	}

	@Test
	void WellFormedTest() {
		String actual = WellFormed.draw();
		String expected = "A well-formed Java program has\n" + 
				"a main method with { and }\n" + 
				"braces.\n" + 
				"\n" + 
				"A System.out.println statement\n" + 
				"has ( and ) and usually a\n" + 
				"String that starts and ends\n" + 
				"with a \" character.\n" + 
				"(But we type \\\" instead!)\n";
		assertEquals(expected, actual);
	}

}

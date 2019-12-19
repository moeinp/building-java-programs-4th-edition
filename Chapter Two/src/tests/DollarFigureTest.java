package tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import exercises.DollarFigure;

class DollarFigureTest {

	@Test
	void test() {
		String exp = "$$$$$$$**************$$$$$$$\n" + 
				"**$$$$$$************$$$$$$**\n" + 
				"****$$$$$**********$$$$$****\n" + 
				"******$$$$********$$$$******\n" + 
				"********$$$******$$$********\n" + 
				"**********$$****$$**********\n" + 
				"************$**$************\n";
		String act = DollarFigure.dollaFig();
		assertEquals(exp,act);
	}

}

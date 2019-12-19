package tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import exercises.DollarFigure2;

class DollarFigure2Test {

	@Test
	void test() {
		String exp  = "$$$$$$$$$$$$$$$$$$$$****************************************$$$$$$$$$$$$$$$$$$$$\n" + 
				"**$$$$$$$$$$$$$$$$$$$**************************************$$$$$$$$$$$$$$$$$$$**\n" + 
				"****$$$$$$$$$$$$$$$$$$************************************$$$$$$$$$$$$$$$$$$****\n" + 
				"******$$$$$$$$$$$$$$$$$**********************************$$$$$$$$$$$$$$$$$******\n" + 
				"********$$$$$$$$$$$$$$$$********************************$$$$$$$$$$$$$$$$********\n" + 
				"**********$$$$$$$$$$$$$$$******************************$$$$$$$$$$$$$$$**********\n" + 
				"************$$$$$$$$$$$$$$****************************$$$$$$$$$$$$$$************\n" + 
				"**************$$$$$$$$$$$$$**************************$$$$$$$$$$$$$**************\n" + 
				"****************$$$$$$$$$$$$************************$$$$$$$$$$$$****************\n" + 
				"******************$$$$$$$$$$$**********************$$$$$$$$$$$******************\n" + 
				"********************$$$$$$$$$$********************$$$$$$$$$$********************\n" + 
				"**********************$$$$$$$$$******************$$$$$$$$$**********************\n" + 
				"************************$$$$$$$$****************$$$$$$$$************************\n" + 
				"**************************$$$$$$$**************$$$$$$$**************************\n" + 
				"****************************$$$$$$************$$$$$$****************************\n" + 
				"******************************$$$$$**********$$$$$******************************\n" + 
				"********************************$$$$********$$$$********************************\n" + 
				"**********************************$$$******$$$**********************************\n" + 
				"************************************$$****$$************************************\n" + 
				"**************************************$**$**************************************\n";
		String act = DollarFigure2.dollaFig();
		assertEquals(exp,act);
	}

}

package exercise;

/*
 * Write a method called getGrade that accepts an integer representing a student's grade in a course and returns that 
 * student's numerical course grade. The grade can be between 0.0 (failing) and 4.0 (perfect). Assume that scores are 
 * in the range of 0 to 100 and that grades are based on the following scale:
 * 
 * 		Score		Grade
 * 		<60			0.0
 * 		60-62		0.7
 * 		63			0.8
 * 		64			0.9
 * 		65			1.0
 * 		...	
 * 		92			3.7
 * 		93			3.8
 * 		94			3.9
 * 		>=95		4.0
 * For an added challenge, make your method throw an IllegalArgumentException if the user passes a grade lower than 0 
 * or higher than 100.
 */public class GetGrade {
	 public static void main(String[] args) {
		 for (int i = 0; i < 101; i++) {
			 System.out.println(getGrade(i));
		 }

	 }

	 public static double getGrade(int grade) {
		 if ((grade < 0) || (grade > 100)) {
			 throw new IllegalArgumentException("grade lower than 0 or higher than 100.");
		 }
		 if (grade >= 95) {
			 return 4.0;
		 } else if (grade == 94) {
			 return 3.9;
		 } else if (grade == 93) {
			 return 3.8;
		 } else if (grade == 92) {
			 return 3.7;
		 } else if (grade == 91) {
			 return 3.6;
		 } else if (grade == 90) {
			 return 3.5;
		 } else if (grade == 89) {
			 return 3.4;
		 } else if (grade == 88) {
			 return 3.3;
		 } else if (grade == 87) {
			 return 3.2;
		 } else if (grade == 86) {
			 return 3.1;
		 } else if (grade == 85) {
			 return 3.0;
		 } else if (grade == 84) {
			 return 2.9;
		 } else if (grade == 83) {
			 return 2.8;
		 } else if (grade == 82) {
			 return 2.7;
		 } else if (grade == 81) {
			 return 2.6;
		 } else if (grade == 80) {
			 return 2.5;
		 } else if (grade == 79) {
			 return 2.4;
		 } else if (grade == 78) {
			 return 2.3;
		 } else if (grade == 77) {
			 return 2.2;
		 } else if (grade == 76) {
			 return 2.1;
		 } else if (grade == 75) {
			 return 2.0;
		 } else if (grade == 74) {
			 return 1.9;
		 } else if (grade == 73) {
			 return 1.8;
		 } else if (grade == 72) {
			 return 1.7;
		 } else if (grade == 71) {
			 return 1.6;
		 } else if (grade == 70) {
			 return 1.5;
		 } else if (grade == 69) {
			 return 1.4;
		 } else if (grade == 68) {
			 return 1.3;
		 } else if (grade == 67) {
			 return 1.2;
		 } else if (grade == 66) {
			 return 1.1;
		 } else if (grade == 65) {
			 return 1.0;
		 } else if (grade == 64) {
			 return 0.9;
		 } else if (grade == 63) {
			 return 0.8;
		 } else if ((grade == 62) || (grade == 61) || (grade == 60)) {
			 return 0.7;
		 } else {
			 return 0.0;
		 }

	 }
 }

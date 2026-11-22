package gradebookArray;

public class main {

	public static void main(String[] args) {
		int[][] gradesArray = {
				{87,96,70},
				{68,87,90},
				{67,56,40},
				{83,45,92},
				{24,67,52},
				{36,74,17},
				{73,62,76},
				{35,75,86},
				{84,36,73},
				{73,98,100}
		};
		
		GradeBook myGradeBook = new GradeBook("CS 101 Introduction to Java Programming", gradesArray);
		myGradeBook.displayMessage();
		myGradeBook.processGrades();

	}

}

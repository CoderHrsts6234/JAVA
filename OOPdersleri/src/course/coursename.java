package course;
import java.util.Scanner;

public class coursename {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		GradeBook myGradeBook = new GradeBook();
		
		System.out.printf("Please enter a course name: ");
		
		String name = scanner.nextLine();
		
		myGradeBook.setCourseName(name);
		
		myGradeBook.displayMessage();
		
	}

}

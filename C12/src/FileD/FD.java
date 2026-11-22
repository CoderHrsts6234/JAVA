package FileD;

import java.io.File;
import java.util.Scanner;

public class FD {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Enter file or directory name: ");
		analyzePath(scan.nextLine());
	}

	public static void analyzePath(String path) {
		File name = new File(path);
		
		if(name.exists()) {
			System.out.printf("%s%s\n%s\n%s\n%s%s\n%s%s\n%s%s\n%s%s",
					name.getName(), "exists",
					(name.isFile() ? "is a fale" : "is not a file"),
					(name.isDirectory() ? "is a dir" : "is not a dir"), 
					(name.isAbsolute() ? "is a abs" : "is not a abs"),
					"Last modified: ", name.lastModified(), "Length: ", name.length(),
					"Path: ", name.getPath(), "Absolute path: ", name.getAbsolutePath(), "Parent: ", name.getParent());
			
			if(name.isDirectory()) {
				String[] directory = name.list();
				System.out.println("\n\nDirectory contents:\n");
				
				for(String directoryName : directory) System.out.println(directoryName);
			}
		}
	}
}

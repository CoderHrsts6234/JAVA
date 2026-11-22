package OOPF4;

import java.io.*;

public class SGM {

	public static void main(String[] args) {
		String input = "grades.txt";
		String output = "results.txt";
		
		try( FileInputStream fis = new FileInputStream(input);
			FileOutputStream fos = new FileOutputStream(output)){
			
			int character;
			String line = "";
			
			while((character = fis.read()) != -1) {
				if(character == '\n') {
					processLine(line, fos);
					line = "";
				}else {
					line += (char) character;
				}
			}
			
			if(!line.isEmpty()) {
				processLine(line, fos);
			}
			
            System.out.println("İşlem tamamlandı. results.txt dosyasını kontrol edin.");
		} catch (FileNotFoundException e) {
            System.err.println("Hata: Dosya bulunamadı!");

		}

	}
	
	public static void processLine(String line, FileOutputStream fos) throws IOException {
		line = line.trim();
		if(line.isEmpty()) return;
		
		String[] parts = line.split(",");
		if(parts.length != 2) {
			throw new IllegalArgumentException("Geçersiz format: " + line);
		}
		
		String name = parts[0].trim();
		String gradeStr = parts[1].trim();
		
		int grade = 0;
		
		for(int i = 0; i < gradeStr.length(); i++) {
			char c = gradeStr.charAt(i);
			if('0' > c || c > '9') {
				throw new IllegalArgumentException("Geçersiz format: " + line);
			}
			grade = grade * 10 + (c - '0');
		}
		
		String status = (grade >= 41) ? "Pass" : "Fail";
		String result = name + ": " + status + "\n";
		fos.write(result.getBytes()); 
	}

}

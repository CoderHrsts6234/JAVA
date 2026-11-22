package OOPF4;

import java.io.*;

public class StudentGradesManager {

    public static void main(String[] args) {
        
        String inputFile = "grades.txt";
        String outputFile = "results.txt";
        
        try (FileInputStream fis = new FileInputStream(inputFile);
             FileOutputStream fos = new FileOutputStream(outputFile)) {
            
            int character;
            String line = "";
            
            while ((character = fis.read()) != -1) {
                if (character == '\n') {
                    processLine(line, fos);
                    line = "";
                } else {
                    line += (char) character;
                }
            }
            
            if (!line.isEmpty()) {
                processLine(line, fos);
            }
            
            System.out.println("İşlem tamamlandı. results.txt dosyasını kontrol edin.");
            
        } catch (FileNotFoundException e) {
            System.err.println("Hata: Dosya bulunamadı!");
        } catch (IOException e) {
            System.err.println("Hata: Bir I/O hatası oluştu: " + e.getMessage());
        } catch (IllegalArgumentException e) {
            System.err.println("Veri Hatası: " + e.getMessage());
        }
    }
    
    private static void processLine(String line, FileOutputStream fos) throws IOException {
        line = line.trim();
        if (line.isEmpty()) return;

        String[] parts = line.split(",");
        
        if (parts.length != 2) {
            throw new IllegalArgumentException("Geçersiz format: " + line);
        }
        
        String name = parts[0].trim();
        String gradeStr = parts[1].trim();
        
        int grade = 0;
        for (int i = 0; i < gradeStr.length(); i++) {
            char c = gradeStr.charAt(i);
            if (c < '0' || c > '9') {
                throw new IllegalArgumentException("Geçersiz not (" + name + "): " + gradeStr);
            }
            grade = grade * 10 + (c - '0');
        }
        
        String status = (grade >= 50) ? "Pass" : "Fail";
        String result = name + ": " + status + "\n";
       fos.write(result.getBytes());
    }
}
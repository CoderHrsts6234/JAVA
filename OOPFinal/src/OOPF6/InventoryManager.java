package OOPF6;

import java.io.*;
import java.util.Scanner;

public class InventoryManager {
	public static void main(String[] args) {
		try {
			File inputFile = new File("products.txt");
			Scanner reader = new Scanner(inputFile);
			FileWriter writer = new FileWriter("inventory_report.txt");
			
			while(reader.hasNext()) {
				String name = reader.next();
				double price = reader.nextDouble();
				int stock = reader.nextInt();
				
				double totalValue = price * stock;
				writer.write(name + " Toplam Değer: " + totalValue + "\n");
			}
			reader.close();
			writer.close();
		} catch(Exception e) {
			System.out.println("Dosya okuma veya yazma hatası!");
		}
	}
}

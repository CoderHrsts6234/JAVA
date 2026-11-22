package Scanner;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /*
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your name: ");
        String name = scanner.nextLine();

        System.out.println("Your name: " + name);
        
        */
    	
    	/*
    	Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your age: ");
        int age = scanner.nextInt();

        System.out.println("Your age: " + age);
    	*/
    	
    	/* 
    	Scanner scanner = new Scanner(System.in);

        int num = scanner.nextInt();
        
        if (num < 100) {
        	System.out.println("Your value less than 100");
        }
		System.out.println("The program is done");
        */
    	
    	Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your age: ");
        int age = scanner.nextInt();
        scanner.nextLine(); // Oluşan hatanın önüne geçmek için uygulama
        
        System.out.println("Enter your name: ");
        String name = scanner.nextLine();
        
        
        System.out.println("Your age: " + age + ", Your name: " + name);
    	
    }
}

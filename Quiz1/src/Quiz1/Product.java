package Quiz1;
import java.util.Scanner;

public class Product {
    Scanner scan = new Scanner(System.in);
    
    private String product = "Samsung Watch";
    private int theSW = 10;
    private int card;
    
    public void displayMessage() {
        System.out.println("Welcome to our shop,");
        System.out.println("These are the products: " + product);
        System.out.println("Pick one: ");
    }
    
    public void scanClass1() {
        String choose = scan.nextLine();
    }
    
    public void displayMessage2() {
        System.out.println("The quantity of products available is: " + theSW);
        System.out.print("Please enter a number between 1 and " + theSW + ": ");
    }
    
    public void scanClass2() {
        card = scan.nextInt();
        scan.nextLine(); 
    }
    
    public void checkStock() {
        if (card >= 1 && card <= theSW) {
            System.out.println("Well done! Do you want to go to your basket? (if yes, press 1)");
            int choice = scan.nextInt();
            
            if (choice == 1) {
                System.out.println("Entering to basket...");
            } else {
                System.out.println("Okay, you stayed in product page.");
            }
        } else {
            System.out.println("This is over from the stock!");
        }
    }
    
}

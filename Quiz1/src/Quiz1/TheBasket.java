package Quiz1;
import java.util.Scanner;

public class TheBasket {
	Scanner input = new Scanner(System.in);
    private long cardNum = 0;
    private int totalCard = 16;
    
    public void displayMessage3() {
        System.out.println("Please enter your card numbers (IBAN)!");
        cardNum = input.nextLong();
        
        String cardStr = String.valueOf(cardNum);
        
        if (cardStr.length() != totalCard) {
            System.out.println("The card number must be 16!");
        } else {
            System.out.println("Purchase successful!");
        }
    }
}

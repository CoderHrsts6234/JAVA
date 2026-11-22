package chapter6;

import java.util.Random;
import java.util.Random.*;
public class Craps {
	private static final Random RANDOM_NUMBERS = new Random();
	
	private enum Status {CONTINUE, WON, LOST}; //Enum kullanımı bir kategori gibidir, değişmez
	
	private static final int SNAKE_EYES = 2;
	private static final int TREY = 3;
	private static final int SEVEN = 7;
	private static final int YO_LEVEN = 11;
	private static final int BOX_CARS = 12;
	
	public static void main( String[] args) {
		int myPoint = 0;
		Status gameStatus; 
		
		int SUM_OF_DICE = rollDice();
		
		switch (SUM_OF_DICE) {
		case SEVEN:
		case YO_LEVEN:
			gameStatus = Status.WON;
			break;
		case SNAKE_EYES:
		case TREY:
		case BOX_CARS:
			gameStatus = Status.LOST;
			break;
		default:
			gameStatus = Status.CONTINUE;
			myPoint = SUM_OF_DICE;
			break;
		}
		
		while (gameStatus == Status.CONTINUE) {
			SUM_OF_DICE = rollDice();
			
			if(SUM_OF_DICE == myPoint) gameStatus = Status.WON;
			else if(SUM_OF_DICE == SEVEN) gameStatus = Status.LOST;
		}
		
		if(gameStatus == Status.WON) System.out.println("Player wins");
		else System.out.println("Player loses");
		
	}
	
	public static int rollDice() {
		int die1 = 1 + RANDOM_NUMBERS.nextInt(6);
		int die2 = 1 + RANDOM_NUMBERS.nextInt(6);
		
		int sum = die1 + die2;
		
		System.out.printf("Player rolled %d + %d = %d\n", die1, die2, sum);
		return sum;
	}
	
}

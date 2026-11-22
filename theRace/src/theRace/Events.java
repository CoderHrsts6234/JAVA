package theRace;
import java.util.concurrent.ThreadLocalRandom;
import java.util.Scanner;

public class Events {
	
	Scanner scan = new Scanner(System.in);
	
	//başlangıç konumları
	int positionOfT = 1, positionOfH = 1;
	
	// 70 adet bellekte boş alan
	public static char[] area() {
	char area[] = new char[70];
	
	for (int a = 0; a < area.length; a++) {
	    area[a] = ' ';
	}
	return area;
	}
	
	// Tavşan ve Kaplumbağa adına hareket mekanizması
	public void updatePosition() {
		int TMoves = ThreadLocalRandom.current().nextInt(1, 11);
		
		if(TMoves <= 5) {
			positionOfT += 3;
		} else if(TMoves <= 7) {
			positionOfT -= 6;
		} else { 
	        positionOfT += 1;
	    }
		
		 if (positionOfT < 1) {
		        positionOfT = 1;
		    }
		 
		int HMoves = ThreadLocalRandom.current().nextInt(1, 11); 
		
		if(HMoves <= 2) {
			positionOfH += 0;
		} else if(HMoves <= 4) {
			positionOfH += 9;
		} else if(HMoves <= 5) {
			positionOfH -= 12;
		} else if(HMoves <= 8) {
			positionOfH += 1;
		} else {
			positionOfH -= 2;
		} 

		 if (positionOfH < 1) {
		        positionOfH = 1;
		    }
	}
	
	//T ve K için pozisyon ayarlama
	public void position() {
		
		char[] currentPosition = area();
		
		
		if(positionOfT == positionOfH) {
			String ouch = "OUCH!!!";
			int start = positionOfT - 1;
			
			for (int i = 0; i < ouch.length(); i++) {
				if (start + i < currentPosition.length) {
					currentPosition[start + i] = ouch.charAt(i);
				} else {
					break;
				}
			}
		} else {
			if (positionOfT - 1 < currentPosition.length) {
	            currentPosition[positionOfT - 1] = 'T';
	        }
	        if (positionOfH - 1 < currentPosition.length) {
	            currentPosition[positionOfH - 1] = 'H';
	        }
		}
		System.out.println(currentPosition);
		
	}
	
	// yarışa başlama
	
	public void startRace() {
		System.out.println("BANG !!!!! AND THEY'RE OFF !!!!!");
		
		System.out.println("-> Yarışı başlatmak için Enter'a basın...");
	    scan.nextLine();
		
        while (positionOfT < 70 && positionOfH < 70) {
            updatePosition();
            position();
            
            System.out.println("Please press \"Enter\" for next turn...");
            scan.nextLine();
        }
        
        endRace();
        scan.close();
	}
	
	// yarışı bitirme
	
    public void endRace() {
    	
    	System.out.println("\nTHE RACE IS OVER!");

        if (positionOfT >= 70 && positionOfH >= 70) {
            System.out.println("It's a tie.");
        } else if (positionOfT >= 70) {
            System.out.println("TORTOISE WINS!!! YAY!!!");
        } else {
            System.out.println("HARE WINS. YUCH.");
        }
    }

}
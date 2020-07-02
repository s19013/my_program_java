package blackjack5;
import java.util.Scanner;

public class PlayerDeck extends Deck {
	private boolean Checker = true;
	Scanner scan = new Scanner(System.in);
	public boolean Choice(){
		while (Checker) {
			String str1 = scan.next("HIT or STAND:");
			str1.toUpperCase();
			if (str1.equals("H") || str1.equals("HIT") ||str1.equals("S") || str1.equals("STAND")) {
				Checker=false;
			}
			else {
				System.out.println("入力し直してください");
			}
		}
		return str1.equals("H");
	}
}

package blackjack3;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Collections;
import java.util.Scanner;

public class Test {

	public static Card card = new Card();
	public static Com com = new Com();
	public static Player player = new Player();

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		card.start();
		CardStartCheck();
		CardGiveCheck();
	}

	public static void CardStartCheck() {
			System.out.println(card.Box);
	}

	 public static void CardGiveCheck() {
		 for (int i=1;i<6 ;i++ ) {
			 System.out.print(i+"回目 ");
			 System.out.println(card.give());
		 }
		 System.out.println(card.Box);
	 }

}

package blackjack3;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Collections;
import java.util.Scanner;

public class Test {

	private  static Card card = new Card();
	private  static Com com = new Com();
	private  static Player player = new Player();

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		card.start();
		// CardStartCheck();
		// CardGiveCheck();
		Comcheck();
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

	public static void PlayerCheck(){
		player.reset();
		player.setter(card.give());
		player.setter(card.give());
		player.check();
		boolean choice = player.choice();
		if (choice == true) {
			System.out.println("hit");
		}
		else {
			System.out.println("stand");
		}
		boolean check = player.check();
		if (check == true) {
			System.out.println("burst");
		}
		else {
			System.out.println("safe");
		}
		System.out.println(player.getsum());
		// System.out.println("choice:"+player.choice());
		// System.out.println("check:"+player.check());

	}

	public static void Comcheck(){
		com.reset();
		com.setter(card.give());
		com.setter(card.give());
		com.check();
		boolean choice = com.choice();
		if (choice == true) {
			System.out.println("hit");
		}
		else {
			System.out.println("stand");
		}
		boolean check = com.check();
		if (check == true) {
			System.out.println("burst");
		}
		else {
			System.out.println("safe");
		}
		System.out.println(com.getsum());
	}
}
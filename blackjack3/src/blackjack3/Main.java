package blackjack3;
import java.util.Scanner;


public class Main {
	public static Card card = new Card();
	public static Com com = new Com();
	public static Player player = new Player();
	public static boolean CanBattle = true;
	public static boolean playing = true;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		while (playing == true) {
			game();
			playing = retry();
		}
	}

	public static void reset(){
		CanBattle = true;
		com.reset();
		player.reset();
	}

	public static void start(){
		card.start();
		for (int i = 0;i<2 ;i++) {
			com.setter(card.give());
			player.setter(card.give());
		}
		com.check();
		player.check();
	}

	public static void PlayerChoice(){
		if (player.choice() == true) {
			player.setter(card.give());
			if (player.check()==false) {
				PlayerChoice();
			}
			else if (player.check() == true) {
				System.out.println("バーストしたのでもう引けません");
			}
		}
	}

	public static void ComChoice(){
		if (com.choice() == true) {
			com.setter(card.give());
			if (com.check()==false) {
				ComChoice();
			}
		}
	}

	public static void burst(){
		if (com.check() == true & player.check() == true) {
			CanBattle = false;
			System.out.println("両者共にバーストしたので引き分け");
		}
		else if (com.check() == true) {
			CanBattle = false;
			System.out.println("コンピュータがバーストしました");
			result("プレイヤー");
		}
		else if (player.check() == true) {
			CanBattle = false;
			System.out.println("あなただけがバーストしました");
			result("コンピュータ");
		}
	}

	public static void battle(){
		int C = com.getsum();
		int P = player.getsum();
		System.out.println("プレイヤー:"+P+" "+"コンピュータ:"+C);
		if (C > P) {
			result("コンピュータ");
		}
		else if (C <P) {
			result("プレイヤー");
		}
		else{
			result("draw");
		}
 	}

	public static void result(String winner){
		if (winner == "draw") {
			System.out.println("引き分け");
		}
		else {
			System.out.println(winner+"の勝ち");
		}
	}

	public static boolean retry(){
		boolean answer = true;
		System.out.println("もう一度やりますか");
		Scanner scan = new Scanner(System.in);
    String str = scan.nextLine();
		str.toLowerCase();
		if (str.equals("yes") || str.equals("y")) {
			answer=true;
		}
		else if (str.equals("n") || str.equals("no")) {
			answer=false;
		}
		else {
			System.out.println("入力し直し");
			retry();
		}
		return answer;
	}

	public static void game(){
		reset();
		start();
		burst();
		if (CanBattle == true) {
			System.out.println("プレイヤーのターンです");
			PlayerChoice();
			ComChoice();
			burst();
		}
		if (CanBattle == true) {
			battle();
		}
		else {
		}
	}

}

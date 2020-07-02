package blackjack5;
import java.util.ArrayList;

public class Test {
	static MasterCards mc = new MasterCards();
	static PlayerDeck pd = new PlayerDeck();
	public static void main(String[] args) {
		mc.setUP();
		TestBlackJack();
	}

	public static void TestShowCards(){
		mc.dbshowCards();
	}

	public static void TestGiveCard(){
		// ArrayList <String> box = new ArrayList<>();
		String [] box = mc.giveCard();
		for (String b:box ) {
			System.out.println(b);
		}
	}

	public static void TestShowCardsSize(){
		mc.dbShowCardsSize();
	}

	public static void TestShowPlayerDeck(){
		pd.getCard(mc.giveCard());
		pd.getCard(mc.giveCard());
		pd.dbshowDeck();
	}

	public static void TestPlayerdeckSum(){
		System.out.println(pd.sum());
	}

	public static void TestPlayerdeckBurst(){
		System.out.println(pd.burst());
	}

	public static void TestPlayerdeckStream(){
		TestShowPlayerDeck();
		TestPlayerdeckSum();
		TestPlayerdeckBurst();
	}

	public static void TestCheckAce(){
		String[] box = {"S","A","1"};
		pd.getCard(box);
		System.out.println(pd.CheckAce());
	}

	public static void TestCheckJQK(){
		String[] box = {"S","J","10"};
		pd.getCard(box);
		System.out.println(pd.CheckJQK());
	}

	public static void TestBlackJack(){
		String[] box = {"S","J","10"};
		String[] box2 = {"S","A","1"};
		pd.getCard(box);
		pd.getCard(box2);
		System.out.println(pd.BlackJack());
	}
}

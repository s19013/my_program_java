package blackjack5;

import java.util.ArrayList;
import java.util.Collections;

public abstract class Deck implements DeckInterface {
	private ArrayList<ArrayList<String>> Cards = new ArrayList<ArrayList<String>>();

	@Override
	public void getCard(String[] arg) {
		ArrayList <String> box = new ArrayList<>();
		for (String s:arg ) {
			box.add(s);
		}
		Cards.add(box);
	}

	@Override
	public boolean burst() {
		return sum()>21;
	}

	@Override
	public int sum() {
		int result = 0;
		String s ="";
		for (int i = 0;i<Cards.size() ;i++) {
			s=Cards.get(i).get(2);
			result += Integer.parseInt(s);
		}
		return result;
	}

	@Override
	public boolean CheckAce() {
		ArrayList <String> box = new ArrayList<>();
		for (int i=0;i<Cards.size() ;i++) {
			box.add(Cards.get(i).get(1));
		}
		return box.contains("A");
	}

	@Override
	public boolean CheckJQK() {
		ArrayList <String> box = new ArrayList<>();
		for (int i=0;i<Cards.size() ;i++) {
			box.add(Cards.get(i).get(1));
		}
		return box.contains("J") || box.contains("Q") || box.contains("K");
	}

	@Override
	public boolean BlackJack() {
		return CheckAce()==true && CheckJQK()==true && burst()==false ;
	}

	@Override
	public void dbshowDeck() {
		System.out.println(Cards);
	}

}

package blackjack5;

public class Com extends player {

	@Override
	public boolean Choice() {
		return Sum()<17;
	}

}

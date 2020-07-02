package blackjack5;

public interface DeckInterface {
  public void getCard(String[] arg);
  public boolean burst();
  public int sum();
  public boolean CheckAce();
  public boolean CheckJQK();
  public boolean BlackJack();
  public void dbshowDeck();
}

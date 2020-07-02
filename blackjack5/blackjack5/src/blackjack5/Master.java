package blackjack5;

public class Master {
  MasterCards mc = new MasterCards();
  Human h = new Human();
  Com c = new Com();

  public void Reset(){
    mc.setUP();
    h.Reset();
    c.Reset();
  }

  public void HumanTurn(){
    h.getCard(mc.giveCard());
    h.getCard(mc.giveCard());
    
  }
}

package blackjack4;

public class Com extends Player{
  // public Com(){
  //   super();
  // }

  public Boolean choice(){
    if (getsum()<= 17) {
      return true;
    }
    else {
      return false;
    }
  }
}

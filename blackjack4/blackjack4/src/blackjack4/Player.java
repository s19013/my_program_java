package blackjack4;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Collections;
import java.util.Scanner;

public class Player {
  private List<Integer> deck = new ArrayList<Integer>();
  // public Player(){
  //   this.deck = new ArrayList<Integer>();
  // }

  public void reset(){
    deck.clear();
  }

  public void setter(int A){
    deck.add(A);
  }

  public  Boolean check(){
    if (getsum() >= 22) {
      return true;
    }
    else{
      return  false;
    }
  }

  public  int getsum(){
    int sum = 0;
    for (int i=0;i<deck.size();i++ ) {
      sum += deck.get(i);
    }
    return sum;
  }

  public  Boolean choice(){
    boolean InOk = false;
    Boolean answer = false;
    while (InOk == false) {
      System.out.println(deck);
      System.out.println("あなたの合計" + getsum());
      System.out.println("hit or stand? (hかsを入力してEnterキーを押してください)");
      Scanner scan = new Scanner(System.in);
      String str = scan.nextLine();
      str.toLowerCase();
      if (str.equals("h") || str.equals("hit")) {
        answer = true;
        InOk = true;
      }
      else if (str.equals("s") || str.equals("stand") ) {
        answer = false;
        InOk = true;
      }
      else{
        System.out.println("入力し直してください");
      }
    }
    return answer;
  }
// db
  public void pldeck(){
    System.out.println(deck);
  }

}

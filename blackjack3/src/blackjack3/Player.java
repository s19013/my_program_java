package blackjack3;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Collections;
import java.util.Scanner;


public class Player {
  private  ArrayList<Integer> deck = new ArrayList<Integer>();
  private  int sum = 0;
  private String name;

  public void setname(String name){
    this.name = name;
  }

  public String getname(){
    return this.name;
  }

  public void reset(){
    this.deck.clear();
  }

  public void setter(int A){
    this.deck.add(A);
  }
  public  Boolean check(){
    this.sum = 0;
    for (int i=0;i<this.deck.size();i++ ) {
      this.sum += this.deck.get(i);
    }
    if (this.sum >= 22) {
      return true;
    }
    else{
      return  false;
    }
  }

  public  int getsum(){
    return this.sum;
  }

  public  Boolean choice(){
    Boolean answer = false;
    System.out.println(this.deck);
    System.out.println("あなたの合計" + this.sum);
    System.out.println("hit or stand? (hかsを入力してEnterキーを押してください)");
    Scanner scan = new Scanner(System.in);
    String str = scan.nextLine();
    str.toLowerCase();
    if (str.equals("h") || str.equals("hit")) {
      answer = true;
    }
    else if (str.equals("s") || str.equals("stand") ) {
      answer = false;
    }
    else{
      System.out.println("入力し直してください");
      choice();
    }
    return answer;
  }

  // public  Boolean answer(boolean A){
  //   if (A == true) {
  //     return true;
  //   }
  //   else{
  //     return false;
  //   }
  // }
}

package blackjack3;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Collections;
import java.util.Scanner;
import java.util.Random;


public class Player1 {
  private static ArrayList<Integer> deck = new ArrayList<Integer>();
  private static int sum = 0;
  private String name;

  public void setname(String name){
    this.name = name;
  }

  public String getname(){
    return this.name;
  }

  public static void reset(){
    deck.clear();
  }

  public static void setter(int A){
    deck.add(A);
  }

  public static Boolean choice(){
    Boolean answer = false;
    System.out.println(deck);
    System.out.println("あなたの合計" + sum);
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

  public static Boolean check(){
    sum = 0;
    for (int i=0;i<deck.size();i++ ) {
      sum += deck.get(i);
    }
    if (sum >= 22) {
      return true;
    }
    else{
      return  false;
    }
  }

  public static int getsum(){
    return sum;
  }

  // public static Boolean answer(boolean A){
  //   if (A == true) {
  //     return true;
  //   }
  //   else{
  //     return false;
  //   }
  // }
}

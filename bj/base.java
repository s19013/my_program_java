import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Collections;
import java.util.Scanner;

public class base{
  public static void start() {
    List<Integer> deck = new ArrayList<Integer>();
    for (int i =1; i <= 4; i++ ){
      for (int a=1;a<=13 ;a++ ) {
        deck.add(a);
      }
    }
    Collections.shuffle(deck);
    //System.out.println(deck);db
    List<Integer> mycard = new ArrayList<Integer>();
    List<Integer> enecard = new ArrayList<Integer>();
    int mycard_sum = 0;
    int enecard_sum = 0;
    //カードを配る
    for (int i=0;i<2 ;i++ ) {
      int a=deck.get(0);
      int b=deck.get(1);
      mycard.add(a);
      enecard.add(b);
      mycard_sum +=a;
      enecard_sum += b;
      deck.remove(0);
      deck.remove(1);
    }

    if (mycard_sum > 21) {
      end();
    }
    while (true) {
      if (mycard_sum > 21) {
        end();
        break;
      }
      System.out.println("\nmycard:"+ mycard);
      System.out.println("mycard_sum:"+mycard_sum);
      System.out.println("hit or stand?");
      Scanner scan = new Scanner(System.in);
      String str = scan.next();
      if (str.equals("h")|| str.equals("hit")) {
        int a=deck.get(0);
        mycard.add(a);
        mycard_sum +=a;
        deck.remove(0);
      }
      else if (str.equals("s") || str.equals("stand")) {
        break;
      }
      else {
        System.out.println("入力し直し");
      }
    }
    while (enecard_sum <16) {
      int a=deck.get(0);
      enecard.add(a);
      enecard_sum +=a;
      deck.remove(0);
    }
    if (enecard_sum >21) {
      eneend();
    }
    String winner ="a";
    if (mycard_sum > enecard_sum) {
      winner = "あなた";
    }else if (mycard_sum < enecard_sum) {
      winner = "敵";
    }
    System.out.println("mycard:"+ mycard + "    enecard:" + enecard);
    System.out.println("mycard_sum:"+mycard_sum + "     enecard_sum:" + enecard_sum);
    System.out.println(winner+"の勝ちです");


    // deb System.out.println(deck);




  }
  public static void end(){
    System.out.println("burst");
  }
  public static void eneend(){
    System.out.println("eneburst");
  }
  public static void ret(){
    System.out.println("続けますか？ y/n");
    Scanner scan = new Scanner(System.in);
    String str = scan.next();
    if (str.equals("y") || str.equals("yes")) {
      start();
    }
    else if (str.equals("n") || str.equals("no"))
    {
      System.exit(0);
    }
    else
    {
      ret();
    }
  }


}

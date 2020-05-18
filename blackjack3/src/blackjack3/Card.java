package blackjack3;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Collections;
import java.util.Scanner;
import java.util.Random;

public class Card {
  public static ArrayList<Integer> Box = new ArrayList<Integer>();
  public static void start(){
    for (int i=0; i < 4; i++) {
      for (int a=1; a <= 13; a++) {
        Box.add(a);
      }
    }
  }

  public static Integer give(){
    Random random = new Random();
    int randomValue = random.nextInt(Box.size());
    int g = Box.get(randomValue);
    Box.remove(randomValue);
    // System.out.println("random "+randomValue);//debug
    return g;
  }
}
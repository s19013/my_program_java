import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Enemy
{
  /*
  1、カードを2枚もらう
  2、16を超えるまで引く
  3、相手より合計が多ければいい
  4、21を超えたらだめ
  */
  public static ArrayList<Integer> box_for_sum = new ArrayList<Integer>();
  public static ArrayList box = new ArrayList();
  public static int sum = 0;
  public static String mark = "null";
  public static int number = 0;
  public static void start()
  {
    for (int i=1 ; i<=2 ;i++)
    {
      mark = Card.get_mark();
      if (mark == "JOKER")
      {
        mark = Card.get_mark();
      }
      number = Card.get_number();
      box_for_sum.add(number);
      sum += number;
      box.add(mark + number);
    }
    if (sum > 21)
    {
      System.out.println("相手がバーストしました\nあなたの勝ちです");
      Master.cont();
    }
    // System.out.println(box_for_sum);
    // System.out.print(box);
    // System.out.println("  合計" + sum);
    draw();
  }

  public static void draw()
  {
    if (sum < 16)
    {
      mark = Card.get_mark();
      if (mark == "JOKER")
      {
        mark = Card.get_mark();
      }
      number = Card.get_number();
      box_for_sum.add(number);
      sum += number;
      if (sum > 21)
      {
        System.out.println("相手がバーストしました\nあなたの勝ちです");
        Master.cont();
      }
      else
      {
        box.add(mark + number);
        draw();
      }
    }
    else
    {
      Master.battle();
    }
  }
  public static void print_box()
  {
    System.out.print("敵: ");
    System.out.print(box);
    System.out.println("  合計" + sum);
  }
  public static int get_sum()
  {
    return sum;
  }

  public static void reset()
  {
    sum = 0;
    mark = "null";
    number = 0;
    box.clear();
    box_for_sum.clear();

  }
}

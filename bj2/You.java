import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;


public class You
{
  /*
  1、カードを2枚もらう
  2、場合によってはカードを増やす
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
      System.out.println("burst");
      Master.cont();
    }
    // System.out.println(box_for_sum);
    System.out.print("\n" + box);
    System.out.println("  合計" + sum);
    choice();
  }

  public static void choice()
  {
    System.out.println("hit or stand?  [h/s]");
    Scanner scan = new Scanner(System.in);
    String str = scan.next();
    if (str.equals("h"))
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
        System.out.println("burst");
        Master.cont();
      }
      else
      {
        box.add(mark + number);
        System.out.print(box);
        System.out.println("  合計" + sum);
        choice();
      }
    }
    else if (str.equals("s"))
    {
      Enemy.start();
    }
    else
    {
      choice();
    }
  }

  public static void print_box()
  {
    System.out.print("\nあなた: ");
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

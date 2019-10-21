import java.util.Scanner;

public class Master
{
  public static void gamestart()
  {
    You.start();
  }
  public static void cont()
  {
    System.out.println("\n続けますか？ [y/n]");
    Scanner scan = new Scanner(System.in);
    String str = scan.next();
    if (str.equals("y") || str.equals("yes"))
    {
      You.reset();
      Enemy.reset();
      Card.check();
      gamestart();
    }
    else if (str.equals("n") || str.equals("no"))
    {
      System.exit(0);
    }
    else
    {
      cont();
    }
  }
  public static void battle()
  {
    You.print_box();
    Enemy.print_box();
    if (You.get_sum() > Enemy.get_sum())
    {
      System.out.println("あなたの勝ちです");
      cont();
    }
    else if (You.get_sum() < Enemy.get_sum())
    {
      System.out.println("あなたの負けです");
      cont();
    }
    else
    {
      System.out.println("引き分け");
      cont();
    }

  }
}

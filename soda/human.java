import java.util.Scanner;

public class human
{
  public static Integer shake;
  public static String name;
  human(String in_name)
  {
    name = in_name;
  }
  public static void shake()
  {
    Scanner scan = new Scanner(System.in);
    System.out.println("何回振りますか");
    shake = scan.nextInt();
    if (shake <= 0)
    {
      System.out.println("0以上入力して");
      shake();
    }
    else
    {
      System.out.println("あなたは" + shake + "回振った");
      soda.set_shake_count(name,shake);
    }
  }

}

import java.util.Scanner;

public class you
{
  public static void in()
  {
    Scanner sc = new Scanner(System.in);
    System.out.println("");
    System.out.print("y=");
    int y = sc.nextInt();

    System.out.print("x=");
    int x = sc.nextInt();
    if ((y<4 && y>0) || (x<3 && x>-1))
    {
      master.youset(x, y);
    }
    else
    {
      System.out.println("");
      System.out.println("やり直し");
      in();
    }
  }
}

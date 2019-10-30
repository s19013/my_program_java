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
    if (y>3 || y<0 || x>3 || x<0)
    {
      System.out.println("");
      System.out.println("やり直し");
      in();
    }
    else
    {
      master.youset(x, y);
    }
  }
}

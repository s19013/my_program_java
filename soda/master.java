import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Random;
import java.util.Collections;
import java.util.Scanner;


public class  master
{
  public static int how_meny;
  public static ArrayList<String> box;
  public static int limit;
  public static int how_meny_com1;
  public static int how_meny_com2;
  public static int how_meny_com3;
  public static human p = new human("あなた");
  public static com1 c1 = new com1("c1-1");
  public static com2 c2 = new com2("c2-1");

  public static void gamestart()
  {
    box = new ArrayList<String>();
    box.add("p");
    box.add("c1");
    box.add("c2");
    Collections.shuffle(box);
  }


  public static void game()
  {
    shake(box.get(0));
    shake(box.get(1));
    shake(box.get(2));
    game();
  }

  public static void shake(String name)
  {
    limit = soda.getlimit();
    if (limit > 0)
    {
      switch (name)
      {
        case "p":
        p.shake();
        break;
        case "c1":
        c1.shake();
        break;
        case "c2":
        c2.shake();
        break;
      }
    }
  }

  public static void gameset(String name)
  {
    System.out.println(name + "の負け");
    System.exit(0);

  }

  // public static void cont()
  // {
  //   Scanner cont = new Scanner(System.in);
  //   System.out.println("continue");
  // }

  // public static void order()
  // {
  //   Random rand = new Random();
  //   how_meny = rand.nextInt(3)+3;
  //
  // }
}

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Random;
import java.util.Collections;
import java.util.Scanner;


public class  master
{
  public static ArrayList<String> box;
  public static int limit;
  public static int how_meny;
  public static int how_meny_com1;
  public static int how_meny_com2;
  public static int how_meny_com3;
  public static int menber;
  public static human p = new human("あなた");
  public static com1 c1 = new com1("c1-1");
  public static com1 c2 = new com1("c1-2");
  public static com2 c3 = new com2("c2-1");
  public static com2 c4 = new com2("c2-2");
  public static com3 c5 = new com3("c3-1");
  public static com3 c6 = new com3("c3-2");


  public static void gamestart()
  {
    box = new ArrayList<String>();
    box.add("p");
    Random rand = new Random();
    menber= rand.nextInt(4);
    switch (menber)
    {
      case 0:
        box.add("c1");
        box.add("c3");
        box.add("c5");
        break;
      case 1:
        box.add("c1");
        box.add("c2");
        box.add("c5");
        break;
      case 2:
        box.add("c2");
        box.add("c4");
        box.add("c5");
        break;
      case 3:
        box.add("c1");
        box.add("c2");
        box.add("c3");
        break;
    }
    Collections.shuffle(box);
  }


  public static void game()
  {
    shake(box.get(0));
    shake(box.get(1));
    shake(box.get(2));
    shake(box.get(3));
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
        case "c3":
        c3.shake();
        break;
        case "c4":
        c4.shake();
        break;
        case "c5":
        c5.shake();
        break;
        case "c6":
        c6.shake();
        break;
      }
    }
  }

  public static void gameset(String name)
  {
    System.out.println("爆発した");
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

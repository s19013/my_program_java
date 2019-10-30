import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class master
{
  public static List<String> r1 = new ArrayList<String>();
  public static List<String> r2 = new ArrayList<String>();
  public static List<String> r3 = new ArrayList<String>();
  public static List<Integer> ir1 = new ArrayList<Integer>();
  public static List<Integer> ir2 = new ArrayList<Integer>();
  public static List<Integer> ir3 = new ArrayList<Integer>();
  public static int rs1;
  public static int rs2;
  public static int rs3;
  public static int cs1;
  public static int cs2;
  public static int cs3;
  public static int xs1;
  public static int xs2;
  public static int mem;


  // public static int x;
  // public static int y;

//static でないとほかから呼び出せない感じ
  public static void ready()
  {
    for(int i = 0; i <3; i++)
    {
      r1.add("-");
      r2.add("-");
      r3.add("-");
      ir1.add(0);
      ir2.add(0);
      ir3.add(0);
    }
    Random rand = new Random();
    mem = rand.nextInt(2);

  }

  public static void gamestart()
  {
    you.in();
    you.in();
    you.in();
    pri();
    check();
    db();
  }

  public static void pri()
  {
    System.out.println(r1);
    System.out.println(r2);
    System.out.println(r3);
  }

  public static void youset(int x,int y)
  {
    x--;
    switch (y)
    {
      case 1:
        if (ir1.get(x)==0)
        {

          r1.set(x, "o");
          ir1.set(x, 1);
        }
        else
        {
          System.out.println("すでに埋まってます");
          you.in();
        }
        break;
      case 2:
        if (ir2.get(x)==0)
        {

          r2.set(x, "o");
          ir2.set(x, 1);
        }
        else
        {
          System.out.println("すでに埋まってます");
          you.in();
        }
        break;
      case 3:
        if (ir3.get(x)==0)
        {

          r3.set(x, "o");
          ir3.set(x, 1);
        }
        else
        {
          System.out.println("すでに埋まってます");
          you.in();
        }
        break;
    }
  }

  public static void comset(int x,int y)
  {
    x--;
    y--;
    switch (y)
    {
      case 1:
        r1.set(x, "x");
        ir1.set(x, -1);
        break;
      case 2:
        r2.set(x, "x");
        ir2.set(x, -1);
        break;
      case 3:
        r3.set(x, "x");
        ir3.set(x, -1);
        break;
    }
  }

  public static void check()
  {
    for(int i = 0; i <3; i++)
    {
      rs1 += ir1.get(i);
      rs2 += ir2.get(i);
      rs3 += ir3.get(i);
      switch (i)
      {
        case 0:
          cs1 += ir1.get(0);
          cs2 += ir1.get(1);
          cs3 += ir1.get(2);
          xs1 += ir1.get(0);
          xs2 += ir1.get(2);
          break;
        case 1:
          cs1 += ir2.get(0);
          cs2 += ir2.get(1);
          cs3 += ir2.get(2);
          xs1 += ir2.get(1);
          xs2 += ir2.get(1);
          break;
        case 2:
          cs1 += ir3.get(0);
          cs2 += ir3.get(1);
          cs3 += ir3.get(2);
          xs1 += ir3.get(2);
          xs2 += ir3.get(0);
          break;
      }
    }
  }

  public static void db()
  {
    System.out.print("rs1=");
    System.out.println(rs1);
    System.out.print("rs2=");
    System.out.println(rs2);
    System.out.print("rs3=");
    System.out.println(rs3);
    System.out.print("cs1=");
    System.out.println(cs1);
    System.out.print("cs2=");
    System.out.println(cs2);
    System.out.print("cs3=");
    System.out.println(cs3);
    System.out.print("xs1=");
    System.out.println(xs1);
    System.out.print("xs2=");
    System.out.println(xs2);


  }
}

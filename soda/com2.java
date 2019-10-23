import java.util.Random;
public class com2
{
  public static int shake;
  public static int limit;
  public static String name;
  com2(String in_name)
  {
    name = in_name;
  }

  public static void shake()
  {
    limit = soda.getlimit();
    Random rand = new Random();
    if (limit < 200)
    {
      shake = rand.nextInt(15) + 5;
    }
    else if (limit < 50)
    {
      shake = rand.nextInt(10) + 3;
    }
    else
    {
      shake = rand.nextInt(5) + 1;
    }
    System.out.println(name + "は"+ shake +"回振った");
    soda.set_shake_count(name,shake);
  }
}

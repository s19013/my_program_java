import java.util.Random;
public class com3
{
  public static int shake;
  public static int limit;
  public static String name;
  com3(String in_name)
  {
    name = in_name;
  }

  public static void shake()
  {
    limit = soda.getlimit();
    Random rand = new Random();
    shake = rand.nextInt(5) + 1;
    System.out.println(name + "は"+ shake +"回振った");
    soda.set_shake_count(name,shake);
  }
}

import java.util.Random;
public class  soda
{
  public static int limit;
  public static int shake_count;

  public static void start()
  {
    Random rand = new Random();
    limit = rand.nextInt(50)+80;
  }
  public static Integer getlimit()
  {
    return limit;
  }

  public static void set_shake_count(String name,int count)
  {
    shake_count=count;
    limit -=shake_count;
    if (limit <= 0)
    {
      master.gameset(name);
    }
  }


}

import java.util.Random;
public class com1
{
  private int shake;
  private int limit;
  private String name;
  com1(String in_name)
  {
    name = in_name;
  }

  public void shake()
  {
    limit = soda.getlimit();
    Random rand = new Random();
    if (limit < 200)
    {
      shake = rand.nextInt(10) + 1;
    }
    else if (limit < 50)
    {
      shake = rand.nextInt(5) + 1;
    }
    else
    {
      shake = rand.nextInt(2) + 1;
    }
    System.out.println(name + "は"+ shake +"回振った");
    soda.set_shake_count(name,shake);
  }
}

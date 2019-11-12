import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class You
{
  public static ArrayList<Integer> number = new ArrayList<Integer>();
  public static ArrayList<String> mark = new ArrayList<String>();
  public static ArrayList<String> box = new ArrayList<String>();

  public static void first()
  {
    for (int i=0; i<13 ;i++)
    {
      int n = Card.get_number();
      number.add(n);
      String m = Card.get_mark();
      mark.add(m);
    }
    System.out.println(number.size());
    System.out.println(mark.size());
  }
}

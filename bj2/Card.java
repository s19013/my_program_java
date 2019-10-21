import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Collections;

public class Card
{
  public static ArrayList<Integer> number_of_card = new ArrayList<Integer>();
  public static ArrayList<String> mark_of_card = new ArrayList<String>();
  public static void shuffle_cards()
  {
    //数字のリスト
    for (int i =1; i <= 4; i++ ){
      for (int a=1;a<=13 ;a++ ) {
        number_of_card.add(a);
      }
    }
    Collections.shuffle(number_of_card);

    //マークのリスト
    for (int i = 1; i <= 4; i++)
    {
      for (int a=1 ; a<= 13 ;a++)
      {
        switch (i)
        {
          case 1:
            mark_of_card.add("S");
            break;
          case 2:
            mark_of_card.add("C");
            break;
          case 3:
            mark_of_card.add("H");
            break;
          case 4:
            mark_of_card.add("D");
            break;
        }
      }
    }
    mark_of_card.add("JOKER");
    Collections.shuffle(mark_of_card);
  }
  public static String get_mark()
  {
    String mark = mark_of_card.get(0);
    mark_of_card.remove(0);
    return mark;
  }

  public static Integer get_number()
  {
    int number = number_of_card.get(0);
    number_of_card.remove(0);
    return number;
  }

  public static void check()
  {
    if  (number_of_card.size() < 10 || mark_of_card.size() < 10)
    {
      shuffle_cards();
    }
  }


}

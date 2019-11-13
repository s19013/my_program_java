import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class You
{

}

// public static ArrayList<Integer> number = new ArrayList<Integer>();
// public static ArrayList<String> mark = new ArrayList<String>();
// public static ArrayList<String> box = new ArrayList<String>();
//
// public static void first()
// {
//   for (int i=0; i<6 ;i++)
//   {
//     int n = Card.get_number();
//     number.add(n);
//     if (n==0)
//     {
//       box.add("joker");
//     }
//     else
//     {
//       String m = Card.get_mark();
//       mark.add(m);
//       box.add(m+n);
//     }
//   }
//   System.out.println(box);
//   System.out.println(number);
//   // System.out.println(number.size());
//   // System.out.println(mark.size());
// }
//
// public static void check()
// {
//   for (int i=0;i<number.size();i++)
//   {
//     int n1 = number.get(i);
//     System.out.print("n1=");
//     System.out.println(n1);
//     for (int a=i+1;a<number.size();a++)
//     {
//       int n2 = number.get(a);
//       System.out.print("n2=");
//       System.out.println(n2);
//       if (n1==n2)
//       {
//         System.out.println("消した");
//         number.remove(i);
//         mark.remove(i);
//         number.remove(a);
//         mark.remove(a);
//         box.remove(i);
//         break;
//       }
//     }
//   }
//   System.out.println(box);
//   System.out.println(number);
// }

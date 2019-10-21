import java.util.Random;
public class test_if {
  public static void main(String[] args) {
    Random ran_score = new Random();
    int score = ran_score.nextInt(100) + 1;
//    if (score > 80) {
//      System.out.println("great");
//    } else if (score >60) {
//      System.out.println("good");
//    } else {
//      System.out.println("so so");
//    }
  String msg = score > 80 ? "great" : "so so";
  System.out.println(msg);
  }
}

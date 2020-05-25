package blackjack3;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Collections;

public class Com{
  private  ArrayList<Integer> deck = new ArrayList<Integer>();
  private  int sum = 0;
  private String name;

  public void setname(String name){
    this.name = name;
  }

  public String getname(){
    return this.name;
  }

  public void reset(){
    this.deck.clear();
  }

  public void setter(int A){
    this.deck.add(A);
  }

  public  Boolean check(){
    this.sum = 0;
    for (int i=0;i<this.deck.size();i++ ) {
      this.sum += this.deck.get(i);
    }
    if (this.sum >= 22) {
      return true;
    }
    else{
      return  false;
    }
  }

  public  int getsum(){
    return this.sum;
  }

// 本来ならPlayerを継承してchoiceをオーバーライドすればいいはずだけどうまくいかなかった
  public Boolean choice(){
    if (this.sum <= 17) {
      return true;
    }
    else {
      return false;
    }
  }
}

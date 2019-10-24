import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JButton;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Color;


//パネルなど
class SSample4_1 extends JFrame{
  public static void main(String args[]){
    SSample4_1 frame = new SSample4_1("タイトル");
    frame.setVisible(true);
  }

  SSample4_1(String title){
    setTitle(title);
    setBounds(100, 100, 300, 250);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    setLayout(new FlowLayout());

    JPanel p = new JPanel();
    p.setPreferredSize(new Dimension(200, 100));
    p.setBackground(Color.ORANGE);
    p.setLayout(new BorderLayout());

    JButton btn1 = new JButton("NORTH");
    JButton btn2 = new JButton("SOUTH");
    p.add(btn1, BorderLayout.NORTH);
    p.add(btn2, BorderLayout.SOUTH);

    Container contentPane = getContentPane();
    contentPane.add(p);
  }
}

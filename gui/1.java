import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class Sample1_7 extends JFrame implements ActionListener{
  public static void main(String args[]){
    Sample1_7 frame = new Sample1_7("タイトル");
    frame.setVisible(true);
  }

  Sample1_7(String title){
    setTitle(title);
    setBounds(100, 100, 400, 300);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    JPanel p = new JPanel();
    JButton btn = new JButton("Push");
    btn.addActionListener(this);

    p.add(btn);
    getContentPane().add(p, BorderLayout.CENTER);
  }

  public void actionPerformed(ActionEvent e){
    JLabel label = new JLabel("Push A Button");
    JOptionPane.showMessageDialog(this, label);
  }
}

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
 class JapaneseGame
{
public static void main(String args[])
{
JFrame frm= new JFrame("Japanese Counting");
Container con=frm.getContentPane();

JButton btn1=new JButton("one");
JButton btn2=new JButton("two");
JButton btn3=new JButton("three");
JButton btn4=new JButton("four");
con.add(btn1);
con.add(btn2);
con.add(btn3);
con.add(btn4);

JLabel lbl= new JLabel("Learn to count in japanese");
con.add(lbl);

btn1.addActionListener(new ActionListener(){
  public void actionPerformed(ActionEvent e)
{
      lbl.setText("Kyota");
}
});
btn2.addActionListener(new ActionListener(){
  public void actionPerformed(ActionEvent a)
{
      lbl.setText("Osaka");
}
});
btn3.addActionListener(new ActionListener(){
  public void actionPerformed(ActionEvent c)
{
      lbl.setText("Tokyo");
}
});
btn4.addActionListener(new ActionListener(){
  public void actionPerformed(ActionEvent b)
{
      lbl.setText("Kobe");
}
});

FlowLayout flw= new FlowLayout();
con.setLayout(flw);
frm.setSize(300,400);
frm.setVisible(true);
frm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
}
}


import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
class MainDemoGUIFont implements ActionListener
{
JButton btn;
label lbl;
 public static void main(String args[])
{
 public actionPerformed(ActiveEvent e)
{
 lbl.setText(e.ActionCommand());
}
MainDemoGUIFont()
{
 JFrame frm= new JFrame();
Container con= frm.getContentPane();
con.setLayout(new GridLayout(2,1,4,2));
Font fnt= new Font("Arial",Font.BOLD+Font.ITALIC,20);
btn=new JButton("Click me");
lbl=new label("Click me");
btn.addActionistener();
con.add(lbl);
con.add(btn);
con.add(fnt);
frm.setSize(300,400);
frm.setVisible(true);
frm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
}
}
}
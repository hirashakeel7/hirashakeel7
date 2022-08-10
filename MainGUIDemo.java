import java.awt.*;
import javax.swing.*;
class MainGUIDemo
{
public static void main(String args[])
{
 JFrame frm= new JFrame();
 Container con= frm.getContentPane();
 FlowLayout flw= new FlowLayout();
 con.setLayout(flw);
 JButton btn= new JButton("Click me");
 con.add(btn);
 frm.setSize(300,400);
 frm.setVisible(true);
 frm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
}
}
import java.awt.*;
import javax.swing.*;
class MainGUIArray
{
public static void main(String args[])
{
 JFrame frm= new JFrame();
 Container con= frm.getContentPane();
 GridLayout gly= new GridLayout(5,4,8,12);
 con.setLayout(gly);
 JButton[] btn= new JButton[20];
for(int i=0;i<btn.length;i++)
{
btn[i]= new JButton((i+1) + " ");
 con.add(btn[i]);
}
 frm.setSize(300,400);
 frm.setVisible(true);
 frm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
}
}
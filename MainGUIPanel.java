import java.awt.*;
import javax.swing.*;
class MainGUIPanel
{
public static void main(String args[])
{
 JFrame frm= new JFrame();
 Container con= frm.getContentPane();
 BorderLayout bly= new BorderLayout();
 con.setLayout(bly);
Panel pnl= new Panel();
pnl.setLayout(new GridLayout(5,4));
 JButton[] btn= new JButton[20];
for(int i=0;i<btn.length;i++)
{
btn[i]= new JButton((i+1) + " ");
con.add(btn[i]);
pnl.add(btn[i]);
}
con.add(btn[0],BorderLayout.NORTH);
con.add(btn[1],BorderLayout.SOUTH);
con.add(btn[2],BorderLayout.EAST);
con.add(btn[3],BorderLayout.WEST);
con.add(btn[4],BorderLayout.CENTER);

 frm.setSize(300,400);
 frm.setVisible(true);
 frm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
}
}
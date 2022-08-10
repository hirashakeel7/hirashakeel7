
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

class MainDemoGUIItemListener implements ItemListener
{
	JLabel lbl;
	List lst;

	void myGUI(){
		JFrame frm = new JFrame();
		Container con=frm.getContentPane();//Workable area reference

		//GridLayout flw = new FlowLayout();
		//con.setLayout(new GridLayout(2,1,0,10));
		lbl= new JLabel();
		lst= new List(3,false);
		lst.add("Shar e Ali");
		lst.add("Abdullah");
		lst.add("Shahid Ahmed");
		lst.add("Hira");
		lst.add("Amna");
		lst.add("Manahil");
		lst.add("Husnain");
		lst.addItemListener(this);//For event Registration

		con.add(lbl);				
		con.add(lst);				
		frm.setSize(300,400);
		frm.setVisible(true);
frm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}
	public static void main(String[] arg)
	{
		MainDemoGUIItemListener o= new MainDemoGUIItemListener();
		o.myGUI();
	}
	public void itemStateChanged(ItemEvent e)
	{
		String itemText=lst.getSelectedItem();
		int i=lst.getSelectedIndex();	
		
		lbl.setText("index:" + i + " "+ itemText);
		
	}
}

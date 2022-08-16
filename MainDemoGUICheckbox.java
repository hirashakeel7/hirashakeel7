
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

class MainDemoGUICheckbox implements ItemListener
{
	JLabel lbl;
	List lst;
	Checkbox chkBold;
	Checkbox chkItalic;
	Checkbox chk10;
	Checkbox chk20;
	Checkbox chk22;
	void myGUI(){
		JFrame frm = new JFrame();
		Container con=frm.getContentPane();//Workable area reference

		//GridLayout flw = new FlowLayout();
		con.setLayout(new GridLayout(0,1));
		chkBold = new Checkbox("Bold",true);
		chkItalic = new Checkbox("Italic");
		CheckboxGroup cgSize= new  CheckboxGroup();
		//Radio buttons
		chk10 = new Checkbox("10", cgSize, true);
		chk20 = new Checkbox("20", cgSize, false);
		chk22 = new Checkbox("22", cgSize, false);

		lbl= new JLabel("NFC IET");
		lst= new List(3,false);
		lst.add("Blue");
		lst.add("Red");
		lst.add("Yellow");
		lst.add("Orange");
		lst.addItemListener(this);//For event Registration
		chkBold.addItemListener(this);
		chkItalic.addItemListener(this);
		chk10.addItemListener(this);
		chk20.addItemListener(this);
		chk22.addItemListener(this);
		Panel pnl1=new Panel();
		Panel pnl2=new Panel();
		pnl1.setLayout(new FlowLayout());
		pnl2.setLayout(new FlowLayout());
		pnl1.add(chkBold);
		pnl1.add(chkItalic);
		pnl2.add(chk10);
		pnl2.add(chk20);
		pnl2.add(chk22);
		con.add(lbl);				
		con.add(pnl1);
		con.add(pnl2);
		con.add(lst);				
		frm.setSize(600,600);
		frm.setVisible(true);
frm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}
	public static void main(String[] arg)
	{
		MainDemoGUICheckbox o= new MainDemoGUICheckbox();
		o.myGUI();
	}
	public void itemStateChanged(ItemEvent e)
	{
		int style=0,fontSize=12;
		String lstText=lst.getSelectedItem();
		int i=lst.getSelectedIndex();	
		if (lstText=="Red")
		{
			lbl.setForeground(Color.RED);
		}		
		if (lstText=="Blue")
		{
			lbl.setForeground(Color.BLUE);
		}		
		if (lstText=="Orange")
		{
			lbl.setForeground(Color.ORANGE);
		}		
		if (lstText=="Yellow")
		{
			lbl.setForeground(Color.YELLOW);
		}		
		if(chkBold.getState()==true)
		{
			style=1;
		}
		if(chkItalic.getState()==true)
		{
			style=2;
		}
		if(chkBold.getState()==true && chkItalic.getState()==true)
		{
			style=3;
		}
		if(chk10.getState())
		{
			fontSize=Integer.parseInt(chk10.getLabel());
		}
		if(chk20.getState())
		{
			fontSize=Integer.parseInt(chk20.getLabel());
		}
		if(chk22.getState())
		{
			fontSize=Integer.parseInt(chk22.getLabel());
		}

		Font fnt= new Font("Arial",style,fontSize);
		lbl.setFont(fnt);
		lbl.setText("index:" + i + " "+ lstText);
		
	}
}

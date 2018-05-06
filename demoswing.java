import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

class sample extends JFrame implements ActionListener
{
	JButton b1,b2;
	JProgressBar pb;
	JCheckBox c1,c2,c3;
	sample()
	{
		//Frame

		setLayout(null);
		setVisible(true);
		setSize(500,500);

		//Button		

		b1=new JButton("Submit");
		add(b1);
		b1.setBounds(100,200,90,30);
		b1.addActionListener(this);	

		b2=new JButton("Cancel");
		add(b2);
		b2.setBounds(200,200,90,30);

		b2.addActionListener(this);

		//Progressbar

		pb=new JProgressBar(0,1000);
		add(pb);
		pb.setBounds(100,250,230,50);
		pb.setValue(0);

		//Color pallet

		Color c=JColorChooser.showDialog(this,"Select ur Color",Color.RED);

		getContentPane().setBackground(c);
		//b1.setBackground(c);
	
		//Checkbox

		c1=new JCheckBox("Java");
		c2=new JCheckBox("C");
		c3=new JCheckBox("C++");

		Panel p=new Panel(new GridLayout(1,4));
	
		p.add(c1);
		p.add(c2);
		p.add(c3);
	
		add(p);
		p.setBounds(100,350,200,40);

		
	}
	public void actionPerformed(ActionEvent e)
	{
		if(e.getActionCommand().equals("Submit"))
		{
			System.out.println("Action Done");
		}
		if(e.getActionCommand().equals("Cancel"))
		{
			System.exit(0);
		}
	}
}
class demoswing
{
	public static void main(String args[])
	{
		sample obj=new sample();
	}
}
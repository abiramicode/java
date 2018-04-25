import java.awt.*;

class sample extends Frame
{
	MenuBar mbar;
	Label l1,l2;
	TextField t1,t2;
	Button b1,b2;
	Choice ch;
	Checkbox c1,c2,c3,c4,c5;
	CheckboxGroup cbg;
	sample()
	{
		mbar=new MenuBar();
		setMenuBar(mbar);

		Menu file=new Menu("File");

		MenuItem fm1=new MenuItem("New");
		file.add(fm1);
		
		MenuItem fm2=new MenuItem("Open");
		file.add(fm2);

		MenuItem fm3=new MenuItem("Save");
		file.add(fm3);

		MenuItem fm4=new MenuItem("Save As");
		file.add(fm4);

		MenuItem fm5=new MenuItem("Print");
		file.add(fm5);
		
		mbar.add(file);

		//Second Menu
		
		Menu efile=new Menu("Edit");

		MenuItem em1=new MenuItem("Undo");
		efile.add(em1);
		
		MenuItem em2=new MenuItem("Cut");
		efile.add(em2);

		MenuItem em3=new MenuItem("Copy");
		efile.add(em3);

		MenuItem em4=new MenuItem("Past");
		efile.add(em4);

		MenuItem em5=new MenuItem("Delete");
		efile.add(em5);
		
		mbar.add(efile);
		
		//Third Menu

		Menu ffile=new Menu("Format");

		MenuItem ffm1=new MenuItem("Word Wrap");
		ffile.add(ffm1);

		MenuItem ffm2=new MenuItem("Font");
		ffile.add(ffm2);

		mbar.add(ffile);

		setLayout(null);

		setVisible(true);
		setSize(5000,5000);
		setBackground(Color.pink);
		
		//Lable

		l1=new Label("UserName");
		l2=new Label("PassWord");
		
		//Textfield

		t1=new TextField();
		t2=new TextField();

		t2.setEchoChar('$');

		Panel p1=new Panel(new GridLayout(2,2));

		p1.add(l1);
		p1.add(t1);
		p1.add(l2);
		p1.add(t2);

		add(p1);

		p1.setBounds(100,120,350,60);

		
		//Button

		b1=new Button("Signin");
		b2=new Button("Cancel");
		
		b1.setBounds(180,230,90,40);
		b2.setBounds(300,230,90,40);
		
		add(b1);
		add(b2);

		//b1.addActionListener(this);

		//Choice

		ch=new Choice();

		ch.add("Java");
		ch.add("C++");
		ch.add("C");
		ch.add("HTML");

		add(ch);
		ch.setBounds(230,300,90,40);

		//Checkbox

		c1=new Checkbox("Java");
		c2=new Checkbox("Phyton");
		c3=new Checkbox("C++");

		Panel p=new Panel(new GridLayout(1,4));
	
		p.add(c1);
		p.add(c2);
		p.add(c3);
	
		add(p);
		p.setBounds(100,400,200,40);

		//Checkboxgroup

		cbg=new CheckboxGroup();

		c4=new Checkbox("Male",cbg,false);
		c5=new Checkbox("Female",cbg,true);

		add(c4);
		add(c5);
		
		c4.setBounds(120,650,80,40);
		c5.setBounds(250,650,80,40);
	}
}
class democheckbox
{
	public static void main(String args[])
	{
		sample obj=new sample();
	}
}
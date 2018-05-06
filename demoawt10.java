import java.awt.*;

class sample extends Frame
{
	
        Label l1,l2,l3;
        TextField t1,t2,t3;
        Button b1,b2;
        Choice c;
        TextArea ta;
        Checkbox c1,c2,c3,c4,c5;
        CheckboxGroup cbg;
	MenuBar mbar;
	Menu Menu,aMenu;
	MenuItem m1,m2,m3,m4,a1,a2,a3,a4;

	sample()
	{
	  
	  setLayout(null);

	  setVisible(true);
	  setSize(500,500);
	  setTitle("ABI");

	  l1=new Label("Username");
	  l2=new Label("Password");
	  l3=new Label("No of cost price");

	  l1.setFont(new Font("Cooper",Font.BOLD,15));
	  l2.setFont(new Font("Consolas",Font.BOLD,13));
	 	  
	  t1=new TextField();
	  t2=new TextField();
	  t3=new TextField();
	  
	  Panel p1=new Panel(new GridLayout(1,6));
	  p1.add(l1);  
	  p1.add(t1);  
	  p1.add(l2);  
	  p1.add(t2); 
	  p1.add(l3); 
	  p1.add(t3); 
	  add(p1); 
	  p1.setBounds(120,150,530,40);
	  setBackground(Color.green);

	  b1=new Button("Sign in");
	  add(b1);
	  b1.setBounds(180,250,190,60);
	  b1.setBackground(Color.green);
	  b1.setForeground(Color.black);
	  setBackground(Color.cyan);

    	  b2=new Button("Exit");
	  add(b2);
	  b2.setBounds(420,250,190,60);
	  b2.setBackground(Color.blue);
	  b2.setForeground(Color.black);
	  setBackground(Color.cyan);

 	  c=new Choice();
	  c.add("Abi"); 
	  c.add("Krish"); 
          c.add("bird"); 	
	  c.add("Amul"); 
	  c.add("SWeet");
	  add(c);
	  c.setBounds(200,380,180,50);
	  c.setBackground(Color.red);
	  c.setForeground(Color.black);

 	  ta=new TextArea();
	  add(ta);
	  ta.setBounds(180,450,320,100);


	
	  c1=new Checkbox("Music");
	  c2=new Checkbox("Garden"); 
	  c3=new Checkbox("Aratai");
	  Panel cpan=new Panel(new GridLayout(1,3));
	  cpan.add(c1);
	  cpan.add(c2);
	  cpan.add(c3);
	  add(cpan);   
	  cpan.setBounds(550,340,170,40);

	  cbg=new CheckboxGroup();
	  c4=new Checkbox("Male",cbg,true);
	  c5=new Checkbox("Female",cbg,false);
	  add(c4);
	  add(c5);
	  c4.setBounds(600,440,70,50);
	  c5.setBounds(680,440,70,50);
 	  setBackground(Color.cyan);
	
   	 
	  mbar=new MenuBar();
	  setMenuBar(mbar);
          
	  Menu file=new Menu("User");
	  MenuItem m1=new MenuItem("Learning");
	  MenuItem m2=new MenuItem("Assignment");
	  MenuItem m3=new MenuItem("Test");
	  MenuItem m4=new MenuItem("Result");
	  
	  file.add(m1);
	  file.add(m2);
	  file.add(m3);
	  file.add(m4);

	  mbar.add(file);

	  Menu afile=new Menu("Admin");
	  MenuItem a1=new MenuItem("Monitoring");
	  MenuItem a2=new MenuItem("Registration");
	  MenuItem a3=new MenuItem("Service");
	  MenuItem a4=new MenuItem("Release");
	  
	  file.add(a1);
	  file.add(a2);
	  file.add(a3);
	  file.add(a4);

	  mbar.add(afile);
	
	
	}
	 

}

class demoawt10
{
    public static void main(String arsg[])
	{
	 sample obj=new sample();	
	}
}

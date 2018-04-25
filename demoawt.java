import java.awt.*;

 class sample extends Frame
{
	
        Label l1,l2;
        TextField t1,t2;
	TextArea ta;

	Button b1;
     sample()
	{
	  
	  setLayout(null);

	  setVisible(true);
	  setSize(500,500);

	  l1=new Label("Username");
	  l2=new Label("Password");

	  t1=new TextField();
	  t2=new TextField();
	  
	  Panel p1=new Panel(new GridLayout(1,4));
	  p1.add(l1);  
	  p1.add(t1);  
	  p1.add(l2);  
	  p1.add(t2); 
	  add(p1); 
	  p1.setBounds(100,120,370,40);

	  b1=new Button("Sign in");
	  add(b1);
	  b1.setBounds(180,230,90,30);
	  b1.setBackground(Color.blue);
          b1.setForeground(Color.black);
          setBackground(Color.cyan);
	
	  
	  ta=new TextArea();
	  add(ta);
	  ta.setBounds(200,300,220,130);
	  ta.setBackground(Color.yellow);
          ta.setForeground(Color.black);
          setBackground(Color.red);
	}
}

class demoawt
{
    public static void main(String arsg[])
	{
	 sample obj=new sample();	
	}
}

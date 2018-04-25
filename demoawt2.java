import java.awt.*;

class sample extends Frame
{
        TextField t1,t2;
     sample()
	{
	  
	  setLayout(null);

	  setVisible(true);
	  setSize(500,500);

	  t1=new TextField();
	  t2=new TextField();
	  
	  Panel p1=new Panel(new GridLayout(1,2));
	  p1.add(t1);  
	  p1.add(t2);   
	  add(p1); 
	  p1.setBounds(100,120,370,40);
	}
}

class demoawt2
{
    public static void main(String arsg[])
	{
	 sample obj=new sample();	
	}
}

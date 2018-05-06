import java.awt.*;
import java.awt.event.*;
class sample extends Frame implements ActionListener,ItemListener,MouseListener,MouseMotionListener
{	
        Label l1,l2;
        TextField t1,t2;
	TextArea ta;
    	Button b1,b2;		
	 Choice ch;
      	Checkbox c1,c2,c3,c4,c5;
        CheckboxGroup cbg;
	
	sample()
	{
	  
	  setLayout(null);

	  setVisible(true);
	  setSize(500,500);
	  setTitle("ABI");

	  l1=new Label("Username");
	  l2=new Label("Password");

	  l1.setFont(new Font("Cooper",Font.BOLD,15));
	  l2.setFont(new Font("Consolas",Font.BOLD,13));
	 	  
	  t1=new TextField();
	  t2=new TextField();
	  
	  Panel p1=new Panel(new GridLayout(1,6));
	  p1.add(l1);  
	  p1.add(t1);  
	  p1.add(l2);  
	  p1.add(t2); 
	  add(p1); 
	  p1.setBounds(120,150,530,40);
	  setBackground(Color.green);

	  b1=new Button("Sign in");
	  add(b1);
	  b1.setBounds(180,250,190,60);
	  b1.setBackground(Color.green);
	  b1.setForeground(Color.black);
	  setBackground(Color.cyan);
	  b1.addActionListener(this);

    	  b2=new Button("Exit");
	  add(b2);
	  b2.setBounds(420,250,190,60);
	  b2.setBackground(Color.blue);
	  b2.setForeground(Color.black);
	  setBackground(Color.cyan);
	  b2.addActionListener(this);
	   
	  ta=new TextArea();
	  add(ta);
	  ta.setBounds(180,450,320,100);
	 

 	  ch=new Choice();
	  ch.add("Abi"); 
	  ch.add("Krish"); 
          ch.add("bird"); 	
	  ch.add("Amul"); 
	  ch.add("SWeet");
	  add(ch);
	  ch.setBounds(200,380,180,50);
	  ch.setBackground(Color.red);
	  ch.setForeground(Color.black);
	  ch.addItemListener(this);
	

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

	 addMouseListener(this);
	 addMouseMotionListener(this);
	
	 }
	   public void paint(Graphics g)  
             {  
              g.setColor(Color.red);  
       	      g.fillOval(75, 75, 150, 75);
      	      g.drawRect(52,62,350,60);  
             }  
	     public void actionPerformed(ActionEvent a)
	      {
	      if(a.getActionCommand().equals("Sign in"))
		{
	 	  System.out.println("Action done");

		  System.out.println("Username="+t1.getText());
		  System.out.println("Password="+t2.getText());

	          ta.setText(t1.getText());
		   }
	    	  if(a.getActionCommand().equals("Exit"))
	          {
		  System.exit(0);	
		  }
	    	 }
	

		public void itemStateChanged(ItemEvent d)
		{
	 	  System.out.println(""+ch.getSelectedItem());
		}
		
	

		public void mouseExited(MouseEvent me)
		{
		  System.out.println("MouseExited");		
		}	
   		public void mouseEntered(MouseEvent me)
		{	
		}
		public void mouseReleased(MouseEvent me)
		{
		 System.out.println("MouseReleased");		
		}
		public void mousePressed(MouseEvent me)
		{	
	      	}
		public void mouseClicked(MouseEvent me)
		{
		System.out.println("MouseClicked");	
		}

		

		public void mouseDragged(MouseEvent me)
		{
		System.out.println("MouseDragged");	
		}
      		 public void mouseMoved(MouseEvent me)
		{
		System.out.println("MouseMoved");	
		}
	

}


class demoawt20
{
    public static void main(String arsg[])
	{
	 sample obj=new sample();	
	}
}


class sample
{
     StringBuilder str=new StringBuilder("Abirami");
    
     public void display()
	{
	      System.out.println(""+str.length());
	     System.out.println(""+str.capacity());
	      System.out.println(""+str.charAt(1));
		str.setCharAt(3,'a');
	    System.out.println(""+str);
	    System.out.println(""+str.replace(0,3,"shr"));
	     str.deleteCharAt(0);
	    System.out.println(""+str);
	}
}

class demostr
{	
     public static void main(String args[])
	{
	  sample obj=new sample();
	  obj.display();
	}
}
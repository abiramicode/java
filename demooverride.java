class sample			
{
   public void display(String str)
	{
	  System.out.println(""+str);
	}
}
class sample1 extends sample			
{
   public void display(String str)
	{
	   
	  System.out.println(""+str);
	}
}
class demooverride
{
   public static void main(String args[])
	{
	  sample ref; 
	 
	 sample1 obj1=new sample1();
	 sample obj=new sample();

	 ref=obj;
	 ref.display("salem");
	}
}
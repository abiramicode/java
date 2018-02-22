class sample
{
   String str="BE";
   public void display()
	{
	 System.out.println(""+str);
	}
    public void display1()
	{
	 System.out.println(""+str);
	}
}

class global
{
   public static void main(String args[])
	{
	 sample obj=new sample();
	 obj.display();
	 obj.display1();
	}
}
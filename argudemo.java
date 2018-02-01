class sample
{
    public void display(String name,int roll,String dept)
	{
	 System.out.println(""+name);
	 System.out.println(""+roll);
	 System.out.println(""+dept);
	}
}

class argudemo
{
   public static void main(String args[])
	{
	 sample obj=new sample();
	 obj.display("apple",01,"EEE");
	}
}

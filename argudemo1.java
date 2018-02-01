class sample
{
    public void display(String name,String incl)
	{
	 System.out.println(""+name+incl);
	}
    public void display1(int x,int y,int z)
	{
	 int add=x+y+z;
	 System.out.println(""+add);
	}
}

class argudemo1
{
   public static void main(String args[])
	{
	 sample obj=new sample();
	 obj.display("abirami","k");
	 obj.display1(2,3,5);
	}
}

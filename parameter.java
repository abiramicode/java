class demo
{
   public int display(int x,int y)
	{
	 int tot=x+y;
	 return tot;
	}
}

class parameter
{
  public static void main(String args[])
	{
	 demo obj=new demo();
	 int tot =obj.display(4,6);
	 System.out.println(tot);
	}
}
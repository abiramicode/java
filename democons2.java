class sample
{
    sample(int x,int y)
	{
	  int sub=x-y;
	  System.out.println(""+sub);	
	}
    sample(String str)
	{
	  System.out.println(""+str);	
	}
}

class democons2
{
    public static void main(String args[])
	{
	  sample obj=new sample(12,8);
	  sample obj1=new sample("Abirami");
	}
}

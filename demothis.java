class sample
{
   int x,y,tot;
   public void display(int x,int y)
	{
	   this.x=x;
	   this.y=y;
	   tot=x+y;
	   
	}
    public void show()
	{
	   System.out.println(""+tot);
	   System.out.println(""+x);
	   System.out.println(""+y);
	}
     
}

class demothis
{
   public static void main(String args[])
	{
	 sample obj=new sample();
	 obj.display(10,12);
	 obj.show();
	}
}
class sample
{
    public void display()
	{
	  System.out.println("Empty method");	
	}
    public void display(String str)
	{
	  System.out.println(""+str);	
	}
    public void display(int x,int y)
	{
	  int sub=x-y;
	  System.out.println(""+sub);	
	}
}

class overloading
{
    public static void main(String args[])
	{
	  sample obj=new sample();
	  obj.display(); 
          obj.display("Abi");
	  obj.display(100,50);
	  
	}
}

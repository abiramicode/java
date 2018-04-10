class sample
{
    String name,city;
    public void display()
	{
	  System.out.println("Abi");	
	}
}
class sample1 extends sample
{
    public void get()
	{
	  System.out.println("salem");	
	}
}
class inher1
{
    public static void main(String args[])
	{
	  sample1 obj=new sample1();
	  obj.display();
	  obj.get();
	}
}

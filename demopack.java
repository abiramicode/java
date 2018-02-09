import pack.sample;
class simple extends sample
{
    public void show()
	{
	  System.out.println("abi");
	}
}
class demopack
{
   public static void main(String args[])
	{
	  simple obj=new simple();
	  obj.show();
	  obj.display();
	}
}
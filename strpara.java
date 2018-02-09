class sample
{
    int x,y;
    public void display(int a,int b)
	{
	 x=a;
	 y=b;
	 int add=x+y;
	 System.out.println(add); 
	}
	
    public void display1(String str)
	{
	 
	 System.out.println(str); 
	}

}

class strpara
{
    public static void main(String args[])
	{
	 sample obj=new sample();
	 obj.display(10,5);
	 obj.display1("hii");
	}
}

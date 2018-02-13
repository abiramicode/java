import java.util.*;
class sample
{
  TreeSet<String> a1=new TreeSet<String>();
  sample()
	{   
          a1.add("Abi");
          a1.add("Vijay");
	  a1.add("Abi");
	  a1.add("Cat");
	  a1.add("Dog");
	  a1.add("Pop");
	Iterator itr=a1.iterator();
          
       while(itr.hasNext())
		{
                 System.out.println(""+itr.next());	
		}

	}
}
class treeset
{
  public static void main(String args[])
	{
	 sample obj=new sample();
	}
}
import java.util.*;
class sample
{
  HashSet<String> a1=new HashSet<String>();
  sample()
	{
          
          a1.add("Abi");
	  a1.add("Vijay");
	  a1.add("Balu");
	  a1.add("Abi");
	  
	Iterator itr=a1.iterator();
          
       while(itr.hasNext())
		{
                 System.out.println(""+itr.next());	
		}

	}
}
class hashset
{
  public static void main(String args[])
	{
	 sample obj=new sample();
	}
}
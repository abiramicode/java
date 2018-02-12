import java.util.*;
class sample
{
  LinkedHashSet<String> a1=new LinkedHashSet<String>();
  sample()
	{   
          a1.add("Ravi");
          a1.add("Vijay");
	  a1.add("Ravi");
	  a1.add("Ajay");
	  a1.add("Balu");
	Iterator itr=a1.iterator();
          
       while(itr.hasNext())
		{
                 System.out.println(""+itr.next());	
		}

	}
}
class linkedhashset
{
  public static void main(String args[])
	{
	 sample obj=new sample();
	}
}
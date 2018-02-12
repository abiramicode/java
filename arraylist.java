import java.util.*;
class sample
{
  ArrayList<String> a1=new ArrayList<String>();
  sample()
	{   
          a1.add("java");
          a1.add("java");
	  a1.add("phyton");
	  a1.add("c++");
	  a1.add("c");
	
	Iterator itr=a1.iterator();
          
       while(itr.hasNext())
		{
                 System.out.println(""+itr.next());	
		}

	}
}
class arraylist
{
  public static void main(String args[])
	{
	 sample obj=new sample();
	}
}
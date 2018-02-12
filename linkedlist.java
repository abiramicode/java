import java.util.*;
class sample
   {
  
   LinkedList<String> a1=new LinkedList<String>();
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
class linkedlist
{	
    public static void main(String args[])
	{
           sample obj=new sample();
 	}
}
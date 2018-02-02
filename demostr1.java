class sample
{
     String str=new String("Abirami");
     String str1=new String("salem");
    
     public void display()
	{
	      System.out.println(""+str.toUpperCase());
	      System.out.println(""+str.toLowerCase());
	      System.out.println(""+str.trim());
	      System.out.println(""+str.concat(str1));
	      System.out.println(""+str.charAt(2));
	      System.out.println(""+str.replace('i','y'));
	      System.out.println(""+str.replaceAll("Abirami","salem"));
	}
}

class demostr1
{	
     public static void main(String args[])
	{
	  sample obj=new sample();
	  obj.display();
	}
}
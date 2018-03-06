interface one
{
     public void show();
}

class sample extends Thread implements one
{
          Thread t=new Thread(this);
          sample()
	{
	 t.start();
	}
           public void run()
	{
	   System.out.println("implements Runnable working");
	}
          public void show()
	{
	   System.out.println("super class");
	}


}

class  sample1 implements one
{
	
          public void show()
	{
	   System.out.println("derived class");
	}
    }
class demothread
{
     public static void main(String args[])
	{
	    sample1 obj=new sample1();
	   
	   obj.show();
                }
}

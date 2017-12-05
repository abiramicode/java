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

      public void show()
	{
	   for(int i=0;i<10;i++)
		{
	        System.out.println(i);
		try{
               t.sleep(800);
		}catch(InterruptedException a){}
	         }
	  }
}

class demothread1
{
     public static void main(String args[])
	{
	  one obj=new sample();
	   obj.show();
	  Thread t=Thread.currentThread();
	   {
	  for(int i=0;i<10;i++)
		{
	  System.out.println(i);
	   try{
	  Thread.sleep(500);
	     }catch(InterruptedException b){}
	    }
	   }
	}
}
	
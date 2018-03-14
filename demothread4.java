class sample extends Thread
 {
    Thread t=new Thread(this);
    sample()
         {
	t.start();
	System.out.println(""+t.getName());

          }
	public void run()
	{
                       for(int i=0;i<10;i++)
		{
		try{
	                         System.out.println(i);
	                         t.sleep(500);
		}catch(InterruptedException a){}
	                   }
	}

}
class demothread4
	{
	   public static void main(String args[])
	       {
	   sample obj=new sample();
	  Thread t=Thread.currentThread();
	 System.out.println(""+t.getName());
	         for(int i=0;i<10;i++)
		{
		try{
	                         System.out.println(i);
	                         t.sleep(500);
		}catch(InterruptedException b){}
	                   }
               }

}
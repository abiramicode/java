class sample extends Thread
 {
    Thread t=new Thread(this);
    sample()
         {
	  t.start();
         }
	public void run()
	{
                       for(int i=0;i<10;i++)
		{
		try{
	                         System.out.println(i);
	                         t.sleep(1000);
		}catch(InterruptedException a){}
	                   }
	}

}
class demothread3
	{
	   public static void main(String args[])
	    {
	   sample obj=new sample();
	   }


}
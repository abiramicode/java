class sample extends Thread
 {
    Thread t=new Thread(this);
    sample()
         {

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
class demothread5
	{
	   public static void main(String args[])
	     {
	   sample obj=new sample();
	   obj.start();
	   
            try{
	      obj.join();
	   }catch(InterruptedException dd){}
	   
	   sample obj1=new sample();
	   obj1.start();
	   }
	}
	  
          
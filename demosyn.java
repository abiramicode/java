class sample
{
    public void call(String str)
	{
	  System.out.println(str);
	    try{
	  Thread.sleep(1000);
	    }catch(InterruptedException a){}
	}
}
class simple extends Thread
{
     simple obj;
     String str;
     Thread t;
     simple(sample obj, String str)
     { 
       simple=obj;
       String =str;s
        t=new Thread(this);
        t.start();
     }
       public void run()
	{
	  obj.call(str);
	}
}

class demosyn
{
    public static void main(String args[])
	{
	  sample obj=new sample();
	  simple ob=new simple(obj,"abi");
	  simple ob1=new simple(obj,"eee");
	}
}
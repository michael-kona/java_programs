class clicker implements Runnable 
{
	Thread t;
	long click=0;
	boolean running=true;
	clicker(int p)
	{
    t=new Thread(this);
	t.setPriority(p);
	}
	public void run()
	{
		while(running)
		{
			click++;
		}
	}
	public void start()
	{
		t.start();
	}
	public void stop()
	{
		running=false;
	}
}
class clickertest 
{
	public static void main(String[] args) 
	{
Thread.currentThread().setPriority(Thread.MAX_PRIORITY);
clicker lo=new clicker(Thread.NORM_PRIORITY-4);
clicker hi=new clicker(Thread.NORM_PRIORITY+4);
lo.start();
hi.start();
try{
Thread.sleep(10000);
}catch(InterruptedException e)
		{
	System.out.println("main Interrupted");
		}
	lo.stop();
	hi.stop();
System.out.println("low priority thread:"+lo.click);
System.out.println("high priority thread:"+hi.click);
	}
}

class callme 
{
 void call(String msg)
	{
		System.out.print("["+msg);
		try{
			Thread.sleep(1000);
			}
		catch(InterruptedException e)
		{System.out.println("Interrupted");}
        System.out.println("]");
	}
}
class caller implements Runnable
{
	Thread t;
    callme	target;
	String msg;

	public caller(callme targ,String s)
	{
		target=targ;
		msg=s;
		t=new Thread(this);
		t.start();
	}
	public void run()
	{
	synchronized(target)
		{
		target.call(msg);
		}
	}
};
class synch2
{
	public static void main(String[] args) 
	{
callme target=new callme();
caller ob1=new caller(target,"Hello");
caller ob2=new caller(target,"Synchronized");
caller ob3=new caller(target,"World");
try{
	ob1.t.join();
ob2.t.join();
ob3.t.join();
}
catch(InterruptedException e)
		{
	System.out.println("INterrupted:");
			}
System.out.println("Hello World!");
	}
}

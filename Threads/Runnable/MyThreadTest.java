class MyThread implements Runnable 
{
	MyThread(String s)
	{
		Thread t=new Thread(this,s);
		t.start();
	}
	public void run()
	{
		for(int i=1;i<=4;i++)
		{
System.out.println("thread"+i+":"+Thread.currentThread().getName());
					}
	}
}
class MyThreadTest
{
public static void main(String[] args) 
	{
System.out.println("thread:"+Thread.currentThread().getName());

MyThread m1=new MyThread("Thread 1");
MyThread m2=new MyThread("Thread 2");
MyThread m3=new MyThread("Thread 3");
System.out.println("Exiting thread main()");
	}
}


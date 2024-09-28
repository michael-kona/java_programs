class  MyThread1 implements Runnable
{
	public void run()
	{
		for(int i=1;i<50;i++)
		{
			System.out.println(i);
		}
	}
}
class MyThreadTest1
{
	public static void main(String[] args) 
	{
        MyThread1 m1=new MyThread1();
		Thread t=new Thread(m1);
		t.start();
		for(int i=1;i<=50;i++)
		    {
		     System.out.println("main-->"+i);
			}
	}
}
a
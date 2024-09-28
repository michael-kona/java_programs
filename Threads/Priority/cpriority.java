class A extends Thread
{
	public void run()
	{
		for(int i=1;i<=5;i++)
		{
			System.out.println("Thread A:"+i);
		}
	System.out.println("Exiting A.....");
	}
}
class B extends Thread
{
	public void run()
	{
		for(int i=1;i<=5;i++)
		{
			System.out.println("Thread B:"+i);
		}
				System.out.println("Exiting B.....");
	}
}
class C extends Thread
{
	public void run()
	{
		for(int i=1;i<=5;i++)
		{
			System.out.println("Thread c:"+i);
		}
		System.out.println("Exiting C.....");
    }
}
class cpriority
{
	public static void main(String[] args) 
	{
    A a=new A();
	B b= new B();
	C c=new C();
	System.out.println("Thread:"+a);
    System.out.println("\nThread:"+b);
	System.out.println("\nThread:"+c);
try{
   Thread.sleep(10000);
   }catch(InterruptedException e){}
System.out.println("Priority:");
System.out.println(a.getPriority());
System.out.println(b.getPriority());
System.out.println(c.getPriority());
a.setPriority(Thread.MAX_PRIORITY);
a.start();

System.out.println(a.getPriority());
b.start();
c.start();
	}
}

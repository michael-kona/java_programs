class A extends Thread
{
 public void run()
	{
	for(int i=1;i<=5;i++)
	{
	if(i==3)
      {
	   yield();
	   }
	System.out.println("\tFrom Thread A:i="+i);
            }
	System.out.println("Exit from A");
		}
	}

class B extends Thread
{
	public void run()
	{
		for(int j=1;j<=5;j++)
		{
	System.out.println("\tFrom Thread B:j="+j);
			if(j==3)
			{
				stop();
				}
			
		}
		System.out.println("Exit from B");
		}
	}

class C extends Thread
{
	public void run()
	{
		for(int k=1;k<=5;k++)
		{
			System.out.println("\tFrom Thread C:k="+k);
			if(k==1)
			{
				try
				{
				sleep(1000);
        		}
				catch(Exception e)
				{
				}
			}
			
		}
		System.out.println("Exit from A");
		}
	}

class ThreadMethods
{
public static void main(String args[])
	{
     A a=new A();
    B b=new B();
     C c=new C();
    System.out.println("start Thread A");
    a.start();
    System.out.println("start Thread B");
     b.start();
     System.out.println("start Thread C");
     c.start();
     System.out.println("End of main Thread");
	}
}
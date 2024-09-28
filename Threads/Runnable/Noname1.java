class A 
{
	public void run()
	{
		for(int i=1;i<=5;i++)
		{
			System.out.println("Thread A:"+i);
		}
}
class B
{
	public void run()
	{
		for(int i=1;i<=5;i++)
		{
			System.out.println("Thread B:"+i);
		}
}
class C
{
	public void run()
	{
		for(int i=1;i<=5;i++)
		{
			System.out.println("Thread c:"+i);
		}
}
class cpriority
{
	public static void main(String[] args) 
	{
    A a=new A();
	B b new B();
	C c=new C();
	System.out.println("Thread:"+a);
    System.out.println("\nThread:"+b);
	System.out.println("\nThread:"+c);

System.out.println("Priority:");
System.out.println(a.getPriority());
System.out.println(b.getPriority());
System.out.println(c.getPriority());



	}
}

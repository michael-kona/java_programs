class A extends Thread
{
   public void run()
     {
      for(int i=1;i<=50;i++)
          {
	       System.out.println("Thread A:"+i);
          }
      }
}
class B extends Thread
{
   public void run()
      {
       for(int j=1;j<=50;j++)
            {
	           System.out.println("Thread B:"+j);
            }
      }
}
class C extends Thread
{
   public void run()
       {
      for(int k=1;k<=50;k++)
           {
	System.out.println("Thread c:"+k);
           }
      }
}
class extendThread
{
  public static void main(String[] args) 
     {
      A a=new A();
      B b=new B();
      C c=new C();
      a.start();
      b.start();
      c.start();
   }
}


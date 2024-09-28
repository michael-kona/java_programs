// A Simple demonstration of abstract.
abstract class A 
  {
   abstract void callme();
   // concrete methods are still allowed in abstract classes
   void callmetoo() 
     {
       System.out.println("This is a concrete method.");
       }
    }
abstract class C extends A{}//sub class also became abstract
class B extends A 
     {
      void callme()
            {
             System.out.println("B's implementation of callme");
             }
       }
class AbstractDemo 
      {
      public static void main(String args[]) 
    	{
            A a;//obj ref var of super class
            //a=new A();//abstract class obj - error - not possible
            a= new B();//obj of sub class
	  a.callme();
	  a.callmetoo();
	}
       }
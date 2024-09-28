class A 
{
    void meth() 
      {
      System.out.println("I'm in A");
      }
}
class B extends A
     { 
	 final void meth() 
      		{    System.out.println("I'm in B.");     }
       }
class C extends B 
	{
        void meth()  // ERROR! Can't override.
	  {
	   System.out.println("Illegal!");
	  }
    }

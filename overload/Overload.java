// Demonstrate method overloading.
class OverloadDemo 
  {
   void test() 
      {
      System.out.println("No parameters");
      }

// Overload test for one integer parameter.
   void test(int a) 
    {
    System.out.println("a: " + a);
    }

// Overload test for two integer parameters.
   void test(int a, int b) 
   {
   System.out.println("a and b: " + a + " " + b);
   }

// overload test for a float parameter
float test(float a) 
  {
   System.out.println("float a: " + a);
    return a*a;
   }
}//end class
 class Overload
        {
         public static void main(String args[]) 
           {
           OverloadDemo ob = new OverloadDemo();
           float result;
          // call all versions of test()
         ob.test();
         ob.test(10);
         ob.test(10, 20);
         result=ob.test(123.25f);
        System.out.println("Result of ob.test(123.25): " + result);
         }//end main
      }//end class

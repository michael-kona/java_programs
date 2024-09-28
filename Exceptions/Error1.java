class Error1
{
  public static void main(String args[])
   {
   double a[]={10,5};
   System.out.println("value of d is:"+a[1]);
  System.out.println("value of d is:"+a[2]);//runtime error occurs here
  System.out.println("value of d is:"+a[0]);//won't execute
   }
};
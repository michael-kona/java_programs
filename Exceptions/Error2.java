class Error2
 {
   public static void main(String args[])
      {
     double a[]={10,5};
         try{
	           System.out.println("value of d is:"+a[2]);
             System.out.println("value of d is:"+a[0]);
                }
        catch(ArithmeticException ae)
	        {
	        System.out.println("Error1 is:"+ae);
	        }
       catch(ArrayIndexOutOfBoundsException aiobe)
	        {
	        System.out.println(aiobe.getMessage());
	        }
         finally {
                    System.out.println("finally");
                }
          System.out.println("value of d is:"+a[1]);
     }
};
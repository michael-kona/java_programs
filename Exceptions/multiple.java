class multiple 
{
	public static void main(String args[]) 
	{
        int x=0;
	   int a[]={10,5};
        try
		  {
	       x=a[2]/a[1]-5;
	       x=a[0]/a[1]-5;
		  }
        catch(ArithmeticException e)
            {
	           System.out.println("error is:"+e);
            }
        catch(ArrayIndexOutOfBoundsException e)
		      {
	           System.out.println("out of bounds");
		      }
		catch(Exception e)
		      {
                System.out.println(e);
		      }
        System.out.println("x="+x);
	}
}

class finally2
{
	public static void main(String[] args) 
	{
	int a[]={10,5};
               //first use of finally
	try{
                    System.out.println("value in array is:"+a[0]);
	       }
	catch(Exception e)
		{
		System.out.println("\nException Occured"+e);
		}
	finally
		{
                                System.out.println("\nThis is finally without error!");
		}
               //second use of finally	
		try{
	System.out.println("\nvalue in array is:"+a[2]);
		}
		catch(Exception e)
		{
		System.out.println("\nException Occured"+e);
		}
		finally
		{
System.out.println("\nThis is finally with exception and corresponding catch!");
		}
               //third use of finally
		try{
	System.out.println("\nvalue in array is:"+a[2]);
		}
		catch(ArithmeticException e)
		{
		System.out.println("\nException Occured"+e);
		}
		finally
		{
System.out.println("\nThis is finally with error no corresponding catch!");
		}
	}
}

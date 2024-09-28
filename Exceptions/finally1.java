class finally1 
{
	public static void main(String[] args) 
	{
		int a[]={10,5};
		try{
		System.out.println("value in array is:"+a[2]);
		}
		catch(ArithmeticException e)
		{
		System.out.println("Exception Occured"+e);
		}
		finally
		{
                 	System.out.println("This is finally!");
 		}
	}
}

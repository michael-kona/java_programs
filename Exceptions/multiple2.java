class multiple2 
{
	public static void main(String args[]) 
	{
	   int x=0,a=0;
	   int n=args.length;
	  for(int i=0;i<= n;i++)
	     {
	     try
	        {
		 a=Integer.parseInt(args[i]);
		x=a+5;
		System.out.println("\n in try x is:"+x);
	        }
	catch(NumberFormatException e)
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
    }
     System.out.println("x="+x);
	}
}

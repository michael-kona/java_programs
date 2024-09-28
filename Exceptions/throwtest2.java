class UserException extends Exception
{
UserException(String msg)
	{
	super(msg);
	}
}
class throwtest2
	{
	
	static void print(int a) throws UserException
	{
      if(a<5)
		{
	    throw new UserException(" Very less value");
		}
		else
		{
         System.out.println("a:"+a);
		}
	}
		public static void main(String[] args) 
	      {
        	
			try
				{
			    print(7);
	 		    print(3);
	     		}
		catch(Exception e)
			{
			System.out.println("error--->"+e);
				}
			}
	};

class throw1 
{
void print(int a) throws Exception
	{
      if(a<5)
		{
	    throw new Exception(" Very less value");
		}
		else
		{
         System.out.println("a:"+a);
		}
	}
	};
class throwtest1
	{
		public static void main(String[] args) 
	      {
        	throw1 t1=new throw1();
			try
				{
			    t1.print(7);
	 		    t1.print(3);
	     		}
		catch(Exception e)
			{
			System.out.println("error----->"+e);
				}
			}
	};

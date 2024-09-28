class MyException extends Exception 
	{
	public MyException(String msg)//constructor
		{
		super(msg);//calling superclass constructor
		}
	}
public class Test1
	{
static int  divide(int first,int second) throws MyException
	{ 
	if(second==0) 
	       {
                    throw new MyException("can't be divided by zero");
                       }
                else
	      {
	     return first/second;
                      }
	}
 public static void main(String[] args) 
	 {
	try 
		{
		System.out.println(divide(4,0));
		  }
	catch (MyException e) 
		{
		System.out.println("Error is"+e);
		  }
	}
}

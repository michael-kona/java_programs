import java.util.*;
class alpha
    {
      public static void main(String args[])
          {
	Scanner s=new Scanner(System.in);
	System.out.println("Enter a char:");
	char ch=s.next().charAt(0);
	if((ch>=65 &&ch<=90)||((ch>=97 &&ch<=122)))
	     {
		System.out.println("Alphabhet");	
	      }
	else
	{
		System.out.println("Not an Alphabhet");	
	}
           }
     }
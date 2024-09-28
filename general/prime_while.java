import java.util.*;
class prime_while
    {
      public static void main(String args[])
          {
	Scanner s=new Scanner(System.in);
	System.out.println("Enter an integer:");
	int n=s.nextInt();
	int i=2,f=0;
	while(i<n/2)
		{
		      if(n%i==0)
		          {
			System.out.println("Not a prime");
			f=1;
			break;
		           }
		    i++;
		}
	if(f==0)
   		{
	  	System.out.println("prime");    
		    }		
           }
     }
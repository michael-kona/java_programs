import java.util.*;
class for_fact
    {
      public static void main(String args[])
          {
	Scanner s=new Scanner(System.in);
	System.out.println("Enter an integer:");
	int n=s.nextInt();
	int i,f;
	for(i=n,f=1;i>0;i--)
 	    {
 		f=f*i;
	     }	
	System.out.println("factorial of "+n+" is:"+f);
           }
     }

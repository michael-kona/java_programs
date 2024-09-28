import java.util.*;
class grade
    {
      public static void main(String args[])
          {
	Scanner s=new Scanner(System.in);
	System.out.println("Enter one subject Marks:");
	int m=s.nextInt();
	if(m>=0&&m<=39)
	     {System.out.println("Fail");	 }
	else if(m>=40&&m<=49)
	     {System.out.println("Third");	 }
	else if(m>=50&&m<=59)
	     {System.out.println("Second"); }
	else if(m>=60&&m<=79)
	     {System.out.println("First");	 }
	else if(m>=80&&m<=100)
	     {System.out.println("Distinction");	 }
	else {System.out.println("value shud b 0-100 only");	 }
		
           }
     }
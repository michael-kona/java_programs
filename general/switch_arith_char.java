import java.util.*;
class arith_switch
    {
      public static void main(String args[])
          {
	Scanner s=new Scanner(System.in);
	System.out.println("Enter arith operation as string:");
	String str=s.next();
	int a=str.charAt(0)-48;
	int b=str.charAt(2)-48;
	switch(str.charAt(1))
	        {
		case '+':System.out.println(a+b);
			break;
		case '-':System.out.println(a-b);
			break;
		case '*':System.out.println(a*b);
			break;
		default:System.out.println("Improper i/p");
	          }
		
           }
     }
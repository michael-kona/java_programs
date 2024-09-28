import java.util.*;
public class Main
{
	public static void main(String[] args) 
	{
	    Scanner s=new Scanner(System.in);
	    int m=s.nextInt();
	    if(m>=0 && m<=39){System.out.println("F");}
	    else if(m>=40 && m<=49){System.out.println("E");}
	    else if(m>=50 && m<=59){System.out.println("D");}
	    else if(m>=60 && m<=69){System.out.println("C");}
	    else if(m>=70 && m<=79){System.out.println("B");}
	    else if(m>=80 && m<=100){System.out.println("A");}
	    else{System.out.println("Invalid Marks");}
	    
	}
}

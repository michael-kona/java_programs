import java.util.*;
public class Main
{
	public static void main(String[] args) 
	{
	    Scanner s=new Scanner(System.in);
	    int n=s.nextInt();
	    int f=0;
	    for(int i=2;i<=n/2;i++)
	    {
	        if(n%i==0){f=1;break;}
	    }
	    if(f==0){System.out.println("PRIME");}
	    else{System.out.println("NOT PRIME");}
	}
}

import java.util.*;
public class Main
{
	public static void main(String[] args) 
	{
	    Scanner s=new Scanner(System.in);
	    String ch=s.next();
	    char c=ch.charAt(0);
	    if((c>='a' && c<='z')||(c>='A' && c<='Z'))
	    {
	    if(c=='a' ||c=='e' || c=='i' || c=='o' ||c=='u'||c=='A' ||c=='E' || c=='I' || c=='O' ||c=='U')
	    {
	        System.out.println("Vowel");
	    }
	    else
	    {
	        System.out.println("Consonant");
	    }
	    }
	    else{
	        System.out.println("Not an alphabhet");
	    }
	}
}

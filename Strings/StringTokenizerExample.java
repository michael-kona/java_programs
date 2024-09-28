import java.util.*;
public class Main {
	public static void main(String args[])
	{
		System.out.println("Using Constructor 1 - ");
		StringTokenizer st1 = new StringTokenizer("Hello EEE How are you", " ");

		while (st1.hasMoreTokens())
                { System.out.println(st1.nextToken()); }

		System.out.println("Using Constructor 2 - ");
        StringTokenizer st2 = new StringTokenizer("JAVA : Code : String", " :");
		while (st2.hasMoreTokens()){
			System.out.println(st2.nextToken());
		}

	}
}

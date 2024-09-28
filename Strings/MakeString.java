// Construct one String from another.
class MakeString 
    {
     public static void main(String args[]) 
	{
	char c[] = {'n', 'i', 'c', 'e'};
	String s1 = new String(c);
	String s2 = new String(s1);
	System.out.println(s1);
	System.out.println(s2);
	}
     }
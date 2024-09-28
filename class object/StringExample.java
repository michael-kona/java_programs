class StringExample 
{
	public static void main(String[] args) 
	{
		System.out.println("Hello World!");
		
 		String s1=new String();
		s1="Hi How R u?";

		String s2=new String("I am Fine Dude!");

		String s3=new String(s2);
		
		String s4="Then Whats up?";
		
		char ch[]={'M','i','c','h','a','e','l'};

		String s5=new String(ch);

		System.out.println("s1.charAt(4)="+s1.charAt(4));
		System.out.println("s2.endswith()="+s2.endsWith("Dude!"));
		System.out.println("s3.length()="+s3.length());
		System.out.println("s4.substring(3,8)="+s4.substring(3,8));
		System.out.println("s5.toUpperCase()="+s5.toUpperCase());
	}
}




		

         
		


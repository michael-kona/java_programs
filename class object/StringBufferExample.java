class StringBufferExample 
{
	public static void main(String[] args) 
	{
	
		StringBuffer sb2=new StringBuffer("I am Fine Man");

		String s="Then Whats Up";
		StringBuffer sb3=new StringBuffer(s);
        sb2.setCharAt(4,'i');
        System.out.println(sb2);
        sb2.append(s);
		System.out.println(sb2);
        sb3.deleteCharAt(4);
		System.out.println(sb3);
        sb3.delete(6,8);
		System.out.println(sb3);
        System.out.println(sb3.reverse());
 		System.out.println("Hello World!");
	}
}

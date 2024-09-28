class  superclass
{
	protected int n=10;
	public void print()
	{
		System.out.println("super class n="+n);
	}
}
class  subclass extends superclass
{
	protected int m=20;
	public void print()
	{
		System.out.println("sub class m="+m);
		System.out.println("sub class n="+n);
	}
}
class RP
	{
	public static void main(String[] args) 
	{
	superclass sp;//superclass reference
	sp=new superclass();
	sp.print();
	sp=new subclass();
    sp.print();
	}
}

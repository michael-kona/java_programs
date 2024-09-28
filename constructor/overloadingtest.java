class overloading 
{
	int area(int s)
	{
		return(s*s);
	}
	int area(int l,int b)
	{
		return(l*b);
	}
	 double area(int h,double b)
	{
		return(b*h/2);
	}
}
class overloadingtest
{
public static void main(String args[]) 
	{
	overloading o=new overloading();
		System.out.println("Square area:"+o.area(4));
		System.out.println("\nRect area:"+o.area(3,4));
		System.out.println("\nTri area:"+o.area(3,4.0));
	}
};

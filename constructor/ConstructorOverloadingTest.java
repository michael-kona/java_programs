class cpolygon 
{
	private int w,h;
	cpolygon()//No parameter constructor
	{
		this.w=5;
		this.h=5;
	}
	cpolygon(int w)//overloading constructor with 1 int
	{
		this.w=w;
		this.h=w;
	}
	cpolygon(int w,int h)//overloading constructor with 2 int
	{
		this.w=w;
		this.h=h;
	}
	int area()
	{
		return(this.w*this.h);
	}
}
class ConstructorOverloadingTest
{
	public static void main(String args[])
	{
	cpolygon c1=new cpolygon();//calls no parameter constructor
	cpolygon c2=new cpolygon(6);//calls 1 int constructor
	cpolygon c3=new cpolygon(6,10);//calls 2 int constructor

	System.out.println("ARea of c1 is:"+c1.area());
	System.out.println("ARea of c2 is:"+c2.area());
	System.out.println("ARea of c3 is:"+c3.area());
	}
};
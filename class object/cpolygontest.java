class cpolygon 
{
private int w,h;//declaration of variables
public cpolygon(){}
public cpolygon(int w,int h)//constructor
	{
		this.w=w;
		this.h=h;
	}
	public int area()
	{
	return(this.w*this.h);
	}
}
class cpolygontest
{
	public static void main(String args[])
	{
	cpolygon c1;//obj. ref. var.
	c1=new cpolygon();
	
	cpolygon c2=new cpolygon(5,6);
	System.out.println("c1:"+c1.area());
	System.out.println("c2:"+c2.area());
	
	}
};

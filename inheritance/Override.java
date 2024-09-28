class CRectangle 
{
protected int w,h;
void set_values(int a,int b)
	{
	w=a;
	h=b;
	}
int area()
	{
	return(w*h);
	}
}
class CTriangle extends CRectangle
{
int area()
	{
	return(w*h/2);
	}
}
class Override
{
public static void main(String args[])
	{
	CRectangle r=new CRectangle();
	r.set_values(5,6);
	System.out.println("area of rect:"+r.area());

	CTriangle t=new CTriangle();
	t.set_values(5,6);
	System.out.println("area of tri:"+t.area());

	}
}

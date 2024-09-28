class cpolygon 
{
protected int w,h;
void set_values(int a,int b)
	{
	this.w=a;
	this.h=b;
	}
}
class ctriangle extends cpolygon
{
	int area()
	{
		return(w*h/2);

	}
};

class crectangle extends cpolygon
{
	int area()
	{
		return(this.w*this.h);

	}
};
class Hierarchical
{
	public static void main(String[] args) 
	{
		crectangle r=new crectangle();
		r.set_values(3,4);
		System.out.println("rarea is :"+r.area());
		ctriangle t=new ctriangle();
		t.set_values(3,4);
		System.out.println("tarea is :"+t.area());

	}
}

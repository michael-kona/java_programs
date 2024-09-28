class c1 
{
	int w,h;
	c1()
	{
		w=5;
		h=5;
	}
	c1(int w)
	{
		this.w=w;
		h=5;
	}
	c1(int w,int h)
	{
		this.w=w;
		this.h=h;
	}
	int area()
	{
	return(w*h);
	}
}
class c1main

	public static void main(String[] args) 
	{
		c1 a=new c1();
		c1 b=new c1(3);
		c1 c=new c1(3,4);
		System.out.println("area of a:"+a.area());
    		System.out.println("area of b:"+b.area());
		System.out.println("area of c:"+c.area());
	}
}

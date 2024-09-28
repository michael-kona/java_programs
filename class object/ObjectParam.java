class cpolygon
{
	private int w,h;
	cpolygon(){}
cpolygon(int w,int h)
	{
	this.w=w;
	this.h=h;
	}
	void copy(cpolygon c)
	{
	this.w=c.w;
	this.h=c.h;
	}
	boolean equals(cpolygon c)
	{
		if((c.w==this.w)&&(c.h==this.h))
		{
			return true;
		}
		else
		{
		return false;
		}
	}
int area()
	{
	return w*h;
	}

}



class  ObjectParam
{
	public static void main(String[] args) 
	{
	cpolygon c1,c2,c3,c4;
	c1=new cpolygon();
	System.out.println(c1.area());
	c2=new cpolygon(3,4);
	System.out.println(c2.area());
	c1.copy(c2);
	System.out.println(c1.area());
	boolean e=c1.equals(c2);
	if(e)
		{
		System.out.println("c1 is equals to c2");
		}
	else
		{
		System.out.println("c1 is not equals to c2");
		}
		c3=new cpolygon(4,5);
	    e=c2.equals(c3);
		System.out.println("c3 is eqauls to c2:"+e);
	}
}

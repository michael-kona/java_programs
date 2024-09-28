class cpolygon 
{
	private int w,h;//declaration of variables
	public void get_values(int w,int h)
	{
	    this.w=w;
	    this.h=h;
	}
	public int area()
		{
		return(this.w*this.h);
		}
}

class ObjectExample
{
	public static void main(String[] args) 
	{
		{
cpolygon a;//obj. ref. var.
a=new cpolygon();
    	cpolygon c1=new cpolygon();	
	//c1.w=9;//error , w is private
    	c1.get_values(3,4);
    	System.out.println(c1.area());
    	cpolygon c2=new cpolygon();	
    	c2.get_values(5,4);
    	System.out.println(c2.area());
		}	
	}
}

class cpolygon 
{
      private int w,h;//instance variables
     cpolygon(int w,int h)//constructor which has class name as its name
	{this.w=w;
	this.h=h;}
             int area()
	{ return(this.w*this.h);	}
}
class constructortest
{
	public static void main(String args[])
	{
	//cpolygon c2=new cpolygon();//error
	cpolygon c3=new cpolygon(6,10);
	System.out.println("ARea of c3 is:"+c3.area());
	}
};
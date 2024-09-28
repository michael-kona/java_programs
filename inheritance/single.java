class cpolygon 
{
protected int w,h;
cpolygon(int w,int h)//constructor
	{this.w=w;
	this.h=h;}
}
class crectangle extends cpolygon
{      crectangle(int w,int h)//sub class constructor
	{super(w,h);//calling super class constructor
                }
	int area()
	{  return(this.w*this.h);  }
};
class single
{
	public static void main(String[] args) 
	{
		crectangle r=new crectangle(3,4);
                                   System.out.println("area is :"+r.area());
	}
}

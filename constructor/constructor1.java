class cpolygon 
{
      private int w,h;

     cpolygon(int a,int b)//constructor which will 
                      //have class name as its name
	{
	w=a;
	h=b;
	}
     int area()
	{
	return(w*h);
	}
}
class constructor1
{
	public static void main(String args[])
	{
         cpolygon c3=new cpolygon(6,10);
        System.out.println("ARea of c3 is:"+c3.area());
	cpolygon c4=new cpolygon();
	}
};
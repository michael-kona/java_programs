class ClassExample 
{
	int w,h;
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
class classExample1
       {
       public static void main(String[] args) 
        {
        ClassExample c=new ClassExample();
        c.set_values(3,4);
       System.out.println("area() is:"+c.area());
       }
}

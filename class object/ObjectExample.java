class cpolygon 
{
	private int w,h;//declaration of variables
	public cpolygon(int a,int b)//constructor
		{
		w=a;
		h=b;
		}
	public int area()
		{
		return(w*h);
		}
}

class ObjectExample
{
	public static void main(String[] args) 
	{
		{
    			cpolygon c1=new cpolygon(3,4);//obj. creation
			System.out.println(c1.area());
			//c1.w=7;
			cpolygon c2;//obj. ref. var.
	 		c2=new cpolygon(4,5);//obj. creation
     			if(c1.equals(c2))
				{
				System.out.println("Both objects are equal");
				}
	 		else
				{
		 	System.out.println("Both objects are not equal");
				}
 			System.out.println(c1.toString());
			System.out.println(c2.toString());
		}	
	}
}

class MathOperation 
{
static  double x,y;
static double mul()
	{
                     return x*y;
	}
}
class MathApplication
{
     public static void main(String[] args) 
	{
	MathOperation.x=6.0;
	MathOperation.y=4.0;
	double a=MathOperation.mul();
       System.out.println("a="+a);
       }
  };
package B;
import A.Base;
import A.Derived;
public class  pack
{
	public static void main(String[] args) 
	{
		Base b=new Base();
		Derived d=new Derived();
		b.Display();
		d.show();
		System.out.println("Hello World!");
	}
}


class student 
{
protected int roll;
void get_roll(int roll)
	{
	this.roll=roll;
	}
protected void put_roll()
	{
	System.out.println("\nroll:"+roll);
	}
}
class test extends student
{
protected int s1,s2;
void get_marks(int s1,int s2)
	{
	this.s1=s1;
	this.s2=s2;
	}
protected void put_marks()
	{
	System.out.println("\ns1:"+s1);
	System.out.println("\ns2:"+s2);
	}
};
interface sports
{
	int sportswt=5;
	public void put_wt();
}
class result extends test implements sports
{
	protected int total;
	public void put_wt()
	{
	System.out.println("sports wt:"+sportswt);
	}
	void display()
	{
	total=s1+s2+sportswt;
	put_roll();
	put_marks();
	put_wt();
	System.out.println("\nTotal:"+total);
	}
};
class multiple 
{
	public static void main(String args[])
	{
		result r =new result();
		r.get_roll(1223);
		r.get_marks(67,89);
		r.display();
	}
};
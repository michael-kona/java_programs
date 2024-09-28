class student 
{
	protected int roll;
	public student(int roll)
	{
		this.roll=roll;
	}
	public void setRoll(int roll)
	{
		this.roll=roll;
	}
	int getRoll()
	{
		return roll;
	}
}
class test extends student
{
	protected int s1,s2;
	public test(int roll,int s1,int s2)
	{
		super(roll);//   this.roll=roll;
		this.s1=s1;
		this.s2=s2;
	}
	void put_marks()
	{
		System.out.println("\nroll:"+this.roll);
		System.out.println("\nS1:"+this.s1);
		System.out.println("\nS2:"+this.s2);
	}
};
class result extends test
{
	protected int total;
	public result(int roll,int s1,int s2)
	{
		super(roll,s1,s2);
		this.total=this.s1+this.s2;
	}
	void display()
	{
		System.out.println("roll"+this.roll);
		put_marks();
		System.out.println("Total:"+total);
	}
};
class multilevel
{
	public static void main(String args[])
	{
      result r =new result(1223,67,78);
	  r.display();
	}
};
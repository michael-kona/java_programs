class Employee
  {
      private int empid;
      private String ename;
      private float esal;
      private String dept;
      public Employee()
                {
                   this.empid=05;
	  this.ename="AA";
	  this.esal=0.25F;
	  this.dept="ECE";
                  }
      public Employee(int id,String nam,float sal,String d)
                {
                   this.empid=id;
	  this.ename=nam;
	  this.esal=sal;
	  this.dept=d;
                  }

      public void printEmployee()
              {
	System.out.println(this.empid);
	System.out.println(this.ename);
	System.out.println(this.esal);
	System.out.println(this.dept);
	}
   }
class EmpExp
    {
       public static void main(String[] args)
           {
                  Employee e1=new Employee();
	e1.printEmployee();
                	Employee e2;//obj. ref. var.
	e2=new Employee(13,"AAA",67.89F,"ECE");
	e2.printEmployee();
            }
}
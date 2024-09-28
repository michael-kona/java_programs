class person
{ protected String name;
  protected int age;
  public person(String name,int age)
         {
         this.name=name;
         this.age=age;
         }
  public void display()
       {
       System.out.println("Name:"+this.name);
       System.out.println("Age:"+this.age);
       }
        
}
class Employee extends person
{ protected float sal;
  protected int empid;
  public Employee(String name,int age,float sal,int empid)
         {
         super(name,age);
         this.sal=sal;
         this.empid=empid;
         }
  public void display()//override
       {
       super.display();
       System.out.println("Salary:"+this.sal);
       System.out.println("EmpID:"+this.empid);
       }
        
}
class Manager extends Employee
{ protected float hra;
  public Manager(String name,int age,float sal,int empid,float hra)
         {
         super(name,age,sal,empid);
         this.hra=hra;
         }
  public void display()//override
       {
       super.display();
       System.out.println("HRA:"+this.hra);
       }     
}
class ML
    {
    public static void main(String args[])
        {
        //compile time polymorphism
        person p=new person("AAA",12);
        p.display();
        Employee e=new Employee("BBB",14,23.24F,1234);
        e.display();
        Manager m=new Manager("BBB",14,23.24F,1234,2.3F);
        m.display();
        //dynamic method dispatch
        //Runtime Ploymorphism
    
        person p1;
        p1=new person("AAA",12);
        p1.display();
        p1=new Employee("BBB",14,23.24F,1234);
        p1.display();
        }
    }
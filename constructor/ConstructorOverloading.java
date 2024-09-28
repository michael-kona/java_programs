class Person
{
//variables
private String pname;
private int page;
private String pgender;
//constructor overloading
public Person(){}
public Person(String name,int age,String gender)
{
    this.pname=name;
    this.page=age;
    this.pgender=gender;
}
public Person(String name)
{       this.pname=name;    }
public void display()
    {
    System.out.println("Name of the Person:"+this.pname);
    System.out.println("Age of the Person:"+this.page);
    System.out.println("Gender of the Person:"+this.pgender);
    }
}
class ConstructorOverloading
{
    public static void main(String args[])
    {//instantiation
        Person p1=new Person("Abhishek",20,"Male");
        p1.display();
        Person p2=new Person();
        p2.display();
        Person p3=new Person("Suresh");
        p3.display();
    }
}
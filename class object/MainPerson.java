class Person
{
//instance variables
private String pname;
private int page;
private String pgender;
//methods
public void get_values(String name,int age,String gender)
{
    this.pname=name;
    this.page=age;
    this.pgender=gender;
}
public void display()
    {
    System.out.println("Name of the Person:"+this.pname);
    System.out.println("Age of the Person:"+this.page);
    System.out.println("Gender of the Person:"+this.pgender);
    }
}
class MainPerson
{
    public static void main(String args[])
    {
        Person p1;//object reference variable
        p1=new Person();//instantiation
        //p1.age=20;//error
        p1.get_values("Abhishek",20,"Male");
        p1.display();
        Person p2=new Person();
        p2.get_values("Suresh",23,"Male");
        p2.display();
    }
}
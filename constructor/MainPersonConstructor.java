class Person
{
//variables
private String pname;
private int page;
private String pgender;
//methods
//constructor
public Person(String name,int age,String gender)
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
        Person p1=new Person("Abhishek",20,"Male");//instantiation
        p1.display();
        //Person p2=new Person();//error
    }
}
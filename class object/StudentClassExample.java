class Student
{
    private String name;
    private int roll;
    private int[] marks;
    public void getStudentDetails(String n,int r,int[] m)
           {
               name=n;
               roll=r;
               marks=m;
             }
    public void printStudentDetails()
             {
	System.out.println("Student Name: "+name);
	System.out.println("Student Roll: "+roll);
	System.out.println("Student Marks: ");
	for(int i=0;i<marks.length;i++)
                      {
	System.out.println(marks[i]);
                       }
              }
}
class StudentExample
      {
         public static void main(String args[])
                 {
                     Student s1=new Student();
                     //s1.roll=1223;
                     int[] m1=new int[] {34,45,56};
                     s1.getStudentDetails("michael",1223,m1);
	    s1.printStudentDetails();
	  Student s2=new Student();
                     int[] m2=new int[] {89,78,67};
                     s2.getStudentDetails("nelson",1223,m2);
	    s2.printStudentDetails();
                  }
         }
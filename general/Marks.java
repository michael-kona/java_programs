import java.util.Scanner;
class Marks
 {
  public static void main(String args[])
   {
  Scanner s=new Scanner(System.in);
System.out.println("Enter no. of sub:");
  int n=s.nextInt();
     int a[]= new int[n];
     for(int i=0; i<n; i++)
             {
          System.out.println("Enter Marks "+i+":");
          a[i]=s.nextInt();
            }
      int total=0;
      for(int i=0;i<n; i++) 
        {
         total=total+a[i];
         }
      System.out.println("Total="+total);
      System.out.println("Average="+(float) total/n);
  }
}
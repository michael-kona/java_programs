import java.io.*; 
class GeneralIO
{
public static void main(String args[])
    {
   int a=0;
System.out.println("enter an integer:");
   try
    {
       DataInputStream dis= new DataInputStream(System.in); 
       a=Integer.parseInt(dis.readLine()); 
    }
    /*catch(NumberFormatException e)
        {
            System.out.println("Runtime Error:Number only");     
        }*/
    catch(IOException e)
        {
            System.out.println("Runtime Error:Number only");     
        }
    System.out.println("a="+a); 
    }
}

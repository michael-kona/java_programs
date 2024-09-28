import java.util.*;
class StringExample
   {
    public static void main(String args[])
       {
         String str1="Welcome";
         StringBuffer sb1=new StringBuffer(str1);
          sb1.delete(0,4);
        System.out.println(sb1);
       sb1.deleteCharAt(0);
        System.out.println(sb1);
       sb1.insert(0,"welc");
        System.out.println(sb1);
        sb1.reverse();        
System.out.println(sb1);
        sb1.setCharAt(0,'H');
        System.out.println(sb1);
      Scanner s=new Scanner(System.in);
      int n=s.nextInt();
StringBuffer sb2=new StringBuffer();
      for(int i=1;i<=n;i++)
            {
               sb2.append(s.next());
             }   
        System.out.println(sb2);
        }
   } 
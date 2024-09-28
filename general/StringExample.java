class StringExample
   {
    public static void main(String args[])
       {
         String str1="Welcome";
         String str2=new String();
        String str3=new String("Program");
        System.out.println(str1);
        for(int i=0;i<str1.length();i++)
              {
                System.out.println(str1.charAt(i));
              }
         String str4=str3.concat("ming");
               System.out.println(str4);
               System.out.println(str3);
               System.out.println(str4.substring(0,7));
                System.out.println(str4.substring(7));
        }
   } 
class StringExample
    {
    public static void main(String args[])
        {
        String s1="PVPSIT";
        String s2=new String("EEE");
        char ch[]={'v','j','a'};
        String s3=new String(ch);
        
        System.out.println("College Name:"+s1);
        System.out.println("Department Name:"+s2);
        System.out.println("Location:"+s3);
        
        System.out.println("Length of s1:"+s1.length());
        System.out.println("char of s1 at index 1:"+s1.charAt(1));
        System.out.println("substring of s1 3-5:"+s1.substring(3,5));
        s1=s1.concat("is in vja");
        System.out.println(s1);
        }
    }
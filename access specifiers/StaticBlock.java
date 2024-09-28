// Java Program to Illustrate How Static block is Called
 
class Test {
     static int i;   //Static variable
      int j;     //non-static variables  or instance variable
     //Static block
    static
    { i = 10;
        System.out.println("static block called ");
    }
}
class  StaticBlock{
    public static void main(String args[])
    {
         // Although we don't have an object of Test, static block is called because i is being accessed in
        // following statement.
        System.out.println(Test.i);
    }
}
/*static block is executed only once: the first time the class is loaded into memory. */
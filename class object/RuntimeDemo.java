public class RuntimeDemo
   {
     public static void main(String args[])throws Exception
        {
	Runtime rt=Runtime.getRuntime();
	Process npad=rt.exec("notepad.exe");
	System.out.println("Total memory :"+rt.totalMemory());
	System.out.println("free memory :"+rt.freeMemory());
	}
}

		
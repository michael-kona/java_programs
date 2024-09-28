import java.util.*;
class ArrayListExample1 {
    public static void main(String[] args)
    {
        ArrayList<Integer> arr1 = new ArrayList<Integer>(5);
        ArrayList<String> arr2 = new ArrayList<String>();
        System.out.println("Array 1:" + arr1);
        System.out.println("Array 2:" + arr2);
        for (int i = 1; i <= 5; i++) 
	{
            arr1.add(i);
        	}
        arr2.add("ECE");
        arr2.add("EEE");
        arr2.add("ME");
        System.out.println("Array 1:" + arr1);
        System.out.println("Array 2:" + arr2);
        arr1.add(1,11);
        System.out.println("Array 1:" + arr1);
    }
}
import java.util.*;
class StackExample1
 {
    public static void main(String[] args)
    {

        Stack stack1 = new Stack();
        Stack<Float> stack2 = new Stack<Float>();

        // pushing the elements
        stack1.push("ECE");
        stack1.push("EEE");
        stack1.push("ME");

        stack2.push(120.78F);
        stack2.push(300.0F);
        stack2.push(74.7F);

          // Printing the Stack Elements
        System.out.println(stack1);
        System.out.println(stack2);
        System.out.println("Is Stack1 empty?:"+stack1.empty());
         System.out.println(stack1.pop());
        System.out.println(stack1.pop());
        System.out.println(stack1.pop());
        System.out.println("Is Stack1 empty?:"+stack1.empty());
	        System.out.println("top of the stack2 is"+stack2.peek());
	System.out.println(stack2);
    }
}
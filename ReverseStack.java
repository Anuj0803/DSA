import java.util.*;;
public class ReverseStack {
	
	public static void reverse(Stack<Integer> s , Stack<Integer> newStack ) {
		while(!s.isEmpty()) {
			int top = s.pop();
			newStack.push(top);
		}
	}

   public static void main(String args[]) {
	   Stack<Integer> s = new Stack<Integer>();
	   s.push(1);
	   s.push(2);
	   s.push(3);
	   Stack<Integer> newStack = new Stack<Integer>();
	  reverse(s, newStack);
	  System.out.println("After reverse");
	   while(! newStack.isEmpty()) {
		   System.out.println(newStack.peek());
		   newStack.pop();
	   }
   }
}

import java.util.*;
public class DeleteMiddleOfStack {

	public static void DeleteMiddle(Stack<Integer> s , int n , int curr) {
		 if (s.empty() || curr == n)
	            return;
	         
	        // Remove current item
	        int x = s.pop();
	         
	        // Remove other items
	        DeleteMiddle(s, n, curr+1);
	         
	        // Put all items back except middle
	        if (curr != n/2)
	            s.push(x);
	}
	
	
	public static void main(String args[]) {
		Stack<Integer> s = new Stack<Integer>();
		s.push(1);
		s.push(2);
		s.push(3);
		s.push(4);
		s.push(5);
		DeleteMiddle(s, s.size(), 0);
		while(!s.isEmpty()) {
			System.out.println(s.peek());
			s.pop();
		}
	}
}

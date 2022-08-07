import java.util.*;
public class pushAtBottomStack {
    public static void PushAtBottom(int data , Stack<Integer> s) {
    	if(s.isEmpty()) {
    		s.push(data);
    		return ;
    	}
    	int top = s.pop();
    	PushAtBottom(data, s);
    	s.push(top);
    }
	public static void main(String args[]) {
		Stack<Integer> s = new Stack<Integer>();
		s.push(1);
		s.push(2);
		s.push(3);
		
		PushAtBottom(4, s);
		
		while(!s.isEmpty()) {
			System.out.println(s.peek());
			s.pop();
		}
	}
}

import java.util.*;
public class SortAStack {
	public static void sort(Stack<Integer> s) {
	    ArrayList<Integer> a = new ArrayList<Integer>();
	    while(!s.isEmpty()) {
	    	a.add(s.pop());
	    }
	    a.sort(null);
	    for(int i=0;i<a.size();i++) {
	    	s.push(a.get(i));
	    }
	}
	public static void main(String args[]) {
		Stack<Integer> s = new Stack<Integer>();
		s.push(12);
		s.push(3);
		s.push(5);
		s.push(20);
		s.push(7);
		s.push(1);
		sort(s);
		while(!s.isEmpty()) {
			System.out.println(s.peek());
			s.pop();
		}
	}
}

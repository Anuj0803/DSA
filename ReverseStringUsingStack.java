import  java.util.*;
public class ReverseStringUsingStack {
 public static void main(String args[]) {
	 String S = "Hello";
	 Stack<Character> s = new  Stack<Character>();
	 for(int i=S.length()-1;i>=0;i--) {
		 s.push(S.charAt(i));
	 }
	 while(! s.isEmpty()) {
		 System.out.println(s.peek());
		 s.pop();
	 }
 }
}

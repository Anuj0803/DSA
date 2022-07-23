import java.util.*;
public class SubsequenceOfString {
	
	public static void Subsequence(String str , int index , String newStr) {
		if(index==str.length()) {
			System.out.println(newStr);
			return;
		}
		
		char currChar = str.charAt(index);
		Subsequence(str, index+1, newStr+currChar);
		Subsequence(str, index+1, newStr);
	}
	
	public static void main(String args[]) {
		String str ="abc";
		Subsequence(str, 0, "");
	}

}

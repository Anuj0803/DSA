import java.util.*;
public class ReverseString {
    public static void Reverse(String str ,int index) {
    	if(index<0) {
    		return ;
    	}
    	System.out.print(str.charAt(index));
    	Reverse(str, index-1);
    }
    public static void main(String args[]) {
    	String str = "Abcde";
    	Reverse(str, str.length()-1);
    }
}

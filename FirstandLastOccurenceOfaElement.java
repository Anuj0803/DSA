import java.util.*;
public class FirstandLastOccurenceOfaElement {
	public static int first =-1;
	public static int last =-1;
	public static void FirstLast(String str , int index  , char ch) {
		if(index==str.length()-1) {
			System.out.println(first);
			System.out.println(last);
			return;
		}
		if(str.charAt(index)==ch) {
			if(first==-1) {
				first=index;
			}
			else 
				last =index;
		}
		FirstLast(str, index+1, ch);
	}
	
    public static void main(String args[]) {
    	FirstLast("abcaabae",0, 'b');
    }
}

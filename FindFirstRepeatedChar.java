import java.util.*;
public class FindFirstRepeatedChar {
	public static char repeatedCharacter(String s) {
		 int cnt[]= new int[26];
		    for(char ch:s.toCharArray()) if(++cnt[ch-'a']==2) return ch;
		    return 'a';
    }
	
	public static void main(String args []) {
		System.out.println(repeatedCharacter("abcdd"));
	}
}

import java.util.*;
public class StringPermutations {
  public static void Permutations(String str ,String newStr ) {
	  if(str.length()==0) {
		  System.out.println(newStr);
		  return;
	  }
	  for(int i=0;i<str.length();i++) {
	  char currchar = str.charAt(i);
	  String str2  = str.substring(0,i)+ str.substring(i+1);
	  Permutations(str2, newStr+currchar);
	 }
  }
  public static void main(String args[]) {
	  Permutations("abc", "");
  }
}

import java.util.*;
public class MoveXtoEndOfString {
      public static void MoveX(String str , int index , int count , String newstr) {
    	  if(index==str.length()) {
    		  for(int i=0;i<count ;i++) {
    			  newstr = newstr +'x' ;
    		  }
    		  System.out.println(newstr);
    		  return;
    	  }
    	  if(str.charAt(index)=='x') {
    		  MoveX(str, index+1, count+1, newstr);
    	  }
    	  else
    		  MoveX(str, index+1, count, newstr+str.charAt(index));
    	
      }
      public static void main(String args[]) {
    	MoveX("axbcxxdx", 0, 0, "");  
      }
}

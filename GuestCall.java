import java.util.*;
public class GuestCall {
	public static int Call(int n) {
		if(n<=1) {
			return 1;
		}
		//Single
		int single = Call(n-1);
		//Pair
		int pair = (n-1) * Call(n-2);
		
		return single+pair;
	}
	
   public static void main(String args[]) {
	   System.out.println(Call(4));
   }
}

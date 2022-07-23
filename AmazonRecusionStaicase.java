import java.util.*;
public class AmazonRecusionStaicase {
	public static int Num(int n) {
		if(n==0) {
			return 1;
		}
		if(n==1) {
			return 1;
		}
		// One Step
		int one = Num(n-1);
		// Two Step
		int two = Num(n-2);
		
		return one+two;
	}
	
	
   public static void main(String args[]) {
	   System.out.println(Num(4));
   }
}

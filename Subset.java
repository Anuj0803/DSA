import java.util.*;
public class Subset {
	public static void Sub(int n , ArrayList<Integer> arr) {
		if(n==0) {
			System.out.println(arr);
			return;
		}
		//Wants
		 arr.add(n);
		 Sub(n-1, arr);
		 
		//not wants
		 arr.remove(arr.size()-1);
		Sub(n-1, arr);
	}
	
   public static void main(String arga[]) {
	   ArrayList<Integer> arr = new ArrayList<Integer>();
	   Sub(3,arr);
   }
}

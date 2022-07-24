import java.util.*;
public class AmazonSde1 {
	static int count =0 ;
	public static int Number(int arr[] , int n  , int index ,int beg ) {
		if(index==arr.length) {
			return 1;
		}
		if(beg<arr.length) {
			if(arr[index]+arr[beg]< n ) {
				count++;
				System.out.print("["+arr[index]+"," +arr[beg]+"]");
			}
				 Number(arr, n, index , beg+1);
		}
		else {
			Number(arr, n , index+1 ,index+2);
		}
		return count;
	}
   public static void main(String args[]) {
	   int arr[] = {1,6,10,7,5,9};
	   System.out.println("Number of pairs = "+Number(arr, 16 ,0 ,1));
   }
}

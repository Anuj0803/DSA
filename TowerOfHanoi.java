import java.util.*;
public class TowerOfHanoi {
   public static void TowerHanoi(int n , String src , String Helper , String Des) {
	   if(n==1) {
		   System.out.println("Transfer Disk "+n+" from " +src+" to "+Des);
		   return;
	   }
	   
	   TowerHanoi(n-1, src, Des, Helper);
	   System.out.println("Transfer Disk "+n+" from " +src+" to "+Des);
	   TowerHanoi(n-1, Helper, src, Des);
   }
	
	public static void main(String args[]) {
	   int n=3;
	   TowerHanoi(n, "source", "helper", "Destination");
   }
}

import java.util.*;
public class Maze {
	public static int mazecount(int i , int j ,int n ,int m) {
		if(i==n || j==m) {
			return 0 ;
		}
	   if(i==n-1 && j==m-1){
		return 1;
	  }	
		//downward
		int downPath = mazecount(i+1, j, n, m);
		//right
		int rightPath =mazecount(i, j+1, n, m);
		
		return downPath +rightPath;
	}
   public static void main(String args[]) {
	   int n =3, m=3;
	   int total = mazecount(0, 0, n, m);
	   System.out.println(total);
   }
}

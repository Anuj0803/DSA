import java.util.*;
public class Tiles {
	public static int tile(int n ,int m ) {
		if(n==m) {
			return 2;
		}
		if(n<m) {
			return 1;
		}
		//vertically 
		int vertCount = tile(n-m, m);
		//Horizontal
		int horiCount = tile(n-1, m);
		
		return vertCount + horiCount;
	}
    public static void main(String args[]) {
    	System.out.println(tile(4, 2));
    }
}

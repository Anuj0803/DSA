import java.util.*;
public class nPowerx {
    public static int nPowerX(int x , int n ) {
    	if(n==0) {
    		return 1;
    	}
    	if(x==0) {
    		return 0;
    	}
    	int pow = nPowerX(x, n-1);
    	int result = x * pow ;
    	return result;
    }
    public static void main(String args[]) {
    	System.out.println(nPowerX(3,4));
    }
}

import java.awt.SecondaryLoop;
import java.util.*;
public class Fabonacci {
    public static void Fabo(int a,int b ,int n) {
    	if(n==0) {
    		return;
    	}
    	int s = a+b;
    	System.out.println(s);
    	Fabo(b, s, n-1);
    }
    public static void main(String args[]) {
	    int a = 0;
	    int b =1;
	    System.out.println(a);
	    System.out.println(b);
	    int n =10;
		Fabo(a,b,n-2);
	}
}

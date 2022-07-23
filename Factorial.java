import java.util.*;
public class Factorial {
   public static int Fac(int n) {
	   if(n==1) {
		   return 1;
	   }
	   int fac_num1 =Fac(n-1);
	   int fac = n*fac_num1;
	   return fac;
	   
   }
   public static void main(String args[]) {
	   System.out.println(Fac(5));
	   
   }
}

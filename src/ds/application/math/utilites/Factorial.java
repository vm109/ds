package ds.application.math.utilites;

public class Factorial {
 public static long getFactorialOfNumber(long number) {
	 long factorial = 1;   
	 for(long i=number;i>=1;i--) {
		 factorial = factorial*i;
	 }
	 return factorial;
 }
}

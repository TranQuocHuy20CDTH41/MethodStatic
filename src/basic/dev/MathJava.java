package basic.dev;
import java.util.Scanner;
public class MathJava {
	/**
	 * Ham tinh exp x
	 * @param x
	 * @return exp(x)
	 */
	public static double exp(double x) {
		int n = 0, k = 5;
		double prev, current = 0;
		double esp = Math.pow(10, -k);
		prev = current;
		current += Math.pow(x, n) / factorial(n, 1);
		while(Math.abs(current - prev) > esp) {
			n++;
			prev = current;
			current += Math.pow(x, n) / factorial(n,1);
		}
		return current;
	}
	
	/**
	 * ham tinh 1/(1+x)^3
	 * @param x
	 * @return 1/(1+x)^3
	 */
	public static double caub(double x) {
		int n = 0, k = 5;
		double prev, current = 0;
		int sign = 1;
		double esp = Math.pow(10, -k);
		prev = current;
		current += sign * Math.pow(x, n) * ((n+1)*(n+2))/2;
		
		while(Math.abs(current - prev) >= esp) {
			sign = -sign;
			n++;
			prev = current;
			current += sign * Math.pow(x, n) * ((n+1)*(n+2))/2;
		}
		return current;
	}
	
	/**
	 * Ham tinh ln(1-x)
	 * @param x
	 * @return Ln(1-x)
	 */
	public static double log(double x) {
		int n = 0, k = 5;
		double esp = Math.pow(10, -k);
		double prev, current = 0;
		prev = current;
		current -= (Math.pow(x, n+1) / (n+1));
		while(Math.abs(prev - current) >= esp) {
			n++;
			prev = current;
			current -= (Math.pow(x, n+1) / (n+1));
		}
		return current;
	}
	/**
	 * Ham tinh 1/sqrt(1+x)
	 * @param x
	 * @return 1/sqrt(1+x)
	 */
	
	public static double sqrtoneplusx( double x) {
		int n = 1 , sign = -1 , k = 6;
		double esp = Math.pow(10, -k);
		double prev, current = 1;
		prev = current;
		current += sign * Math.pow(x, n) * factorial(2*n-1, 2) / factorial(2*n,2);
		
		while(Math.abs(current - prev) > esp) {
			n++;
			sign = -sign ;
			prev = current;
			current += sign * Math.pow(x, n) * factorial(2*n-1, 2) / factorial(2*n,2);	
		}
		return current;
	}
	/**
	 * sin(x)
	 * @param x
	 * @return sin(x)
	 */
	public static double sin(double x) {
		int sign = 1, n = 1 , k = 5;
		double prev, current = 0;
		double esp = Math.pow(10, -k);
		prev = current;
		current += sign*Math.pow(x, n)/factorial(n,1);
		while(Math.abs(prev - current) >= esp) {
			sign = -sign;
			n +=2;
			prev = current;
			current += sign*Math.pow(x, n)/factorial(n,1);
		}
		return current;
	}
	/**
	 * Cos(x)
	 * @param x
	 * @return cos(x)
	 */
	public static double cos(double x) {
		int sign = 1, n = 0 , k = 5;
		double prev, current = 0;
		double esp = Math.pow(10, -k);
		prev = current;
		current += sign*Math.pow(x, n)/factorial(n);
		while(Math.abs(prev - current) >= esp) {
			sign = -sign;
			n += 2;
			prev = current;
			current += sign*Math.pow(x, n)/factorial(n);
		}
		return current;
	}
	private static long factorial(int n, Integer ...params) {
		
		int step = params.length == 0 ? 1 : params[0].intValue();
		if(n == 0 || n == 1) 
			return 1;
		return n *  factorial(n - step, step);
	}
}

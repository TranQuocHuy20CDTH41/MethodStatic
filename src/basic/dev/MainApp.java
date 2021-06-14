package basic.dev;
import java.util.Scanner;

import com.sun.net.httpserver.Authenticator.Result;

public class MainApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap x = ");
		double x = sc.nextDouble();
		System.out.println("Bai so 1:");
		System.out.format("Exp(%f) = %.3f", x, MathJava.exp(x)).println();
		System.out.format("Exp(%f) = %.3f", x, Math.exp(x)).println();
		
		System.out.println("Bai so 2:");
		System.out.format("1/(1+%f)^3 = %.3f", x, MathJava.caub(x)).println();
		System.out.format("Exp(%f) = %.3f", x, 1/Math.pow(1+x, 3)).println();
		
		System.out.println("Bai so 3:");
		System.out.format("ln(1 - %f) = %.3f", x, MathJava.log(x)).println();
		System.out.format("ln(1 - %f) = %.3f", x, Math.log(x)).println();
		
		System.out.println("Bai so 5:");
		System.out.format("1/sqrt(1+%f) = %.3f", x, MathJava.sqrtoneplusx(x)).println();
		System.out.format("1/sqrt(1+%f) = %.3f", x, 1/Math.sqrt(1+x)).println();
		
		System.out.println("Bai so 6:");
		System.out.format("sin(%f) = %.3f", x, MathJava.sin(x)).println();
		System.out.format("sin(%f) = %.3f", x, Math.sin(x)).println();
		
		System.out.println("Bai so 7:");
		System.out.format("cos(%f) = %.3f", x, MathJava.cos(x)).println();
		System.out.format("cos(%f) = %.3f", x, Math.cos(x)).println();
	}
}

package step10;

import java.util.Scanner;

public class _01 {

	public static int factorial(int n) {
		if(n == 1 || n == 0)
			return 1;
		int r1 = n * factorial(n-1);
		return r1;
	}
	
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		int result = factorial(n);
		System.out.println(result);
	}

}

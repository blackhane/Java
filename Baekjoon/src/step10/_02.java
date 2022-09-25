package step10;

import java.util.Scanner;

public class _02 {

	public static int fibo(int n) {
		if(n == 0)
			return 0;
		if(n == 1)
			return 1;
		int r1 = fibo(n-1) + fibo(n-2);
		return r1;
	}
	
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		int result = fibo(n);
		System.out.println(result);
	}

}

package step02;

import java.util.Scanner;

/*
 * 날짜 : 2022 08 19
 * 이름 : 박진휘
 * 내용 : 코딩테스트 2-7 주사위 세개
 */
public class _07 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int y = sc.nextInt();
		int z = sc.nextInt();
		
		if(x == y && x == z) {
			System.out.println(10000 + (x * 1000));
		}
		else if(x == y || x == z) {
			System.out.println(1000 + (x * 100));
		}
		else if(y == z) {
			System.out.println(1000 + (y * 100));
		}
		else {
			if(x > y && x > z) {
				System.out.println(x * 100);
			}
			else if(y > x && y > z) {
				System.out.println(y * 100);
			}
			else {
				System.out.println(z * 100);
			}
		}
		
		sc.close();
	}

}

package sub4;
/*
 * 날짜 : 2022/08/18
 * 이름 : 박진휘
 * 내용 : Java 조건문 실습하기
 */
public class WhileTest {

	public static void main(String[] args) {

		//1부터 10까지 합
		int i = 1;
		int sum = 0;
		while(i <= 10) {
			sum += i;
			i++;
		}
		System.out.println("1부터 10까지의 합은 : " + sum);
		
		//do while
		int tot = 0;
		int j = 1;
		
		do{
			if(j % 2 == 0) {
				tot += j;
			}
			
			j++;
			
		}while(j <= 10);
		System.out.println("1부터 10까지 짝수의 합은 : " + tot);
		
		//break
		int num = 1;
		
		while(true) {
			
			if(num % 5 == 0 && num % 7 == 0) {
				break;
			}
			num++;
		}
		System.out.println("5와 7의 최소공배수 : " + num);
	
		//continue
		int total = 0;
		int k = 1;
		while(k <= 10) {
			
			k++;
			
			if(k % 2 == 1) {
				continue;
			}
			total += k;
		}
		System.out.println("1부터 10까지 짝수의 합은 : " + total);

	}

}

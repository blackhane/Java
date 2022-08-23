package sub2;
/*
 * 날짜 : 2022 08 22
 * 이름 : 박진휘
 * 내용 : Java 배열 실습하기
 */
public class MultiArrayTest {

	public static void main(String[] args) {
		
		//1차원 배열
		int [] scores = {80, 60, 78, 62, 92};
		int total = 0;
		
		for(int i : scores) {
			total += i;
		}
		System.out.println(total);
		
		//2차원 배열
		int [][] arr2 = {{1,2,3},{4,5,6},{7,8,9}};
		for(int i = 0; i < arr2.length; i++) {
			for(int j = 0; j < arr2[i].length; j++) {
				System.out.print(arr2[i][j] +" ");
			}
			System.out.println();
		}
		System.out.println("-----------------");
		//3차원 배열
		int [][][] arr3 = {
				           {{1,2,3},{4,5,6},{7,8,9}},
						   {{1,2,3},{4,5,6},{7,8,9}},
						   {{1,2,3},{4,5,6},{7,8,9}}
						   };
		for(int i = 0; i < arr2.length; i++) {
			for(int j = 0; j < arr2[i].length; j++) {
				for(int k = 0; k < arr2[j].length; k++) {
					System.out.print(arr3[i][j][k] +" ");
				}
				System.out.println();
			}
			System.out.println("-----------------");
		}
	}

}

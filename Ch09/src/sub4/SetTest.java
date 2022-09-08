package sub4;

import java.util.HashSet;

/*
 * 날짜 : 2022 09 08
 * 이름 : 박진휘
 * 내용 : Set 실습
 */
public class SetTest {

	public static void main(String[] args) {

		//집합 생성
		HashSet<Integer> set = new HashSet<>();
		
		set.add(1);
		set.add(2);
		set.add(3);
		set.add(4);
		set.add(5);
		set.add(1);
		set.add(2);
		set.add(3);
		
		//집합 개수
		System.out.println();
		
		//집합 출력
		System.out.println(set);
		
		for(int n : set) {
			System.out.print(n + " ");
		}
		
	}

}

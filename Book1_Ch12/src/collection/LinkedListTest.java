package collection;

import java.util.LinkedList;

public class LinkedListTest {

	public static void main(String[] args) {
		
		LinkedList<String> myList = new LinkedList<String>();
	
		//Linked 리스트 요소 추가
		myList.add("A");
		myList.add("B");
		myList.add("C");
		
		System.out.println(myList);
		
		//Linked 리스트 첫 번째 위치에 D 추가
		myList.add(1,"D");
		System.out.println(myList);
		
		//연결 리스트의 맨 앞에 0 추가
		myList.addFirst("0");
		System.out.println(myList);
		
		//연결 리스트의 맨 뒤 요소 삭제 후 해당 요소를 출력
		System.out.println(myList.removeLast());
		System.out.println(myList);
	}
}

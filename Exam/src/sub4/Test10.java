package sub4;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/*
 * 날짜 : 2022 09 16
 * 이름 : 박진휘
 * 내용 : 컬렉션 연습문제
 */
public class Test10 {

	public static void main(String[] args) {

		ArrayList<Apple1> list1 = new ArrayList<>();
		list1.add(new Apple1("파주", 3000));
		list1.add(new Apple1("이천", 3000));
		list1.add(new Apple1("수원", 3000));

		ArrayList<Apple1> list2 = new ArrayList<>();
		list2.add(new Apple1("청주", 3000));
		list2.add(new Apple1("충주", 3000));
		list2.add(new Apple1("단양", 3000));
		
		ArrayList<Apple1> list3 = new ArrayList<>();
		list3.add(new Apple1("밀양", 3000));
		list3.add(new Apple1("함안", 3000));
		list3.add(new Apple1("합천", 3000));
		
		Map<String, ArrayList<Apple1>> map = new HashMap<>();
		map.put("gyeonggi", list1);
		map.put("chunbuk", list2);
		map.put("gyungnam", list3);
		
		List<Apple1> list = map.get("gyeonggi");
		Apple1 apple = list.get(2);
		apple.show();
		
		map.get("chunbuk").get(1).show();
		map.get("gyungnam").get(0).show();
	}
}

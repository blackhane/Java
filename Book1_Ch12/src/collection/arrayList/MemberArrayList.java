package collection.arrayList;

import java.util.ArrayList;
import java.util.Iterator;

import collection.Member;

public class MemberArrayList {
	//ArrayList 선언
	private ArrayList<Member> arrayList;

	public MemberArrayList() {
		//Member형으로 선언한 ArrayList
		arrayList = new ArrayList<Member>();
	}
	
	//ArrayList에 회원을 추가하는 메서드
	public void addMember(Member member) {
		arrayList.add(member);
	}
	
	//ArrayList에 index위치에 회원을 추가하는 메서드
	public void insertMember(Member member, int index) {
		arrayList.add(index, member);
	}
	
	//ArrayList에서 해당 아이디를 가진 회원을 제거하는 메서드
	public boolean removeMember(int memberId) {
		/*
		for(int i = 0; i < arrayList.size(); i++) {
			//get() 메서드로 회원을 순차적으로 가져오기
			Member member = arrayList.get(i);
		*/
		Iterator<Member> ir = arrayList.iterator();
		while(ir.hasNext()) {
			Member member = ir.next();
			int tempId = member.getMemberId();
			if(tempId == memberId) { //회원 아이디가 매개변수와 일치하면
				arrayList.remove(member);      //해당 회원을 삭제
				return true;
			}
		}
		System.out.println(memberId + "가 존재하지 않습니다.");
		return false;
	}
	
	//전체 회원을 출력
	public void showAllMember() {
		for(Member member : arrayList) {
			System.out.println(member);
		}
		System.out.println();
	}
}

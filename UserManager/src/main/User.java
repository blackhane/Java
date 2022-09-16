package main;

public class User {

	//사용자로 부터 아이디, 이름, 전화번호, 나이 데이터를 입력, 출력하는 클래스
	private String uid;
	private String name;
	private String hp;
	private int age;
	
	public String getUid() {
		return uid;
	}
	public void setUid(String uid) {
		this.uid = uid;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public String getHp() {
		return hp;
	}
	public void setHp(String hp) {
		this.hp = hp;
	}
	
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	@Override
	public String toString() {
		return uid + "," + name + "," + hp + "," + age;
	}
	
}

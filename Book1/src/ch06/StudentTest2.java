package ch06;

public class StudentTest2 {

	public static void main(String[] args) {
		StaticTest studentLee = new StaticTest();
		studentLee.setStudentName("이지원");
		System.out.println(StaticTest.getSerialNum());
		System.out.println(studentLee.studentName + " 학번: " + studentLee.studentID);
		
		StaticTest studentSon = new StaticTest();
		studentSon.setStudentName("손수경");
		System.out.println(StaticTest.getSerialNum());
		System.out.println(studentSon.studentName + " 학번: " + studentSon.studentID);
	}

}

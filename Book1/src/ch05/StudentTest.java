package ch05;

public class StudentTest {

	public static void main(String[] args) {
		Student studentAhn = new Student();
		//studentAhn.studentName = "안연수";
		System.out.println(studentAhn.getStudentName());
		
		Student student2 = new Student();
		//student2.studentName = "안승연";
		System.out.println(student2.getStudentName());
	}

}

package ch06;

public class StudentTest {

	public static void main(String[] args) {

		Student studentRyu = new Student();
		
		System.out.println(studentRyu.showStudentInfo());
		
		Student studentKim = new Student(123456, "Kim", 3);
		System.out.println(studentKim.showStudentInfo());
	}

}
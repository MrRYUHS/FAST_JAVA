package ch04;

public class StudentTest {

	public static void main(String[] args) {

		Student studentRyu = new Student();
		studentRyu.studentID = 12345;
		studentRyu.setStudentName("Ryu");
		studentRyu.address = "대구";
		
		studentRyu.showStudentInfo();
		
		Student studentKim = new Student();
		studentKim.studentID = 67890;
		studentKim.studentName = "Kim";
		studentKim.address = "칠곡";
		
		studentKim.showStudentInfo();
		
		System.out.println(studentRyu);
		System.out.println(studentKim);
	}

}

package ch24;

public class StudentTest {

	public static void main(String[] args) {

		Student studentRyu = new Student(1001, "형수");
		
		studentRyu.addSubject("국어", 100);
		studentRyu.addSubject("수학", 100);
		studentRyu.addSubject("영어", 100);
		
		Student studentKim = new Student(1002, "혜린");
		
		studentKim.addSubject("국어", 100);
		studentKim.addSubject("수학", 100);
		studentKim.addSubject("영어", 100);
		
		studentRyu.showScoreInfo();
		System.out.println("==========================================");
		studentKim.showScoreInfo();
	}

}

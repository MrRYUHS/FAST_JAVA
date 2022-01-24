package ch09;

public class SubjectTest {

	public static void main(String[] args) {

		Student studentRyu = new Student(100, "Ryu");
		studentRyu.setKoreaSubject("국어", 100);
		studentRyu.setMathSubject("수학", 100);
		
		Student studentKim = new Student(101, "Kim");
		studentKim.setKoreaSubject("국어", 100);
		studentKim.setMathSubject("수학", 100);
		
		studentRyu.showScoreInfo();
		studentKim.showScoreInfo();
	}

}

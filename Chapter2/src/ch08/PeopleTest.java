package ch08;

public class PeopleTest {

	public static void main(String[] args) {

		People peopleRyu = new People();
		System.out.println(peopleRyu.showStudentInfo());
		
		People peopleR = new People(171, 71, "남성", "Ryu", 31);
		System.out.println(peopleR.showStudentInfo());
	}

}

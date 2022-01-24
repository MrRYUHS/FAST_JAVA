package ch08;

public class PersonTest {

	public static void main(String[] args) {

		Person personRyu = new Person();
		personRyu.height = 171;
		personRyu.weight = 71;
		personRyu.gender = "남성";
		personRyu.name = "Ryu";
		personRyu.age = 31;
		
		personRyu.showPersonInfo();
		
	}
	

}

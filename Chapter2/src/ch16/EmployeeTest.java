package ch16;

public class EmployeeTest {

	public static void main(String[] args) {

		Employee employeeRyu = new Employee();
		employeeRyu.setEmployeeName("류형수");
		
		System.out.println(employeeRyu.serialNum);
		System.out.println(Employee.serialNum);
		
		Employee employeeKim = new Employee();
		employeeKim.setEmployeeName("김혜린");
		
		Employee employeeKang = new Employee();
		employeeKang.setEmployeeName("강민주");
		
		System.out.println(employeeRyu.getEmployeeName() + "님의 사번은 " + employeeRyu.getEmployeeId());
		System.out.println(employeeKim.getEmployeeName() + "님의 사번은 " + employeeKim.getEmployeeId());
		System.out.println(employeeKang.getEmployeeName() + "님의 사번은 " + employeeKang.getEmployeeId());
		
	}

}

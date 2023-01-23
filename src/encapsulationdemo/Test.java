package encapsulationdemo;

public class Test {
	public static void main(String[] args) {
		
		Employee emp1  = new Employee();
		
		emp1.setName("Arun");
		emp1.setId("01515");
	//	emp1.setOrgName("TCS");
		emp1.setAge(200);
		
		System.out.println(emp1.getName());
		System.out.println(emp1.getId());
		System.out.println(emp1.getOrgName());
		System.out.println(emp1.getAge());
	}

}
